import java.util.Arrays;

public class Lab7
{
	public static void main(String args[])
	{
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
		double mst[][] = MST.PrimsMST(g);
		System.out.println(Arrays.deepToString(mst));
	}
}