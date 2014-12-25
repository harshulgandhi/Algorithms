
public class ResizingArrayStackOfStrings {
	private String[] s;
	private int N = 0;
	
	public ResizingArrayStackOfStrings(int capacity) {
		s = new String[capacity];
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public void push(String item){
		if(s.length == N){resize(2*s.length);}
		s[N++] = item;
	}
	
	public String pop(){
		String temp = s[--N];
		s[N] = null;
		if(N > 0 && N == s.length/4) resize(s.length/2);
		return temp;
	}
	
	public void resize(int newSize){
		String[] temp = new String[newSize];
		for(int i = 0;i<N;i++){
			temp[i] = s[i];
		}
		
		s = temp;
	}
}
