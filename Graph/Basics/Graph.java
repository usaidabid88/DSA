package Graph.Basics;

public class Graph {
    int size;
    String[] vertices;
    boolean[] [] a; 
    
    public Graph(String [] arge){
        size = arge.length;
        vertices = new String[size];
        System.arraycopy(arge, 0, vertices, 0, size);
        a = new boolean[size][size];
    }

    public void add(String v, String w){
        int i = index(v), j = index(w);
        a[i][j] = a[j][i] = true;
    }

    public String toString(){
        if(size == 0)return ".";
        StringBuffer buf = new StringBuffer( " "  + vertex(0));
        for(int i = 0; i < size; i ++)
            buf.append(" " + vertex(i));
        return buf + " ";
    }

    private int index(String v){
        for(int i = 0; i < size; i++)
            if(vertices[i].equals(v)) return i;
        return a.length;
    }

    private String vertex(int i){
        StringBuffer buf = new StringBuffer(vertices[i] + ":");
        for(int j = 0; j < size; j++)
            if(a[i][j]) buf.append(vertices[j]);
        return buf + "";
    }

    public static void main(String[] args){
        String [] arge = {"A", "B", "C", "D", "E"};
        Graph EX = new Graph(arge);
        EX.add("A", "B");
        EX.add("A", "C");
        EX.add("B", "D");
        EX.add("C", "D");
        EX.add("D", "E");
        System.out.println(EX);
    }

}
