import java.util.Scanner;
public class gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double numgrade=0;
		double gpa = 0.0;
		double gradePoints =0;
		double totalnumberGrade = 0;
		int totalCreditHours = 0;
		String courceInfo = null;
		System.out.println("Enter cource info separated by commas(title, credit hours, a letter grade, or Q to quit: ");
		
		while(sc.hasNext()) {
			
			courceInfo = sc.next();
		    if(courceInfo.equals("Q")) {
        		break;
        	}
		    String [] data =courceInfo.split(",");
		    String info = data[0];
		    int hours = Integer.parseInt(data[1]);
		    String grade =data[2];
		    
        if(grade.equals("A")||grade.equals("A+")) {
            numgrade = 4.0;
        } 
        else if(grade.equals("A-")){
        	numgrade= 3.7;
        }
        else if (grade.equals("B+")) {
        	numgrade = 3.3;
        }
        else if(grade.equals("B")) {
            numgrade = 3.0;
        }
        else if (grade.equals("B-")) {
        	numgrade = 2.7;
        }
        else if (grade.equals("C+")) {
        	numgrade = 2.3;
        }
        else if(grade.equals("C")) {
           numgrade = 2.0;
        }
        else if (grade.equals("C-")) {
        	numgrade = 1.7;
        }
        else if (grade.equals("D+")) {
        	numgrade =1.3;
        }
        else if(grade.equals("D")) {
            numgrade = 1.0;
        } 
        else if (grade.equals("D-")) {
        	numgrade = 0.7;
        }
        else if(grade.substring(0,1).equals("F")) {
            numgrade = 0.0;
        }
        else if (grade.equals("WF")){
        	numgrade = 0.0;
        }
        else if(grade.equals("P")||grade.equals("NP")||grade.equals("I")) {
        	hours = 0;
        	
        }
        else {
        	System.out.println("Invalid letter grade, enetr a diffrent value: ");
        }
            gradePoints += (numgrade * hours);
            totalCreditHours += hours;
            totalnumberGrade +=numgrade;
            gpa = gradePoints/totalCreditHours;
            System.out.print("\nEnter course info seprated by comma(title, credit hours, a letter garde): ");
        	}
        System.out.println("your gpa is: "+gpa);
       
	
	}
}

