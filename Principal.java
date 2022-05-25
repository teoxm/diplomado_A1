package actividad_1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "BIENVENIDOS AL TORNEO DE FUTBOL DEL IDRD DE LA ALCALDIA MAYOR DE BOGOTA");
		int aux=2;
		int aux2=2;
		String opcion;
		Equipos inem=new Equipos();
		inem.establece_datos_equipos("DEORTIVO INEM", "JUVENIL",  "INSTITUTO EDUCATIVO", 357,3, true);
		do {
			String equipo=JOptionPane.showInputDialog("Ingrese el numero del equipo al cual desea gestionar \n"
					+ "1) DEPORTIVO INEM \n "
					+ "2) SALIR");
			if(equipo.equals("1")) {
				do {
					opcion=JOptionPane.showInputDialog("Ingrese el numero de la opcion que se ajuste a su necesidad \n"
							+ "1) Conocer la informacion del equipo \n"
							+ "2) Conocer la informacion de los jugadores del equipo \n"
							+ "3) volver al menu principal");
					if(opcion.equals("1")) {
						JOptionPane.showMessageDialog(null, inem.dame_info_equipo());
					}
					if(opcion.equals("2")) {
						JOptionPane.showMessageDialog(null, "aún no hay un metodo para esta opción ");
					}
					if(opcion.equals("3")) {
						aux2=1;
					}
				}while(aux2==2);
					
				
				
			}
			if(equipo.equals("2")) {
				aux=1;
			}
					
		}while(aux==2);
	}

}
