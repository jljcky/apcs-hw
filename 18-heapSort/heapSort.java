public class heapSort
{
    private int[] myArray;
    
    public int[] heapSort(int[] array)
    {
	myArray = new int[array.length];
	for (int i = 0; i < myArray.length; i++){
	    myArray[i] = array[i];
	    int temp = i;
	    while (temp > 0){
		if (myArray[(temp-1)/2] < myArray[temp]){
		    int temp1 = myArray[temp];
		    myArray[temp] = myArray[(temp-1)/2];
		    myArray[(temp-1)/2] = temp1;
		    temp = (temp-1)/2;
		}
		else
		    break;
	    }
	}
	
	for (int i = array.length-1; i >= 0; i--){
	    array[i] = myArray[0];
	    myArray[0] = myArray[i];
	    myArray[i] = 0;
	    int temp = 0;
	    while (2*temp+1 < i){
		if (myArray[temp] > myArray[2*temp+2] &&
		    myArray[temp] > myArray[2*temp+1])
		    break;
		else if (myArray[2*temp+1] > myArray[2*temp+2]){
		    int temp1 = myArray[2*temp+1];
		    myArray[2*temp+1] = myArray[temp];
		    myArray[temp] = temp1;
		    temp = 2*temp+1;
		}
		else if (myArray[2*temp+2] > myArray[2*temp+1]){
		    int temp1 = myArray[2*temp+2];
		    myArray[2*temp+2] = myArray[temp];
		    myArray[temp] = temp1;
		    temp = 2*temp+2;
		}
	    }
	}	
	return array;
    }

    public int getMedian()
    {
	return -1;
    }

    public static void main(String[] args)
    {
	int[] arr = {34,45,76,13,74,23,56};
	heapSort hs = new heapSort();
	arr = hs.heapSort(arr);
	for (int i = 0; i < arr.length; i++)
	    System.out.print(arr[i] + " ");
    }
    
	
}
