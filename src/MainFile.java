
public class MainFile {

	public static void main(String[] args)
	{
		System.out.println("Main of main file!!");
		
		/*This is main fragment of code to 
		 * execute Linked and resizing array
		 * STACK of strings*/
		/*ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings(20);
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("-")){
				if(stack.isEmpty()){
					System.out.println("Stack empty, cannot pop");
				}
				else{
					System.out.print("Element popped is ");
					System.out.println(stack.pop());
				}
								
			}
			else stack.push(s);*/
		
		/*This is main fragment of code to 
		 * execute Linked and resizing array
		 * QUEUE of strings*/
		/*
		LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if(s.equals("-")){
				if(queue.isEmpty()){
					System.out.println("Queue empty, cannot pop");
				}
				else{
					System.out.print("Element Dequeued is ");
					System.out.println(queue.dequeue());
				}
								
			}
			else queue.enqueue(s);
		}*/
		

		/*Executing selection sort
		 * module. It supports 
		 * different data types
		
		Integer[] arr = {199,2,23,22,1,229,2093,11,353,2};;
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}
		
		Insertion.sort(arr);
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}*/
		
		/*Executing SHELL sort
		 * module. It supports 
		 * different data types
		
		Integer[] arr = {199,2,23,22,1,229,2093,11,353,2};;
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}
		
		Insertion.sort(arr);
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}*/

		/*Executing MERGE sort
		 * module. It supports 
		 * different data types*/
		
		Integer[] arr = {199,2,23,22,1,229,2093,11,353,2};;
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}
		
		MergeSort.mergeSort(arr);
		System.out.println("Before sorting");
		for (int i = 0;i<10;i++){
			System.out.println(arr[i]);	
		}
	}
	
}
