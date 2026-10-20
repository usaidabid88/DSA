package AVL; 

public class BinaryTree{

    private int key,height;
    private BinaryTree left, right;

    private BinaryTree(){
        left = right = this;
        height = -1;
    }

    private BinaryTree(int key, BinaryTree left, BinaryTree right){
        this.key = key;
        this.left = left;
        this.right = right;
        this.height = 1 + Math.max(left.height, right.height);
    }

    public BinaryTree(int key){
        this.key = key;
        left = right = NIL;
    }

    public static final BinaryTree NIL = new BinaryTree();

    public int size(){
        if(this == NIL) {return 0;}
        return 1 + left.size() + right.size();
    }

    public boolean add(int key){
        int oldsize = size();
        grow(key);
        return size() > oldsize;
    }

    public String toString(){
        if(this == NIL) return " ";
        return left.toString() + " " + key + " " + right.toString() + " ";
    }

    public BinaryTree grow(int key){
        if(this == NIL) return new BinaryTree(key);
        if(key == this.key) return this; 
        if(key < this.key)
            left = left.grow(key);
        else right = right.grow(key);
        rebalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }
    
    // Every thing was same till here in the Binary Search tree and AVL.
    //  this next method (rebalnce) change it to AVL 

    private void rebalance(){
        if(right.height > left.height + 1){
            if(right.left.height > right.right.height) right.rotateRight();
            rotateLeft();
        }else if(left.height > right.height + 1){
            if(left.right.height > left.left.height) left.rotateLeft();
            rotateRight();
        }
    }

    private void rotateLeft(){
        left = new BinaryTree(key,left,right.left);
        key = right.key;
        right = right.right;
    }

    private void rotateRight(){
        left = new BinaryTree(key,left.right,left);
        key = left.key;
        right = left.left;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);
        tree.add(4);
        tree.add(10);
        tree.add(55);
        System.out.print(tree.toString());
        
    }
}