
public class Movil extends Dispositivo implements Bateria, MemoriaSD {

	@Override
	public void ampliarMemoria() {
		// TODO Auto-generated method stub
		System.out.println("amplia la memoria hasta 64 gb");
	}

	@Override
	public void mantenerEncendido() {
		// TODO Auto-generated method stub
		System.out.println("para mantener el dispositivo encendido durante 8 horas en uso");
	}

	@Override
	void comunicarse() {
		// TODO Auto-generated method stub
		System.out.println("se puede hablar con otras personas mediante el dispositivo");
	}

	@Override
	void hacerFotos() {
		// TODO Auto-generated method stub
		System.out.println("se realizan fotos");
	}

	@Override
	void hacerVideos() {
		// TODO Auto-generated method stub
		System.out.println("se graban videos");
	}

}
