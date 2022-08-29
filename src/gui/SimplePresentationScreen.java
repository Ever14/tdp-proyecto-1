package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;

import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import java.time.LocalDateTime;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

	public SimplePresentationScreen(Student studentData) {
		ImageIcon icono = new ImageIcon(SimplePresentationScreen.class.getResource("/images/tdp.png"));
		
		setIconImage(icono.getImage());
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		ImageIcon foto = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()));
		Font fuente = new Font("Tahoma", Font.PLAIN, 12);
		
		JLabel lblLu = new JLabel("LU");
		JLabel lblInfoLu = new JLabel("" + studentData.getId());
		lblInfoLu.setFont(fuente);
		lblInfoLu.setOpaque(true);
		lblInfoLu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblInfoLu.setBackground(Color.WHITE);
		
		JLabel lnlApellido = new JLabel("Apellido");
		JLabel lblInfoApellido = new JLabel(studentData.getLastName());
		lblInfoApellido.setFont(fuente);
		lblInfoApellido.setOpaque(true);
		lblInfoApellido.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblInfoApellido.setBackground(Color.WHITE);
		
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblInfoNombre = new JLabel(studentData.getFirstName());
		lblInfoNombre.setFont(fuente);
		lblInfoNombre.setOpaque(true);
		lblInfoNombre.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblInfoNombre.setBackground(Color.WHITE);
		
		JLabel lblMail = new JLabel("E-mail");
		JLabel lblInfoMail = new JLabel(studentData.getMail());
		lblInfoMail.setFont(fuente);
		lblInfoMail.setOpaque(true);
		lblInfoMail.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblInfoMail.setBackground(Color.WHITE);
		
		JLabel lblGithubDireccion = new JLabel("Github URL");
		JLabel lblInfoGithubUrl = new JLabel(studentData.getGithubURL());
		lblInfoGithubUrl.setFont(fuente);
		lblInfoGithubUrl.setOpaque(true);
		lblInfoGithubUrl.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblInfoGithubUrl.setBackground(Color.WHITE);
		
		JLabel lblFotoPerfil = new JLabel(foto);
		lblFotoPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFotoPerfil, BorderLayout.EAST);
		
		LocalDateTime hoy = LocalDateTime.now();
		JLabel lblHoraFecha = new JLabel("Esta ventana fue generada el " + hoy.getDayOfMonth() + "//" + hoy.getMonthValue() + "//" + 
		hoy.getYear() + " a las: " + hoy.getHour() + ":" + hoy.getMinute() + ":" + hoy.getSecond());
		
		contentPane.add(lblHoraFecha, BorderLayout.SOUTH);
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblLu, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addComponent(lblInfoLu, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lnlApellido, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblInfoApellido, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addComponent(lblInfoNombre, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblMail, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addComponent(lblInfoMail, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblGithubDireccion, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(lblInfoGithubUrl, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)))
					.addGap(24))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLu)
						.addComponent(lblInfoLu, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lnlApellido)
						.addComponent(lblInfoApellido, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(lblInfoNombre, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMail)
						.addComponent(lblInfoMail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGithubDireccion)
						.addComponent(lblInfoGithubUrl, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		
	}
}
