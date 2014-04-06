public class ArrayDriver{

    public static void main(String[] args){
	MyStackArray stack = new MyStackArray();
	System.out.println(stack);
	stack.push("one");
	stack.push("two");
	stack.push("three");
	System.out.println(stack);
	System.out.println(stack.peek());
	stack.pop();
	System.out.println(stack);
	stack.pop();
	System.out.println(stack.isEmpty());
    }

}
