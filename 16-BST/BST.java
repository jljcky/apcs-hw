public class BST{
    private Node root;

    public BST(){
	root = null;
    }

    public void insert(Node n){
	if (root == null)
	    root = n;
	else{
	    Node temp = root;
	    while (temp != null){
		if (n.getData() < temp.getData())
		    temp = temp.getLeft();
		else
		    temp = temp.getRight();
	    }
	    temp = n;
	}
    }

    public Node search(int x){
	Node temp = root;
	while (temp != null && temp.getData() != x){
	    if (x < temp.getData())
		temp = temp.getLeft();
	    else
		temp = temp.getRight();
	}
	return temp;
    }

    public Node search2(Node c, int x){
        if (c == null)
	    return null;
	else if (c.getData() == x)
	    return c;
	else{
	    if (x < c.getData())
		search(c.getLeft(),x);
	    else
		search(c.getRight(),x);
	}
	
    }

}
    
