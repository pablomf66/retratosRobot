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
		String peloSele = eleccionPelo(pelo);
		String ojosSele = eleccionOjos(ojos);
		String orejasSele = eleccionOrejas(orejas);
		
		System.out.println(peloSele);
		System.out.println(ojosSele);
		System.out.println(orejasSele);

	}

	static String eleccionPelo(String pelo) {

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

	static String eleccionOjos(String ojos) {

		System.out.println("Opciones de ojos");
		System.out.println("1. | o   o |");
		System.out.println("2. |-(· ·)-|");
		System.out.println("3. |-(o o)-|");
		System.out.println("4. | \\   / |");

		int nOjos = Integer.parseInt(IO.readln("Elije unos ojos: "));

		switch (nOjos) {
		case 1:
			ojos = "| o   o |";
			break;
		case 2:
			ojos = "|-(· ·)-|";
			break;
		case 3:
			ojos = "|-(o o)-|";
			break;
		case 4:
			ojos = ("| \\   / |");
			break;
		default:
			nOjos = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4 "));
		}
		return ojos;
	}
	
	static String eleccionOrejas(String orejas) {

		System.out.println("Opciones de orejas");
		System.out.println("1. @   J   @");
		System.out.println("2. {   \"   }");
		System.out.println("3. [   j   ]");
		System.out.println("4. <   -   >");

		int nOrejas = Integer.parseInt(IO.readln("Elije unas orejas: "));

		switch (nOrejas) {
		case 1:
			orejas = "@   J   @";
			break;
		case 2:
			orejas = "{   \"   }";
			break;
		case 3:
			orejas = "[   j   ]";
			break;
		case 4:
			orejas = ("<   -   >");
			break;
		default:
			nOrejas = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4 "));
		}
		return orejas;
	}

}
