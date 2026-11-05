package retratorobots;

public class RetratosRobots {

	static String pelo;
	static String ojos;
	static String orejas;
	static String boca;
	static String barbilla;

	public static void main(String[] args) {
		int otro = 1;

		System.out.println("Creador de Robots");
		System.out.println();
		do {
			String peloSele = eleccionPelo(pelo);
			String ojosSele = eleccionOjos(ojos);
			String orejasSele = eleccionOrejas(orejas);
			String bocaSele = eleccionBoca(boca);
			String barbillaSele = eleccionBarbilla(barbilla);

			System.out.println();
			System.out.println();
			System.out.println("Tu robot es:");
			System.out.println();
			System.out.println(peloSele);
			System.out.println(ojosSele);
			System.out.println(orejasSele);
			System.out.println(bocaSele);
			System.out.println(barbillaSele);

			System.out.println();
			System.out.println();
			otro = Integer.parseInt(IO.readln("Quieres hacer otro robor? (SI [1], NO [0]: "));
			System.out.println();
		} while (otro == 1);
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
				nPelo = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4: "));
		}
		return pelo;
	}

	static String eleccionOjos(String ojos) {

		System.out.println();
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
				nOjos = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4: "));

		}
		return ojos;
	}

	static String eleccionOrejas(String orejas) {

		System.out.println();
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

				nOrejas = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4: "));
		}
		return orejas;
	}

	static String eleccionBoca(String Boca) {

		System.out.println();
		System.out.println("Opciones de bocas");
		System.out.println("1. |  ===  |");
		System.out.println("2. |   -   |");
		System.out.println("3. |  ___  |");
		System.out.println("4. |  ---  |");

		int nBoca = Integer.parseInt(IO.readln("Elije una boca: "));

		switch (nBoca) {
		case 1:
			boca = "|  ===  |";
			break;
		case 2:
			boca = "|   -   |";
			break;
		case 3:
			boca = "|  ___  |";
			break;
		case 4:
			boca = ("|  ---  |");
			break;
		default:

				nBoca = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4: "));
		}
		return boca;
	}

	static String eleccionBarbilla(String Barbilla) {

		System.out.println();
		System.out.println("Opciones de barbillas");
		System.out.println("1. \\_______/");
		System.out.println("2. \\,,,,,,,/");
		System.out.println("3. \\......./");
		System.out.println("4. \\mmmmmmm/");

		int nBarbilla = Integer.parseInt(IO.readln("Elije una barbilla: "));

		switch (nBarbilla) {
		case 1:
			barbilla = "\\_______/";
			break;
		case 2:
			barbilla = "\\,,,,,,,/";
			break;
		case 3:
			barbilla = "\\......./";
			break;
		case 4:
			barbilla = ("\\mmmmmmm/");
			break;
		default:

				nBarbilla = Integer.parseInt(IO.readln("Error, elije uno del 1 al 4: "));

		}
		return barbilla;
	}

}
