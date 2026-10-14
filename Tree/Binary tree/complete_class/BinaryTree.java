package complete_class;


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

    public String preOreder(){ //  root -> left -> right
    StringBuffer sb = new StringBuffer();

    sb.append(root);  

    if (left != null) {
        sb.append(" ").append(left.preOreder());}

    if (right != null) {
        sb.append(" ").append(right.preOreder());}

    return sb.toString();
}

    public String postOrder(){//  left -> right -> root  
    StringBuffer sb = new StringBuffer();

    if(left != null){
        sb.append(left.postOrder()).append(" ");}

    if(right != null){
        sb.append(right.postOrder()).append(" ");}

    sb.append(root);

    return sb.toString();
    }

    public String inOrder(){ // left -> root -> right
    StringBuffer sb = new StringBuffer();

    if(left != null){
        sb.append(left.inOrder()).append(" ");}

    sb.append(root);

    if(right != null){
        sb.append(" ").append(right.inOrder());}

    return sb.toString();
}

public int height(){
    if(root == null){
        return -1;
    }

    int leftsub = 0;
    int rightsub = 0;

    if(left != null){
        leftsub = 1 + left.height();
    }
    if(right != null){
        rightsub = 1 + right.height();
    }
    return leftsub > rightsub ? leftsub : rightsub;
}

/* 
 *       A
 *      / \
 *     B   C
 *    / \ / \
 *   D  E G  F
 *          / \
 *         H   I 
 */
    public static void main(String[] args) {
        BinaryTree D = new BinaryTree("D");
        BinaryTree E = new BinaryTree("E");
        BinaryTree G = new BinaryTree("G");
        BinaryTree H = new BinaryTree("H");
        BinaryTree I = new BinaryTree("I");
        BinaryTree F = new BinaryTree("F",H,I);
        BinaryTree C = new BinaryTree("C",G,F);
        BinaryTree B = new BinaryTree("B",D,E);
        BinaryTree A = new BinaryTree("A",B,C);

        System.out.print(A.preOreder() + "\n");
        System.out.print(A.postOrder() + "\n");
        System.out.print(A.inOrder() + "\n");
        System.out.println("height of tree : " + A.height());
        
    }
}
