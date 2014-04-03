public class MyLinkedList{
    private Node head;
    private Node tail;

    /*
      change add so that it adds at the end of the list (in either implementation)
      modify one of your LL implementations to add a tail pointer
     */

    public MyLinkedList(){
	head = new Node("");
	tail = head;
	
    }

    public String toString(){
	//returns the entire list into string
	String list = "";
	Node tmp = head.getNext();
	while (tmp != null){
	    list += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return list;
    }

    public void add(String d){
	Node tmp = new Node(d);
	tail.setNext(tmp);
	tail=tmp;
    }

    public void add(int i, String s){
	//adds s at location i, exception if you try to add past the end
	if (i < 0 || i >= length())
	    return;
        else if (i == 0){
	    Node tmp = new Node(s);
	    tmp.setNext(head);
	    head = tmp;
	}else{
	    Node tmp = head;
	    for (; i > 1; i--)
		tmp = tmp.getNext();
	    Node added = new Node(s);
	    added.setNext(tmp.getNext());
	    tmp.setNext(null);
	    tmp.setNext(added);
	}
    }

    public String get(int i){
	//returns the string at location i, exception if i is past the end
	if (i < 0 || i >= length())
	    return "index out of bounds";
	else{
	    Node tmp = head;
	    for (; i > 0; i--)
		tmp = tmp.getNext();
	    return ""+tmp;
	}
    }

    public String set(int i, String s){
	//changes the value at location i to s, Returns the old value, exception if i is off the end
	if (i < 0 || i >= length())
	    return "index out of bounds";
	else if(i == 0){
	    Node removed = head;
	    head.setData(s);
	    return ""+removed;
	}else{
	    Node tmp = head;
	    for(; i > 0; i--)
		tmp = tmp.getNext();
	    Node removed = tmp;
	    tmp.setData(s);
	    return ""+removed;
	}
    }

    public String remove(int i){
	//removes and returns the string at i, exception on error
	if (i < 0 || i >= length())
	    return "index out of bounds";
	else if (i == 0){
	    Node removed = head;
	    head = head.getNext();
	    removed.setNext(null);
	    return ""+removed;
	}else{
	    Node first = head;
	    for (; i > 1; i--)
		first = first.getNext();
	    Node removed = first.getNext();
	    first.setNext(null);
	    first.setNext(removed.getNext());
	    removed.setNext(null);
	    return ""+removed;
	}
    }

    public int find(String s){
	//returns the location of the first string in the list with String s, exception on error
	int index = 0;
	Node tmp = head;
	while (index < length()){
	    if (!(""+tmp).equals(s)){
		tmp = tmp.getNext();
		index++;
	    }else
		return index;
	}
	return -1;
    }
    
    public int length(){
	//returns the number of elements in the list
	int l = 0;
	Node tmp = head;
	while (tmp != null){
	    l++;
	    tmp = tmp.getNext();
	}
	return l-1;
    }

}
