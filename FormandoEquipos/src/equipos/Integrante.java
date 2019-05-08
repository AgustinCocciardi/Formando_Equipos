package equipos;

public class Integrante {
	
	private String respuestas;
	
	public Integrante(String respuestas){
		this.respuestas = respuestas;
	}
	
	public String letraEnPosicion(int posicion){
		return this.respuestas.substring(0, posicion);
	}
	
	
}
