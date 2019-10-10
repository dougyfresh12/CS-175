import java.util.Scanner;
public class Cardecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costofregularcar;
		double mpgregularcar;
		double costhybridcar;
		double mpghybridcar;
		double milestraveled;
		double costpergallonofgas;
		double regularcar1;
		double hybridcar1;
		double regularcar2;
		double hybridcar2;
		double regularcar3;
		double hybridcar3;
		double regularcar4;
		double hybridcar4;
		double regularcar5;
		double hybridcar5;
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] stuffH = stickerHybrid.split(",");
		String [] stuffR = stickerRegular.split(","); 
		Scanner in = new Scanner(System.in);
		String[]costR= stuffR[2].split(":");
		System.out.println("State the cost of a regular car: "+costR[1]);
		costofregularcar=Integer.parseInt(costR[1]);
		String[]mpgR= stuffR[3].split(":");
		System.out.println("State the Miles per gallon of a regular car:"+mpgR[1]);
		mpgregularcar=Integer.parseInt(mpgR[1]);
		
		String[]costH= stuffH[2].split(":");
		System.out.println("State the cost of a hybrid car: "+costH[1]);
		costhybridcar=Integer.parseInt(costH[1]);
		String[]mpgH=stuffH[3].split(":");
		System.out.println("state the miles per gallion of a hybrid car:"+mpgH[1]);
		mpghybridcar=Integer.parseInt(mpgH[1]);
		System.out.println("state miles traveled: ");
		milestraveled=in.nextInt();
		System.out.println("what is cost of gas: ");
		costpergallonofgas=in.nextDouble();
		
		regularcar1= (((milestraveled/mpgregularcar)*costpergallonofgas)+costofregularcar);
		hybridcar1=(((milestraveled/mpghybridcar)*costpergallonofgas)+costhybridcar);
		String[]makeR= stuffR[0].split(":");
		String[]modelR= stuffR[1].split(":");
		String[]makeH= stuffH[0].split(":");
		String[]modelH= stuffH[1].split(":");
		System.out.println("Cost to own after year 1 for "+makeR[1]+" "+modelR[1]+":"+regularcar1+" for "+makeH[1]+" "+modelH[1]+":"+hybridcar1);
		regularcar2=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar1);
		hybridcar2=(((milestraveled/mpghybridcar)*costpergallonofgas)+hybridcar1);
		System.out.println("Cost to own after year 2 for "+makeR[1]+" "+modelR[1]+":"+regularcar2+" for "+makeH[1]+" "+modelH[1]+":"+hybridcar2);
		regularcar3=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar2);
		hybridcar3=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar2);
		System.out.println("Cost to own after year 3 for "+makeR[1]+" "+modelR[1]+":"+regularcar3+" for "+makeH[1]+" "+modelH[1]+":"+hybridcar3);
		regularcar4=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar3);
		hybridcar4=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar3);
		System.out.println("Cost to own after year 4 for "+makeR[1]+" "+modelR[1]+":"+regularcar4+" for "+makeH[1]+" "+modelH[1]+":"+hybridcar4);
		regularcar5=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar4);
		hybridcar5=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar4);
		System.out.println("Cost to own after year 5 for "+makeR[1]+" "+modelR[1]+":"+regularcar5+" for "+makeH[1]+" "+modelH[1]+":"+hybridcar5);
		
		
		



	}

}
