package gui;

/**
 * Importaciones
 */
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

/**
 * Clase SimplePresentationScreen que mostrara los datos del estudiante
 * @author Luciano Rivas
 */
@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	/**
	 * Atributos de Instancia
	 */
	private JPanel contentPane;
	private Student studentData;
	
	/**
	 * Constructor 
	 * Inicializa los atributos de instancia
	 * @param studentData: datos del estudiante que seran mostrados en la interfaz
	 */
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage()); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 278));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	/**
	 * Metodo privado que da inicio a la interfaz
	 */
	private void init() {
		// Tabbed Pane to student personal data
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 11, 432, 188);
		
		JPanel tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		/**
		 * Label utilizado para LU
		 */
		JLabel lblLU = new JLabel("LU");
		lblLU.setBounds(10, 11, 73, 14);
		tabInformation.add(lblLU);
		
		/**
		 * Texto donde se coloca el LU del estudiante
		 */
		JTextField textFieldLU = new JTextField();
		textFieldLU.setToolTipText("");
		textFieldLU.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				textFieldLU.setText(""+studentData.getId());
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textFieldLU.setBounds(93, 8, 281, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);

		/**
		 * Label utilizado para Apellido
		 */
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 41, 73, 14);
		tabInformation.add(lblApellido);
		
		/**
		 * Texto utilizado para escrbir el apellido del estudiante
		 */
		JTextField textFieldApellido = new JTextField();
		textFieldApellido.setToolTipText("");
		textFieldApellido.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				textFieldApellido.setText(studentData.getLastName());
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textFieldApellido.setText("");
		textFieldApellido.setBounds(93, 38, 281, 20);
		tabInformation.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		/**
		 * Label utilizado para Nombre
		 */
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 71, 73, 14);
		tabInformation.add(lblNombre);
		
		/**
		 * Texto utilizado para introducir el nombre del estudiante
		 */
		JTextField textFieldNombre = new JTextField();
		textFieldNombre.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				textFieldNombre.setText(studentData.getFirstName());
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textFieldNombre.setBounds(93, 68, 281, 20);
		tabInformation.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		/**
		 * Label utilizado para e-mail
		 */
		JLabel lblmail = new JLabel("e-mail");
		lblmail.setBounds(10, 101, 73, 14);
		tabInformation.add(lblmail);
				
		/**
		 * Texto utilizado para ingresar el e-mail del estudiante
		 */
		JTextField textFieldmail = new JTextField();
		textFieldmail.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				textFieldmail.setText(studentData.getMail());
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textFieldmail.setBounds(93, 98, 281, 20);
		tabInformation.add(textFieldmail);
		textFieldmail.setColumns(10);

		/**
		 * Lable utilizado para GitHub URL
		 */
		JLabel lblGitHub = new JLabel("GitHub URL");
		lblGitHub.setBounds(10, 131, 73, 14);
		tabInformation.add(lblGitHub);
		
		/**
		 * Texto utilizado par introducir el GitHub URl del estudiante
		 */
		JTextField textFieldGitHub = new JTextField();
		textFieldGitHub.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				textFieldGitHub.setText(studentData.getGithubURL());
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		contentPane.setLayout(null);
		textFieldGitHub.setBounds(93, 128, 281, 20);
		tabInformation.add(textFieldGitHub);
		textFieldGitHub.setColumns(10);
		contentPane.add(tabbedPane);
		
		/**
		 * Panel contenedor 
		 */
		JPanel panelFoto = new JPanel();
		panelFoto.setBounds(454, 38, 134, 161);
		contentPane.add(panelFoto);
		panelFoto.setLayout(null);
		
		/**
		 * Label utilizado para introducir la foto del estudiante
		 */
		JLabel lblLabelFoto = new JLabel("");
		lblLabelFoto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lblLabelFoto.setBounds(0, 0, 134, 161);
		panelFoto.add(lblLabelFoto);
		
		/**
		 * Asigno la variable que mostrara la hora de ejecucion 
		 */
		Calendar cal = Calendar.getInstance();
		Date hora = cal.getTime();
		DateFormat formatter = DateFormat.getTimeInstance();
		
		/**
		 * Asigno la variable que mostrara la fecha de ejecucion
		 */
		Date fecha= new Date ();
		SimpleDateFormat f= new SimpleDateFormat ("dd/MM/YYYY");
		String fe= f.format(fecha);
		
		/**
		 * Label donde se muestra la fecha y la hora cuando fue lanzado el programa
		 */
		JLabel lblFecha = new JLabel("");
		lblFecha.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				lblFecha.setText("Esta ventana fue generada el "+ fe+ " a las: "+ formatter.format(hora));
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		lblFecha.setBounds(12, 202, 432, 20);
		contentPane.add(lblFecha);
	}
}
