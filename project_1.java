package oops_concepts;

public class Road_Toll {
	String type;
	int tiresCount;
	
	public void calculateToll() {
		if (tiresCount == 2) {
			System.out.println("Your toll amount is 0");
		} else if (tiresCount == 4) {
			System.out.println("Your toll amount is 10");
		} else if (tiresCount > 4) {
			System.out.println("Your toll amount is 20");
		} else {
			System.out.println("Incorrect tire count");
		}
	}
	
	public Road_Toll() {
		System.out.println("Constructor is executed");
	}
	
	public Road_Toll(String type, int tiresCount) {
		this.type = type;
		this.tiresCount = tiresCount;
	}
	
}

public class RoadToll_Main {

	public static void main(String[] args) {
		Road_Toll rt1 = new Road_Toll();
		
		rt1.type = "Sadan";
		rt1.tiresCount = 4;
		rt1.calculateToll();
		
		Road_Toll rt2 = new Road_Toll("Truck", 6);
		rt2.calculateToll();
		
		
		}

}
