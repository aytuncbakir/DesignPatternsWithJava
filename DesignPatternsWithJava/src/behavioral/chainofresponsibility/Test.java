package behavioral.chainofresponsibility;


public class Test {

	public static void main(String[] args) {
		Service hospital = null;
		Service polyclinic = null;
		Service emergency = null;

		hospital = new Hospital(polyclinic, null);
		polyclinic = new Polyclinic(emergency,  hospital);
		emergency = new Emergency(null , polyclinic);
		
		
		Treatment treatment = emergency.handleRequest(Request.URGENT);
		treatment.show();
		/*
		Treatment treatment = urgent.handleRequest(Request.URGENT);
		treatment.show();

		System.out.println();
		
		
		treatment = normal.handleRequest(Request.NORMAL);
		treatment.show();
		
		System.out.println();
		treatment = unurgent.handleRequest(Request.UNURGENT);
		treatment.show();
		
		*/
	}
}
