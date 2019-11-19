package array;

import java.util.Arrays;

public class BasicArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowest;
		String printNumbers;
		double [] numb= {88,47,90,50,77,83,92,96,62,79};
		
		for (int i=0;i<numb.length-1;i++) 
		{
			for(int y=i;y< numb.length;y++) {
			
			if (numb[i] > numb[y]) { 
				lowest = (int)numb[i];
				numb[i]=numb[y];
				numb[y]= lowest;
				
			}
			}
		}
		
		printNumbers= Arrays.toString(numb);
		System.out.println(printNumbers);	


	}

}
