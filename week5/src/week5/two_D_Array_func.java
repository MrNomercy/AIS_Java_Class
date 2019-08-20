package week5;

public class two_D_Array_func {
	
	int [][] M_addition(int [][] M1,int[][] M2)
	{
		
		int k = 1;
		int [][] M3 = new int[3][3];
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				M3[row][col]= M1[row][col]+M2[row][col];
				k++;
			}
		}
		return M3;
		
	}
	
	int [][] M_subtraction(int [][] M1,int[][] M2)
	{
		
		int l = 1;
		int [][] M3 = new int[3][3];
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				M3[row][col]= M1[row][col]-M2[row][col];
				l++;
			}
		}
		return M3;
		
	}
	
	int [][] M_multiplication(int [][] M1,int[][] M2)
	{
		//int m = 1;
		int [][] M4 = new int[3][3];
		//M4[0][0] = M1[0][0]*M2[0][0]+M1[0][1]*M2[1][0]+M1[0][2]*M2[2][0];
		//M4[0][1] = M2[0][0]*M2[0][1]+M1[0][1]*M2[1][1]+M1[0][2]*M2[2][1];
		for (int row = 0; row<3;row++) 
		{
			for (int col=0;col<3;col++) 
			{
				M4[row][col]= M1[row][0]*M2[0][col]+M1[row][1]*M2[1][col]+M1[row][2]*M2[2][col];
			}
		}

		return M4;	
	}
	

}
