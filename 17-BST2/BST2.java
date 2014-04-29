public class BST2{
    private Node root;

    public BST2(){
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

    public void delete(int x){
	Node tmp = search(x);
	Node parent = null;
	if (tmp == null)
	    return;
	else if (tmp.getLeft() == null && tmp.getRight() == null)
	    tmp = null;
	else if (tmp.getLeft() == null){
	    Node tmp1 = tmp.getRight();
	    parent.setRight(tmp1);
	}else if (tmp.getRight() == null){
	    Node tmp1 = tmp.getLeft();
	    parent.setLeft(tmp1);
	}else{
	    Node tmp1 = tmp.getLeft();
	    Node tmp2 = tmp.getRight();
	    // more complications
	    
	}
    }

}
    
