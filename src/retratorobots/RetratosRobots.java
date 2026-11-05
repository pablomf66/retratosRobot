package retratorobots;

public class RetratosRobots {

	static String pelo;
	static String ojos;
	static String orejas;
	static String boca;
	static String barbilla;
	
	public static void main(String[] args) {
		int otro;
		
		System.out.println("Creador de Robots");
		System.out.println(eleccionPelo(pelo));
		
	}
	
	static String eleccionPelo (String pelo) {
		
		System.out.println("Opciones de pelo");
		System.out.println("1. WWWWWWWWW");
		System.out.println("2. \\\\\\//////");
		System.out.println("3. \"|||||||\"");
		System.out.println("4. |||||||||");
		
		int nPelo = Integer.parseInt(IO.readln("Elije un pelo: "));
		
		switch (nPelo) {
		case 1:
			pelo = "WWWWWWWWW";
			break;
		case 2:
			pelo = "\\\\\\//////";
			break;
		case 3:
			pelo = ("\"|||||||\"");
			break;
		case 4:
			pelo = ("|||||||||");
			break;
		default:
			nPelo = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4 "));
		}
		return pelo;
	}
	

}
