
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

		
		}
	}
	
}
