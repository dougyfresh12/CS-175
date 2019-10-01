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
		Scanner in = new Scanner(System.in);
		System.out.println("State the cost of a regular car: ");
		costofregularcar=in.nextInt();
		System.out.println("State the Miles per gallon of a regular car: ");
		mpgregularcar=in.nextInt();
		System.out.println("State the cost of a hybrid car: ");
		costhybridcar=in.nextInt();
		System.out.println("state the miles per gallion of a hybrid car:");
		mpghybridcar=in.nextInt();
		System.out.println("state miles traveled: ");
		milestraveled=in.nextInt();
		System.out.println("what is cost of gas: ");
		costpergallonofgas=in.nextDouble();
		regularcar1= (((milestraveled/mpgregularcar)*costpergallonofgas)+costofregularcar);
		hybridcar1=(((milestraveled/mpghybridcar)*costpergallonofgas)+costhybridcar);
		System.out.println("Cost to own after year 1 for regular car:"+regularcar1+"or hybrid car:"+hybridcar1);
		regularcar2=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar1);
		hybridcar2=(((milestraveled/mpghybridcar)*costpergallonofgas)+hybridcar1);
		System.out.println("Cost to own after year 2 for regular car:"+regularcar2+"for hybrid car:"+hybridcar2);
		regularcar3=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar2);
		hybridcar3=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar2);
		System.out.println("Cost to own after year 3 for regular car:"+regularcar3+"for hybrid car:"+hybridcar3);
		regularcar4=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar3);
		hybridcar4=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar3);
		System.out.println("Cost to own after year 4 for regular car:"+regularcar4+"for hybrid car:"+hybridcar4);
		regularcar5=(((milestraveled/mpgregularcar)*costpergallonofgas)+regularcar4);
		hybridcar5=(((milestraveled/mpgregularcar)*costpergallonofgas)+hybridcar4);
		System.out.println("Cost to own after year 5 for regular car:"+regularcar5+"for hybrid car:"+hybridcar5);
		
		
		



	}

}
