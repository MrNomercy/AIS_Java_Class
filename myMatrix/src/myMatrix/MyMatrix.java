package myMatrix;

import java.util.Scanner;

public class MyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("please enter number of row:");
		int rows = reader.nextInt();
		System.out.print("Please enter number of column:");
		int cols = reader.nextInt();
		
		System.out.println("please enter Matrix A:");
		int [][] Mat_A = readMatrix(rows,cols);
		
		System.out.println("please enter Matrix B:");
		int [][] Mat_B = readMatrix(rows,cols);
		
		System.out.println("Mat A");
		printMat(Mat_A);
		System.out.println("Mat B");
		printMat(Mat_B);
		
		System.out.println("Mat A + Mat B");
		printMat(Add(Mat_A,Mat_B));
		
		System.out.println("Mat A - Mat B");
		printMat(sub(Mat_A,Mat_B));
		
		System.out.println("Mat A * Mat B");
		printMat(multi(Mat_A,Mat_B));
		
		

	}
	
	public static int[][] readMatrix(int rows, int cols)
	{
		Scanner reader = new Scanner(System.in);
		int [][] myMat = new int[rows][cols];
		for (int i=0;i<rows;i++) 
		{
			for (int j=0;j<cols;j++) 
			{
				myMat[i][j] = reader.nextInt();
			}
		}
		return myMat;
	}
	
	public static int[][] Add(int[][] Mat_A,int[][] Mat_B)
	{
		int rows = Mat_A.length;
		int cols = Mat_A[0].length;
		int [][] MyMat = new int [rows][cols];
		for (int i=0; i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				MyMat[i][j] = Mat_A[i][j]+Mat_B[i][j];
			}
		}
		return MyMat;
	}
	
	public static int[][] sub(int[][] Mat_A,int[][] Mat_B)
	{
		int rows = Mat_A.length;
		int cols = Mat_A[0].length;
		int [][] MyMat = new int[rows][cols];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				MyMat[i][j] = Mat_A[i][j]-Mat_B[i][j];
			}
		}
		return MyMat;
	}
	
	public static int[][] multi(int[][] Mat_A,int [][] Mat_B) 
	{
		int row_A = Mat_A.length;
		int col_A = Mat_A[0].length;
		int col_B = Mat_B[0].length;
		int[][] MyMat = new int[row_A][col_B];
		for (int i=0;i<row_A;i++) 
		{
			for (int j=0;j<col_B;j++) 
			{
				for (int k=0;k<col_A;k++) 
				{
					MyMat[i][j]= MyMat[i][j]+Mat_A[i][k]*Mat_B[k][j];
				}
			}
		}
		return MyMat;
	}
	
	public static void printMat(int[][] MyMat) 
	{
		int rows = MyMat.length;
		int cols = MyMat[0].length;
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				System.out.print(MyMat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
