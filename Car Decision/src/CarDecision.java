
public class CarDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] stuff = stickerHybrid.split(",");
		String [] stuff = stickerRegular.split(","); 
		System.out.println(stuff[2]);
		String[]cost= stuff[2].split(":");
		System.out.println(cost[1]);
		double TC=Integer.parseInt(cost[1])*2;
		System.out.println(TC);

	}

}
