package Traversal;

public class Tree_preOrder {
    private Object root;
    Tree_preOrder left;
    Tree_preOrder right;
    
    public Tree_preOrder(Object root){
        this.root = root;
    }

    public Tree_preOrder(Object root, Tree_preOrder left, Tree_preOrder right){
        this.root = root;
        this.left = left;
        this.right = right;
    }
    public Object getRoot(){return this.root;}
    public Tree_preOrder getLeft(){return this.left;}
    public Tree_preOrder getRight(){return this.right;}

    public void setRoot(Object root){this.root = root;}
    public void setLeft(Tree_preOrder left){this.left = left;}
    public void setRight(Tree_preOrder right){this.right = right;}


public String preOreder() {
    StringBuffer sb = new StringBuffer();
    sb.append(root);  

    if (left != null) {
        sb.append(" ").append(left.preOreder());       
    }
    if (right != null) {
        sb.append(" ").append(right.preOreder());      
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
 * answer : A B D E C G F H I
 */

    public static void main(String[] args) {
        Tree_preOrder D = new Tree_preOrder("D");
        Tree_preOrder E = new Tree_preOrder("E");
        Tree_preOrder G = new Tree_preOrder("G");
        Tree_preOrder H = new Tree_preOrder("H");
        Tree_preOrder I = new Tree_preOrder("I");
        Tree_preOrder F = new Tree_preOrder("F",H,I);
        Tree_preOrder C = new Tree_preOrder("C",G,F);
        Tree_preOrder B = new Tree_preOrder("B",D,E);
        Tree_preOrder A = new Tree_preOrder("A",B,C);

        System.out.print(A.preOreder());
    }
}

    

