package multiplication;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int tableSize = 10;
	        printMultiplicationTable(tableSize);
	    }
	     
	    public static void printMultiplicationTable(int tableSize) {
	        // first print the top header row
	        System.out.format("      ");
	        for(int i = 1; i<=tableSize;i++ ) {
	        	System.out.format("%4d",i);
	        }
	        System.out.println();
	        System.out.println("   ___________________________________________");
	         
	        for(int i = 1 ;i<=tableSize;i++) {
	            // print left most column first
	        	 System.out.format("%4d |",i);
	            for(int j=1;j<=tableSize;j++) {
	                System.out.format("%4d",i*j);
	            }
	            System.out.println();
	        }

	}

}
