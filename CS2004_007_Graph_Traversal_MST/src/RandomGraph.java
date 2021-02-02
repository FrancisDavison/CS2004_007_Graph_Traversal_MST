import java.util.Arrays;
import java.util.Random;
public class RandomGraph
{
	public static void main(String args[])
	{
		double StartTime = System.currentTimeMillis();
		int n=500;
		GenerateRandomGraph(n,StartTime);
	}
	
	public static void GenerateRandomGraph(int n, double StartTime)
	{
		int[][] RandGraph = new int[n][n];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					break;
				}
				Integer r = Math.abs(rand.nextInt()%101);
				RandGraph[i][j]=r;
				RandGraph[j][i]=r;
			}
		}
		System.out.println(Arrays.deepToString(RandGraph));
		double EndTime = System.currentTimeMillis();
		double RunTime = (EndTime-StartTime)/1000;
		System.out.println("Run Time (Seconds): " + RunTime);
	}
}