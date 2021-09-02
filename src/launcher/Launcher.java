package launcher;

/**
 * Importaciones
 */
import entities.Student;
import gui.SimplePresentationScreen;

/**
 * Clase Launcher que lanza la ejecucion de la interfaz grafica
 * @author Luciano Rivas
 */
public class Launcher {
	
	/**
	 * Inicia la Interfaz
	 */
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		Student s= new Student (114476, "Rivas", "Luciano", "lucho_purre@hotmail.com", "https://github.com/LucRivas", "/images/1.jpg");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
				try {
					SimplePresentationScreen frame = new SimplePresentationScreen(s);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
        });
    }
}