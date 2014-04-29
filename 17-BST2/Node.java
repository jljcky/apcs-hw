public class Node{
    private int data;
    private Node left,right;

    public Node(int n){
	left = null;
	right = null;
	data = n;
    }

    public void setLeft(Node n){
	left = n;
    }

    public Node getLeft(){
	return left;
    }

    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
	return right;
    }

    public void setData(int n){
	data = n;
    }
    
    public int getData(){
	return data;
    }

    public String toString(){
	return ""+data;
    }
}
