
public class MergeSort {
	
public static boolean less(Comparable x, Comparable y){
	return x.compareTo(y)<0;
}
public static void merge(Comparable[] a, Comparable[] aux, int lo,int mid, int hi){
	//Copy a into auxiliary array.
	for(int i =lo;i<hi;i++){
		aux[i] = a[i];
	}
	int i = lo; int j = mid+1;
	
	//The main merge operation
	for (int k=lo;k<=hi;k++){
		if(i>mid){
			a[k] = aux[j++];
		}
		else if(j>hi){
			a[k] = aux[i++];
		}
		else if(less(aux[j],aux[i])){
			a[k] = aux[j++];
		}
		else{
			a[k] = aux[i++];
		}
	}
}

public static void mergeSort(Comparable[] a){
	int N = a.length;
	Comparable[] aux = new Comparable[N];
	
	for(int sz = 1;sz<N;sz=sz+sz){
		for(int lo=0;lo<N-sz;lo+= sz+sz){
			System.out.println("lo= "+lo);
			merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
		}
	}
}
}
