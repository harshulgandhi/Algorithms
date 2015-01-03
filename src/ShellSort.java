
public class ShellSort {
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
	
	public static void shellSort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h<N/3) h = 3*h+1;
		while(h>=1){
			for (int i = h;i<N;i++){
				for(int j = i;j>=h && less(a[j],a[j-h]);j-=h){
					exch(a, j, j-h);
				}
			}
			h=h/3;
		}
	}

}
