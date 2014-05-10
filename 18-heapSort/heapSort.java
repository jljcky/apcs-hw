public class heapSort
{
    private int[] myArray;
    private int arrayInd;
    
    public int[] heapSort(int[] array)
    {
	myArray = new int[array.length];
	for (int i = 0; i < array.length; i++)
	    insert(i);
	
    }
    
    private void insert(int index) //places the number in index of array to the index of myArray
    {
	myArray[index] = array[index];
	while (index != 0) {
	    if (myArray[(index-1)/2] < myArray[index]){
		swap(myArray[(index-1)/2], myArray[index]);
		index = (index-1)/2;
	    }else
		break;
	}
    }

    private int removeMax()
    {
    }
    
    
    private void swap(int num1, int num2)
    {
	int temp = num1;
	num1 = num2;
	num2 = num1;
    }
    
    
