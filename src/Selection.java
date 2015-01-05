

public class Selection {
	public static boolean less(Comparable x, Comparable y){
		return x.compareTo(y)<0;
	}
	
	public static void exch(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	private static boolean isSorted(Comparable[] a){
		for (int i = 1;i<=a.length;i++){
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i=0;i<N;i++){
			int min = i;
			for(int j = i+1;j<N;j++){
				if(less(a[j],a[min])){
					min = j;
				}
			}
			exch(a,i,min);
		}
	}
}
