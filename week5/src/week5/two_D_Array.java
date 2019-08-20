package week5;

public class two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int [][] mynum = new int[3][3];
		
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				mynum[row][col]= i;
				i++;
			}
		}
		System.out.println("Matrix 1:");
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(mynum[row][col]+"\t");
			}
			System.out.println();
		}
		//-------------------matrix 1-----------------------end
		System.out.println();
		
		int j =1;
		int mynum2[][] = new int[3][3];
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				mynum2[row][col]= j;
				j=j+3;
			}
			j=j-8;
		}
		System.out.println("Matrix 2:");
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(mynum2[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//---------------------matrix2-----------------------end
		
		/*
		int k = 1;
		int [][] mynum3 = new int[3][3];
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				mynum3[row][col]= mynum[row][col]+mynum2[row][col];
				k++;
			}
		}
		*/
		int [][] mynum3 = new int[3][3];
		two_D_Array_func myfunc = new two_D_Array_func();
		mynum3 = myfunc.M_addition(mynum, mynum2);
		
		
		System.out.println("Matrix 1 + Matrix 2:");
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(mynum3[row][col]+"\t");
			}
			System.out.println();
		}
		//----------------------matrix_addition----------------------end
		System.out.println();
		
		int [][] M4 = new int[3][3];
		M4 = myfunc.M_subtraction(mynum,mynum2);
		
		System.out.println("Matrix 1 - Matrix 2:");
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(M4[row][col]+"\t");
			}
			System.out.println();
		}
		//--------------matrix_subtraction--------end
		System.out.println();
		int [][] mat4 = new int[3][3];
		mat4 = myfunc.M_multiplication(mynum, mynum2);
		
		
		System.out.println("Matrix 1 * Matrix 2:");
		for (int row=0;row<3;row++) 
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(mat4[row][col]+"\t");
			}
			System.out.println();
		}
		//----------------------matrix_multiplication--------end
		
		
	

	}

}
