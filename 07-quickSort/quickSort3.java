import java.util.*;

public class quickSort3{

    Random rand = new Random();

    public int[] quickSort3(int[] a){
	return quickSort3(a,0,a.length-1);
    }

    public int[] quickSort3(int[] a, int L, int R){
	if (a.length <= 1)
	    return a;
	else if (L >= R)
	    return a;
	else{
	    int pos = partition(a,L,R);
	    quickSort3(a,L,pos-1);
	    quickSort3(a,pos+1,R);
	    return a;
	}
    }

    /*
      Modify your partition routine so that it groups duplicate pivots together following the technique we outlined in class. 
      Remember, after the first part of the partition, we have L, R, and Wall with L and R being the bounds, and Wall being the index one past all the elements lower than the pivot. 
      The new algorithm is: 
      a. Start j at Wall, and RWall (Right Wall) at Wall. 
      b. Loop j up to R 
      c. if A[j] == Pivot, swap A[j] and A[RWall] and increment RWall. 
      d. when done, return (rwall+lwall)/2
    */

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
	int wall2 = wall;
	for (int j = wall; j < R; j++){
	    if (a[j] == pivot){
		swap(a,wall2,j);
		wall2++;
	    }
	}
	swap(a,wall,R);
	return (wall2+wall)/2;
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
	quickSort3 qS = new quickSort3();
	Random ran = new Random();
	
	int[] a = new int[100000];
	for (int i = 0; i < 100000; i++)
	    a[i] = ran.nextInt(100);

	System.out.println(qS.toString(qS.quickSort3(a)));
    }
}
