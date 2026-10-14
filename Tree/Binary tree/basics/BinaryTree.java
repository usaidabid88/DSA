package basics;

public class BinaryTree {
    private Object root;
    BinaryTree left;
    BinaryTree right;
    
    public BinaryTree(Object root){
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right){
        this.root = root;
        this.left = left;
        this.right = right;
    }
    public Object getRoot(){return this.root;}
    public BinaryTree getLeft(){return this.left;}
    public BinaryTree getRight(){return this.right;}

    public void setRoot(Object root){this.root = root;}
    public void setLeft(BinaryTree left){this.left = left;}
    public void setRight(BinaryTree right){this.right = right;}

/* 
 *       A
 *      / \
 *     B   C
 *        / \
 *       D   E
 */

    public static void main(String[] args) {
        BinaryTree B = new BinaryTree("B");
        BinaryTree D = new BinaryTree("D");
        BinaryTree E = new BinaryTree("E");
        BinaryTree C = new BinaryTree("C",D,E);
        BinaryTree A = new BinaryTree("A",B,C);

        System.out.print(A);
    }
}
