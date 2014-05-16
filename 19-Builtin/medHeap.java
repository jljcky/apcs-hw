import java.util.*;
import java.io.*;

public class medHeap{
    private PriorityQueue minHeap;
    private PriorityQueue maxHeap;
    private int med;
    
    public medHeap(){
	minHeap = new PriorityQueue();
	maxHeap = new PriorityQueue();
	med = 0;
    }

    public void add(int x){ //assuming there are no duplicates
	if (x < med){
	    minHeap.add(x);
	}else if (x > med){
	    maxHeap.add(x);
	}
	update();
    }

    private void update(){
	//update med
	if (minHeap.size()-maxHeap.size() > 1){
	    //remove root of minHeap and insert it into maxHeap
	    int temp = minHeap.peek();
	    minHeap.poll();
	    maxHeap.add(temp);
	}else if (maxHeap.size()-minHeap.size() > 1){
	    //remove root of maxHeap and insert it into minHeap
	    int temp = maxHeap.peek();
	    maxHeap.poll();
	    minHeap.add(temp);
	}
	if (minHeap.size() == maxHeap.size()){
	    med = (minHeap.peek() + maxHeap.peek()) / 2;
	}else if (minHeap.size() > maxHeap.size()){
	    med = minHeap.peek();
	}else{
	    med = maxHeap.peek();
	}
	return med;
    }

    public int findMedian(){
	return med;
    }

    public int removeMedian(){
	if (med == minHeap.peek()){
	    minHeap.poll();
	}else if (med == maxHeap.peek()){
	    maxHeap.poll();
	}else{
	    minHeap.poll();
	    maxHeap.poll();
	}
	int temp = med;
	update();
	return temp;
    }

    public static void main(String[] args){
	medHeap mh = new medHeap();
	
    }
}