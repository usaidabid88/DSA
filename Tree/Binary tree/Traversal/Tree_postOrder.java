public class Tree_postOrder {

    private Object root;
    Tree_postOrder left;
    Tree_postOrder right;

    public Tree_postOrder(Object root){
        this.root = root;
    }
    public Tree_postOrder(Object root, Tree_postOrder left, Tree_postOrder right){
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Object getRoot(){return this.root;}
    public Tree_postOrder getLeft(){return this.left;}
    public Tree_postOrder getRight(){return this.right;}

    public void setRoot(Object root){this.root = root;}
    public void setLeft(Tree_postOrder left){this.left = left;}
    public void setRight(Tree_postOrder right){this.right = right;}

    public String postOrder(){
        StringBuffer sb = new StringBuffer();

        if(left != null){
            sb.append(left.postOrder()).append(" ");
        }
        if(right != null){
            sb.append(right.postOrder()).append(" ");
        }

        sb.append(root);

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
 * answer : D E B G H I F C A 
 */

    public static void main(String[] args) {
        Tree_postOrder D = new Tree_postOrder("D");
        Tree_postOrder E = new Tree_postOrder("E");
        Tree_postOrder G = new Tree_postOrder("G");
        Tree_postOrder H = new Tree_postOrder("H");
        Tree_postOrder I = new Tree_postOrder("I");
        Tree_postOrder F = new Tree_postOrder("F",H,I);
        Tree_postOrder C = new Tree_postOrder("C",G,F);
        Tree_postOrder B = new Tree_postOrder("B",D,E);
        Tree_postOrder A = new Tree_postOrder("A",B,C);

        System.out.print(A.postOrder());
    }

    
}