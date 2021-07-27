package es.pepecl2020.chinos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class VistaNumeros extends Frame

{
	private static final long serialVersionUID = 1L;
	
	String jugadorUno, jugadorDos, jugadorTres;
	
	Label lblAcierta = new Label ("Acierta el número de chinos");
	Label lblJugadorUno = new Label("Jugador Uno");
	TextField txtJugadorUno = new TextField ();
	Label lblJugadorDos = new Label("Jugador Dos");
	TextField txtJugadorDos = new TextField ();
	Label lblJugadorTres = new Label("Jugador Tres");
	TextField txtJugadorTres = new TextField ();
	Label lblLineas = new Label("------------");
	Button btnSiguiente = new Button ("Siguiente");
	
	int numTotal, numUno, numDos, numTres;
	
	
	
	Toolkit herramienta;
	Image manoCerrada;
	

	public VistaNumeros(String jUno, String jDos, String jTres, int numTotal, int numUno, int numDos, int numTres)
	{
		
		jugadorUno = jUno;
		jugadorDos = jDos;
		jugadorTres = jTres;
		
		this.numUno = numUno;
		this.numDos = numDos;
		this.numTres = numTres;
		
		this.numTotal = numTotal;
		
		System.out.println(jugadorUno);
		System.out.println(jugadorDos);
		System.out.println(jugadorTres);
		
		Color fondo = new Color(255,102,102);
		setLayout( new FlowLayout());
		setBackground(fondo);
		
		
		
		/*Panel pA = new Panel();
		add("North",pA);
		Panel pB = new Panel();
		add("Center",pB);
		Panel pC = new Panel();
		add("South",pC);
		*/
		
		//pA.
		add(lblAcierta);
		// Se establecen en los labels los nombres de los jugadores
		
		lblJugadorUno.setText(jugadorUno);
		//pB.
		add(lblJugadorUno);
		//pB.
		add(txtJugadorUno);
		lblJugadorDos.setText(jugadorDos);
		//pB.
		add(lblJugadorDos);
		//pB.
		add(txtJugadorDos);
		lblJugadorTres.setText(jugadorTres);
		//pB.
		add(lblJugadorTres);
		//pB.
		add(txtJugadorTres);
		add(lblLineas);
		//pC.
		add(btnSiguiente);
		
		herramienta = getToolkit();
		manoCerrada = herramienta.getImage("./Imagenes/ManoCerradaR.png");
		
		setSize(200,300);
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	public void paint (Graphics g)
	
	{
		Font fuente = new Font("Jokerman", Font.BOLD, 18);
		g.setFont(fuente);
		g.setColor(Color.blue);
		g.drawString("Puño cerrado", 40, 265);
		g.drawImage(manoCerrada, 50, 150, this);
	}
}
