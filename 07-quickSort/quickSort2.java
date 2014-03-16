import java.util.*;

public class quickSort2{

    Random rand = new Random();

    public int[] quickSort2(int[] a, int L, int R){
	if (a.length <= 1)
	    return a;
	else if (L >= R)
	    return a;
	else{
	    int pos = partition(a,L,R);
	    quickSort2(a,L,pos-1);
	    quickSort2(a,pos+1,R);
	    return a;
	}
    }

    public int partition(int[] a, int L, int R){
	int wall = L;
	int pivotInd = rand.nextInt(R-L) + L;
	int pivot = a[pivotInd];
	swap(a,pivotInd,R);
	for (int i = L; i < R; i++){
	    if (a[i] < pivot){
	        swap(a,wall,i);
		wall++;
	    }
	}
	swap(a,wall,R);
	return wall;
    }

    public void swap(int[] a, int c1, int c2){
	int temp = a[c1];
	a[c1] = a[c2];
	a[c2] = temp;
    }

    public String toString(int[] a){
	String str = "";
	for (int i = 0; i < a.length; i++)
	    str += a[i] + ", ";
	return str;
    }

    public static void main(String[] arg){
	quickSort2 qS = new quickSort2();

	int[] a = {10,98,32,47,50,19,28,37,5,91,23,45,1,69,28,37,47,85,60,19,27,83,12,34};
	
	System.out.println(qS.toString(qS.quickSort2(a,0,a.length-1)));
    }

}
