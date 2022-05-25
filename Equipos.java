package actividad_1;

public class Equipos {
	private String nombre;
	private String categoria;
	private String imagen;
	private int cantidad_hinchas;
	private int cantidad_jsp;
	private boolean patrocinio;
	
	
	public void establece_datos_equipos(String nombre, String categoria, String imagen, int hinchas, int jugadores_sobrepeso,
			boolean patrocinio){
		this.nombre=nombre;
		this.categoria=categoria;
		this.imagen=imagen;
		this.cantidad_hinchas=hinchas;
		this.cantidad_jsp=jugadores_sobrepeso;
		this.patrocinio=patrocinio;
		
	}
	public String dime_patrocinio() {
		if(patrocinio==true) {
			return "Si tiene patrocinio";
		}else {return "no tiene patrocinio";}
	}
	
	public String  dame_info_equipo() {
		return "Nombre Equipo : "+nombre+"\n"+"Categoria equipo : "+categoria+"\n"+"La imagen del equipo es : "
				+imagen+"\n"+"Cantidad de inchas : "+cantidad_hinchas+"\n"+"Jugadores con sobre peso : "+cantidad_jsp
				+"\n"+ dime_patrocinio();
	}
}
