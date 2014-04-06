public class MyStackArray{

    private int index;
    private String[] stackList;

    public MyStackArray(){
	stackList = new String[10];
	index = 0;
    }
    
    public void push(String str){
	stackList[index] = str;
	index++;
    }

    public String pop(){
	index--;
	return stackList[index+1];
    }

    public String peek(){
	return stackList[index-1];
    }

    public boolean isEmpty(){
	return index == 0;
    }

    public String toString(){
	String str = "";
	for (int i = 0; i < index; i++){
	    str += stackList[i] + ", ";
	}
	return str;
    }

}
