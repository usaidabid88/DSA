package Traversal;

public class Tree_inOrder {

    private Object root;
    Tree_inOrder left;
    Tree_inOrder right;

    public Tree_inOrder(Object root){
        this.root = root;
    }
    public Tree_inOrder(Object root, Tree_inOrder left, Tree_inOrder right){
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Object getRoot(){return this.root;}
    public Tree_inOrder getLeft(){return this.left;}
    public Tree_inOrder getRight(){return this.right;}

    public void setRoot(Object root){this.root = root;}
    public void setLeft(Tree_inOrder left){this.left = left;}
    public void setRight(Tree_inOrder right){this.right = right;}

    public String inOrder(){ // left -> root -> right
        StringBuffer sb = new StringBuffer();

        if(left != null){
            sb.append(left.inOrder()).append(" ");
        }
        sb.append(root);

        if(right != null){
            sb.append(" ").append(right.inOrder());
        }

        return sb.toString();
    }
    
/* 
 *       A
 *      / \
 *     B   C
 *    / \ / \
 *   D  E G  F
 *          / \
 *         H   I
 * answer : D B E A G C H F I 
 */

    public static void main(String[] args) {
        Tree_inOrder D = new Tree_inOrder("D");
        Tree_inOrder E = new Tree_inOrder("E");
        Tree_inOrder G = new Tree_inOrder("G");
        Tree_inOrder H = new Tree_inOrder("H");
        Tree_inOrder I = new Tree_inOrder("I");
        Tree_inOrder F = new Tree_inOrder("F",H,I);
        Tree_inOrder C = new Tree_inOrder("C",G,F);
        Tree_inOrder B = new Tree_inOrder("B",D,E);
        Tree_inOrder A = new Tree_inOrder("A",B,C);

        System.out.print(A.inOrder());
    }
}
    