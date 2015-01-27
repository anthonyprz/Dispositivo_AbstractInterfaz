
public abstract class Dispositivo {
	int id;
	String modelo, marca;
	
	 abstract void comunicarse();
	abstract void hacerFotos();
	abstract void hacerVideos();
	 void entretener(){
		 System.out.println("entretiene mediante juegos y aplicaciones");
	 }
	
}
