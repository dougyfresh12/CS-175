import java.util.Scanner;
public class gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double numgrade=0;
		
		System.out.println("enter the grade: ");
		String grade = sc.next();
	
        

       
        if(grade.substring(0,1).equals("A")) {
            numgrade = 4.0;
        } else if(grade.substring(0,1).equals("B")) {
            numgrade = 3.0;
        } else if(grade.substring(0,1).equals("C")) {
           numgrade = 2.0;
        } else if(grade.substring(0,1).equals("D")) {
            numgrade = 1.0;
        } else if(grade.substring(0,1).equals("F")) {
            numgrade = 0.0;
        }
            if(grade.length()==2) {
            	if(grade.substring(1,2).equals("+")) {
                numgrade = numgrade + .3;
            }
            else if(grade.substring(1,2).equals("-")) {
                numgrade = numgrade - .3;
            }
            }
            
        System.out.println("Your gpa is "+numgrade);
       
	}

}

