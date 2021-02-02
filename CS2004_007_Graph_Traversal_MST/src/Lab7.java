import java.util.Arrays;

public class Lab7
{
	public static void main(String args[])
	{
		double g[][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,1,2,0}};
		double mst[][] = MST.PrimsMST(g);
		PrintArray(g,mst);
	}
	
	public static void PrintArray(double[][] g, double[][] mst)
	{
		System.out.println(Arrays.deepToString(g));
		System.out.println(Arrays.deepToString(mst));
	}
}