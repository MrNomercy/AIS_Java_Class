package week7;

import java.util.ArrayList;

public class Prac_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animal = {"cow","dog","cat","pig","sheep","bear","chicken"};
		
		for(String a : animal) 
		{
			System.out.print(a+" ");
		}
		for (int i=0;i<animal.length;i++) 
		{
			System.out.println(animal[i]);
		}
		
		ArrayList fruit = new ArrayList();
		fruit.add("Apple");
		fruit.add("pear");
		fruit.add("banana");
		fruit.add("coconut");
		fruit.add("chicken");
		fruit.add(5,"black currant");
		System.out.println(fruit);
		fruit.remove(4);
		fruit.remove("pear");
		System.out.println(fruit);
		int pos = fruit.indexOf("coconut");
		fruit.set(pos, "grape");
		System.out.println(fruit);
		for (int j=0;j<fruit.size();j++) 
		{
			System.out.println("I like "+fruit.get(j)+" cause it is tasty.");
		}

	}

}
