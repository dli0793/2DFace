public class Face 
{
	public static void main(String[] args) 
	{
		
		int [][] x = new int [5][5];
		x[0][1] = 1;
		x[0][3] = 1;
		x[2][2] = 1;
		x[3][0] = 1;
		x[4][0] = 1;
		x[4][2] = 1;
		x[4][4] = 1;
		x[3][4] = 1;
		
	
		facePrinter(x);
	}
	
	public static void facePrinter(int [][] x) 
	{
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]==0)
				{
					System.out.print(" ");
				}
			
				else 
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}