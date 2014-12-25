public class Percolation 
{

	int[] UFArr;
	int[] UFArrisOpen;		
	WeightedQuickUnionUF objUF;
	int N;
	int size;
/*Constructor to initialize
 * N by N grid*/
Percolation(int N)
{
	this.N = N;
	size = N*N;
	int i = 1;
	//UFArr = new int[size];
	UFArrisOpen = new int[size+1];
	objUF = new WeightedQuickUnionUF(size+2);		//+2 to add two extra objects, one at top and one at bottom
	
	while(i<=size)
	{
		//UFArr[i] = i;
		UFArrisOpen[i] = 0;			//Initializing all cells as close
		i++;
	}
	
}

/*Function to open a site 
 * if it is not already open.
 * This function also connects 
 * newly opened site with
 * opened neighbours*/
public void open(int i, int j)	
{
	System.out.println("Called Open()");
	if(!isOpen(i,j))
	{
		
		UFArrisOpen[getIndex(i, j)] = 1;
		if(i == 1)
		{
			System.out.println("Connecting top node");
			objUF.union(1, getIndex(i, j));
		}
		if(i == N)
		{
			System.out.println("Connecting bottom node");
			objUF.union(getIndex(i, j),size+1);
		}
		if(i-1 >= 1 && isOpen(i-1,j))
		{
			objUF.union(getIndex(i, j), getIndex(i-1,j));	
		}
		if(i+1 <= N && isOpen(i+1,j))
		{
			objUF.union(getIndex(i, j), getIndex(i+1,j));	
		}
		if(j-1 >= 1 && isOpen(i,j-1))
		{	
			System.out.println("Found open neighbor");
			objUF.union(getIndex(i, j), getIndex(i,j-1));	
		}
		if(j+1 <= N && isOpen(i,j+1))
		{
			objUF.union(getIndex(i, j), getIndex(i,j+1));
			
		}
	}
}

private int getIndex(int i, int j)
{
	return j + 5*(i-1) + 1;
}

public boolean isOpen(int i, int j)
{
	return  (UFArrisOpen[getIndex(i,j)]!=0);
}

public static void main(String[] args)
{
	//Percolation perc = new Percolation(10);
	System.out.println("Entering main\n");
	Percolation perc = new Percolation(5);
	//perc.open(1, 1);
	perc.open(1, 2);
	perc.open(2, 2);
	perc.open(3, 2);
	perc.open(4, 2);
	perc.open(5, 3);
	perc.open(4, 3);
	
	System.out.println("Does system percolates? : "+perc.objUF.connected(1,26));
	System.out.println("Open operations is successful : "+perc.objUF.connected(13, 12));
	System.out.println("Open operations is successful : "+perc.objUF.connected(13, 18));
	System.out.println("Open operations is successful : "+perc.objUF.connected(13, 14));
	System.out.println("Open operations is successful : "+perc.objUF.connected(12, 14));
	
}

}
