import java.util.*;
import java.io.*;

public class MyLinkedList<E> implements Iterable{
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList(){
	head = new Node("");
	tail = head;
	
    }

    public String toString(){
	//returns the entire list into string
	String list = "";
	Node<E> tmp = head.getNext();
	while (tmp != null){
	    list += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return list;
    }
    public void add(E d){
	Node<E> tmp = new Node((E)"");
	tail.setNext(tmp);
	tail=tmp;
    }
    
    public void add(int i, E s){
	//adds s at location i, exception if you try to add past the end
	if (i < 0 || i >= length())
	    return;
        else if (i == 0){
	    Node<E> tmp = new Node(s);
	    tmp.setNext(head);
	    head = tmp;
	}else{
	    Node<E> tmp = head;
	    for (; i > 1; i--)
		tmp = tmp.getNext();
	    Node<E> added = new Node(s);
	    added.setNext(tmp.getNext());
	    tmp.setNext(null);
	    tmp.setNext(added);
	}
    }

    public E get(int i){
	//returns the string at location i, exception if i is past the end
	if (i < 0 || i >= length())
	    return (E)"index out of bounds";
	else{
	    Node<E> tmp = head;
	    for (; i > 0; i--)
		tmp = tmp.getNext();
	    return tmp.getData();
	}
    }

    public E set(int i, E s){
	//changes the value at location i to s, Returns the old value, exception if i is off the end
	if (i < 0 || i >= length())
	    return (E)"index out of bounds";
	else if(i == 0){
	    Node<E> removed = head;
	    head.setData(s);
	    return removed.getData();
	}else{
	    Node<E> tmp = head;
	    for(; i > 0; i--)
		tmp = tmp.getNext();
	    Node<E> removed = tmp;
	    tmp.setData(s);
	    return removed.getData();
	}
    }

    public E remove(int i){
	//removes and returns the string at i, exception on error
	if (i < 0 || i >= length())
	    return (E)"index out of bounds";
	else if (i == 0){
	    Node<E> removed = head;
	    head = head.getNext();
	    removed.setNext(null);
	    return removed.getData();
	}else{
	    Node<E> first = head;
	    for (; i > 1; i--)
		first = first.getNext();
	    Node<E> removed = first.getNext();
	    first.setNext(null);
	    first.setNext(removed.getNext());
	    removed.setNext(null);
	    return removed.getData();
	}
    }

    public int find(E s){
	//returns the location of the first string in the list with String s, exception on error
	int index = 0;
	Node<E> tmp = head;
	while (index < length()){
	    if (!tmp.getData().equals(s)){
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

    public LLIterator<E> iterator(){
	return new LLIterator();
    }

}
