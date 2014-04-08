import java.util.*;
import java.io.*;

public class RPN{

    MyStackArray stack = new MyStackArray();

    private void add(){
	if (stack.size() < 2)
	    return;
	stack.push(stack.pop()+stack.pop());
    }

    private void substact(){
	if (stack.size() < 2)
	    return;
	stack.push((stack.pop()-stack.pop())*-1.0);
    }

    private void multiply(){
	if (stack.size() < 2)
	    return;
	stack.push(stack.pop()*stack.pop());
    }
    
    private void divide(){
	if (stack.size() < 2)
	    return;
	double d1 = stack.pop();
	double d2 = stack.pop();
	stack.push(d2/d1);
    }

    public static void main(String[] args){

    }

}
