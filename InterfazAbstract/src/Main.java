
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movil movil = new Movil();
		System.out.println("-----------------informacion de un movil-----------------");
		System.out.println("el dispositivo sirve para: ");
		movil.hacerFotos();
		movil.hacerVideos();
		movil.comunicarse();
		System.out.println("el dispositivo incluye una bateria" );
		movil.mantenerEncendido();
		System.out.println("y ademas incluye una memoria que ");
		movil.ampliarMemoria();
	}

}
