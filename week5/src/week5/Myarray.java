package week5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Myarray {

	public static void main(String[] args) {
		// The first method
		/*
		int [] mynum = new int[5];
		
		for(int i =0;i<5;i++) 
		{
			mynum[i]=i*2;
		}
		
		for (int n : mynum) 
		{
			System.out.println(n);
		}
		*/
		
		////List<Integer> mynum1 = new ArrayList<Integer>();
		// Second method
		
		ArrayList mylist = new ArrayList();
		for (int j =0; j<11;j++) 
		{
			if (j%2==0) 
			{
				mylist.add(j);
			}
		}
		
		System.out.println(mylist);
		
		

	}

}
