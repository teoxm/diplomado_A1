package actividad_1;

public class Jugadores {
	private String id;
	private String nombre;
	private Double estatura;
	private Double  peso;
	private int goles;
	private String equipo;
	public void calculaIMC() {
		
	}
	public void estableceJugadores(String id, String nombre, Double estatura, double peso, int goles, String equipo  ){
		this.id=id;
		this.nombre=nombre;
		this.estatura=estatura;
		this.peso=peso;
		this.goles=goles;
		this.equipo=equipo;
	}
	public String infoJugadores(){
		return "NUMERO IDENTIFICACION : "+ id+"\n"+"NOMBRE: " + nombre+"\n"+"ESTATURA : "+estatura+"\n"+"peso : "
		 +peso+"\n"+"GOLES MARCADOS EN LA TEMPORADA : "+goles+"\n"+"Equipo :"+equipo;
	}
}
