public class ArrayDriver{

    public static void main(String[] args){
	MyStackArray stack = new MyStackArray();
	System.out.println(stack);
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	stack.push("five");
	stack.push("six");
	stack.push("seven");
	stack.push("eight");
	stack.push("nine");
	stack.push("ten");
	stack.push("eleven");
	stack.push("twelve");
	System.out.println(stack);
	System.out.println(stack.peek());
	stack.pop();
	System.out.println(stack);
	stack.pop();
	System.out.println(stack.isEmpty());
    }

}
