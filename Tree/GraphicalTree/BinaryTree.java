package GraphicalTree; 

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

    public int getKey() { return key; }
    public BinaryTree getLeft() { return left; }
    public BinaryTree getRight() { return right; }
    public int getHeight() { return height; }

    public int size(){
        if(this == NIL){return 0;}
        return 1 + left.size() + right.size();
    }

    public boolean add(int key){
        int oldsize = size();
        grow(key);
        return size() > oldsize;
    }

    public String toString(){
        if(this == NIL) return "";
        return left.toString() + " " + key + " " + right.toString() + " ";
    }

    public BinaryTree grow(int key){
        if(this == NIL) return new BinaryTree(key);
        if(key == this.key) return this; 
        if(key < this.key)
            left = left.grow(key);
        else right = right.grow(key);
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public void print(int depth) {
    if (this == NIL) return;
    right.print(depth + 1);
    System.out.println("    ".repeat(depth) + key);
    left.print(depth + 1);
    }
    public BinaryTree rebalance(){
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

}