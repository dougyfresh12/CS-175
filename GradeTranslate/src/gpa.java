import java.util.Scanner;
public class gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double numgrade=0;
		while(true) {
		System.out.println("enter cource name: ");
		String cource=sc.next();
		System.out.println("enter the grade: ");
		String grade = sc.next();
		System.out.println("enter number of credits: ");
		int credits=sc.nextInt();
        	if(cource.equals("q")) {
        		break;
        	}
        	else {
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
        	}
        System.out.println(cource+" credits "+credits+"gp is " +numgrade*credits);
       
	}
	}
}

