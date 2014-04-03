import java.util.*;
import java.io.*;

public class LLIterator<E> implements Iterator{

    public boolean hasNext(){
	return false;
    }

    public Node<E> next(){
	return new Node<E>((E)"");
    }
    
    public void remove(){
    }

}
