package week10;

import java.util.ArrayList;

public class multi_dimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] service = {
		  							{"hair cuts","15"},
									{"manicure  ","16"},
									{"shampoo  ","20"},
									{"makeup  ","15"},
									{"massage  ","20"}
									};
//		ArrayList [][] product = new ArrayList[10][2];
//		product[0][0] = new ArrayList();
//		product[0][0].add("shampoo");
//		product[0][1] = new ArrayList();
//		product[0][1].add(15);
//		product[1][0] = new ArrayList();
//		product[1][0].add("conditioner");
//		product[1][1] = new ArrayList();
//		product[1][1].add(18);
//		System.out.println(product);
		for(int i = 0; i<service.length;i++) 
		{
			System.out.println(service[i][0]+"\t"+service[i][1]);
		}

	}

}
