package ar.com.educacionit.domain.polimorfismo;

public class InformeBase {

	//atributos
	protected String nombre;
	
	//constructor
	public InformeBase(String nombre) {
		this.nombre = nombre;
	}
	
	public void convertir() {
		
		String resultado = "convertiendo archivo por defecto a .txt";
		System.out.println(resultado);
	}
	
}
