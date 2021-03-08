import java.util.Arrays;
import java.util.Random;

public class Lab7
{
	public static void main(String args[])
	{
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
		double mst[][] = MST.PrimsMST(g);
		System.out.println(g[1][2]);
		System.out.println("Intro MST: " + Arrays.deepToString(mst));
		
		double eg1[][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,2},{0,5,1,2,0}};
		double egmst1[][] = MST.PrimsMST(eg1);
		System.out.println("Example 1 MST: " + Arrays.deepToString(egmst1));
		int n=73;
		System.out.println("EX3" + Arrays.deepToString(RandomArray(n)));
	}
	
	public static double[][] RandomArray(int n)
	{
		double RandArr[][] = new double[n][n];
		Random r = new Random();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				RandArr[i][j] = r.nextInt(101);
				if(i==j)
				{
					RandArr[i][j]=0;
				}
				if(j<i)
				{
					double RandInt = r.nextInt(101);
					RandArr[i][j] = RandInt;
					RandArr[j][i] = RandInt;
				}
				else
				{
					break;
				}
			}
		}
		return RandArr;
	}
}