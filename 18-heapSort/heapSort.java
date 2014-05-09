public class heapSort{

    private int[] myArray;

    public int[] heapSort(int[] array){
	myArray = new int[array.length + 1];
	return array;
    }

    public void insert(int n){
	int index = 1;
	while (myArray[index] != 0)
	    index++;
	myArray[index] = n;
	for (int i = index; i > 1; i--){
	    if (myArray[index] > myArray[index-1])
		swap();
	}
    }

    public void removeMax(){

    }

    public void swap(){

    }
}