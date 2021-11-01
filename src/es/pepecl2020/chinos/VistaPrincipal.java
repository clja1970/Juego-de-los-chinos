package es.pepecl2020.chinos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class VistaPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;

	Choice choC = new Choice();

	Label lblNombreJugadores = new Label ("  Nombre de los jugadores");

	TextField txtJUno = new TextField (20);
	String nombreJugUno = null;
	TextField txtJDos = new TextField (20);
	String nombreJugDos = null;
	TextField txtJTres = new TextField (20);
	String nombreJugTres = null;
	
	TextField txtGuardaUno = new TextField (1);
	TextField txtGuardaDos = new TextField (1);
	TextField txtGuardaTres = new TextField (1);

	Label lblChinosUno = new Label ("Número de chinos a guardar 0-3");
	Label lblChinosDos = new Label ("Número de chinos a guardar 0-3");
	Label lblChinosTres = new Label ("Número de chinos a guardar 0-3");
	
	Button btnAyuda = new Button("Ayuda");
	Button BtnSiguiente = new Button("Siguiente");

	Button btnSiguienteUno = new Button("Siguiente");
	Button btnSiguienteDos = new Button("Siguiente");
	Button btnSiguienteTres = new Button("Siguiente");

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Dialog dlgUno = new Dialog (this,"", true);
	Dialog dlgDos = new Dialog (this,"", true);
	Dialog dlgTres = new Dialog (this,"", true);


	public VistaPrincipal()
	{
		Color fondo = new Color(255,102,102);
		setLayout( new BorderLayout() );
		setBackground(fondo);

		add(choC);
		choC.addItem(" Elige número de jugadores");
		choC.addItem(" Dos Jugadores");
		choC.addItem(" Tres Jugadores");

		p1.add(choC);
		add("West",p1);
		p2.add(choC);
		add("Center",p2);
		p3.add(choC);
		add("North",p3);

		p1.add(lblNombreJugadores);

		p3.add(BtnSiguiente);

		p2.add(txtJUno);
		txtJUno.setText ("");
		p2.add(txtJDos);
		txtJDos.setText ("");
		p2.add(txtJTres);
		txtJTres.setText ("");
		
		p2.add(btnAyuda);

		setSize(400,200);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible (true);
		
		// Dialogos
		dlgUno.setLayout(new FlowLayout ());
		//----	
				
		dlgUno.add(lblChinosUno);
		dlgUno.add(txtGuardaUno);
		dlgUno.add(btnSiguienteUno);
		dlgUno.setResizable(true);
		dlgUno.setSize(220,125);
		dlgUno.setLocationRelativeTo(null);
		dlgUno.setBackground(fondo);

		dlgDos.setLayout(new FlowLayout ());
		//----		
		dlgDos.add(lblChinosDos);
		dlgDos.add(txtGuardaDos);
		dlgDos.add(btnSiguienteDos);
		dlgDos.setResizable(true);
		dlgDos.setSize(220,125);
		dlgDos.setLocationRelativeTo(null);
		dlgDos.setBackground(fondo);
		//----
		dlgTres.setLayout(new FlowLayout ());

		dlgTres.add(lblChinosTres);
		dlgTres.add(txtGuardaTres);
		dlgTres.add(btnSiguienteTres);
		dlgTres.setResizable(true);
		dlgTres.setSize(220,125);
		dlgTres.setLocationRelativeTo(null);
		dlgTres.setBackground(fondo);

	}
}
