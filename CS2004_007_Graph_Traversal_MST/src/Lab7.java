import java.util.Arrays;

public class Lab7
{
	public static void main(String args[])
	{
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
		double mst[][] = MST.PrimsMST(g);
		System.out.println("Intro MST: " + Arrays.deepToString(mst));
		
		double eg1[][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,1,2,0}};
		double egmst1[][] = MST.PrimsMST(eg1);
		System.out.println("Example 1 MST: " + Arrays.deepToString(egmst1));
	}
}