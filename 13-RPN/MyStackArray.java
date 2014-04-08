public class MyStackArray{

    private int index;
    private double[] stackList;

    public MyStackArray(){
	stackList = new double[10];
	index = 0;
    }
    
    public int size(){
	return index;
    }

    public void push(double dbl){
	if (index == stackList.length){
	    double[] tmp = new double[stackList.length*2];
	    for (int i = 0; i < stackList.length; i++){
		tmp[i] = stackList[i];
	    }
	    stackList = tmp;
	}
	stackList[index] = dbl;
	index++;
    }

    public double pop(){
	index--;
	return stackList[index+1];
    }

    public double peek(){
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
