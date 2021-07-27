package es.pepecl2020.chinos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

public class VistaJugando extends Frame
{
	private static final long serialVersionUID = 1L;
	
	String jugadorUno,jugadorDos, jugadorTres;
	int numTotal, moUna, moDos, moTres;
	int eliNumUno, eliNumDos, eliNumTres;
	
	Label lblSacados = new Label("Los chinos que se han sacado");
	Label lblSacadosDos = new Label("son los siguientes");
	Label lblResultado = new Label ("Ha ganado");
	Label lblEmpate = new Label ("Empate");
	Label lblNadie = new Label("Nadie gana");
	
	Button btnOtraVez = new Button ("Jugar de Nuevo");
	Button btnFin = new Button ("Fin");
	
	Toolkit tHerramientas;
	Image manoAbierta, otraVez, chino, fin;
	
	/*
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	*/
	
	
	public VistaJugando (String jUno, String jDos, String jTres, int numTotal, int eliUno, int eliDos, int eliTres, int numUno, int numDos, int numTres)
	{
		
		jugadorUno = jUno;
		jugadorDos = jDos;
		jugadorTres = jTres;
		
		this.numTotal = numTotal;
		
		eliNumUno = eliUno;
		eliNumDos = eliDos;
		eliNumTres = eliTres;
		
		
		moUna = numUno;
		moDos = numDos;
		moTres = numTres;
		
		
		System.out.println(eliNumUno);
		System.out.println(moUna);
		Color fondo = new Color(255,102,102);
		setLayout(new FlowLayout());
		
		/*add("West",p1);
		p1.add(lblSacados);
		p1.add(lblSacadosDos);
		*/
		tHerramientas = getToolkit();
		manoAbierta = tHerramientas.getImage("./Imagenes/ManoAbiertaR.png");
		otraVez =tHerramientas.getImage("./Imagenes/otra-vez.png");
		chino = tHerramientas.getImage("./Imagenes/ChinoR.png");
		fin = tHerramientas.getImage("./Imagenes/finR.png");
		
		setResizable(true);
		setSize(600,600);
		setBackground(fondo);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void paint (Graphics dibu)
	{
		Font fuente = new Font("Jokerman", Font.BOLD, 18);
		dibu.setFont(fuente);
		dibu.setColor(Color.blue);
		dibu.drawImage(manoAbierta, 450, 150, this);
		dibu.drawImage(manoAbierta, 300, 250, this);
		dibu.drawImage(manoAbierta, 450, 350, this);
		dibu.drawImage(otraVez, 100, 400, this);
		dibu.drawImage(fin, 450, 500, this);
		
		dibu.drawString("Los chinos sacados son", 75, 250);
		dibu.drawString("los siguientes - " + numTotal + " -", 75, 280);
		
		dibu.setColor(Color.green);
		dibu.drawString(jugadorUno, 460, 130);
		dibu.drawString(jugadorDos, 310, 230);
		dibu.drawString(jugadorTres, 460, 330);
		dibu.setColor(Color.blue);
		
		 if (((eliNumUno == numTotal)&&(eliNumDos == numTotal)) || ((eliNumUno == numTotal) && (eliNumTres == numTotal)) || ((eliNumUno == numTotal)&&(eliNumDos == numTotal)&& (eliNumTres == numTotal)) || ((eliNumDos == numTotal)&&(eliNumTres == numTotal)))
		 {
			 dibu.drawString("Empate a  " + numTotal, 100, 200);
			 for (int i = 1; i<= numTotal; i++)
			 {
				 dibu.drawImage(chino, 450 + i*2, 150 + i*2, this);
			 }
		 }
		 else if (eliNumUno == numTotal)
		 {
			 dibu.drawString("¡Ha ganado!  " + jugadorUno, 100, 200);
			 
			 for (int i = 1; i<= moUna; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 160 + i*10, this);
			 }
			 for (int i = 1; i<= moDos; i++)
			 {
				 dibu.drawImage(chino, 310 + i*10, 260 + i*10, this);
			 }
			 for (int i = 1; i<= moTres; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 360 + i*10, this);
			 }
		 }
		 else if (eliNumDos == numTotal)
		 {
			 dibu.drawString("¡Ha ganado!  " + jugadorDos, 100, 200);
			 
			 for (int i = 1; i<= moUna; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 160 + i*10, this);
			 }
			 for (int i = 1; i<= moDos; i++)
			 {
				 dibu.drawImage(chino, 310 + i*10, 260 + i*10, this);
			 }
			 for (int i = 1; i<= moTres; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 360 + i*10, this);
			 }
		 }
		 else if (eliNumTres == numTotal)
		 {
			 dibu.drawString("¡Ha ganado!  " + jugadorTres, 100, 200);
			 
			 for (int i = 1; i<= moUna; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 160 + i*10, this);
			 }
			 for (int i = 1; i<= moDos; i++)
			 {
				 dibu.drawImage(chino, 310 + i*10, 260 + i*10, this);
			 }
			 for (int i = 1; i<= moTres; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 360 + i*10, this);
			 }
		 }
		 else 
		 {
			 dibu.drawString(" No ha ganado naide ", 100, 200);
			 
			 dibu.setColor(Color.green);
			 
			 dibu.drawString(" Esto eligieron ------>", 120, 220);
			 
			 for (int i = 1; i<= moUna; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 160 + i*10, this);
			 }
			 for (int i = 1; i<= moDos; i++)
			 {
				 dibu.drawImage(chino, 310 + i*10, 260 + i*10, this);
			 }
			 for (int i = 1; i<= moTres; i++)
			 {
				 dibu.drawImage(chino, 460 + i*10, 360 + i*10, this);
			 }
			 
		 }
		  
	}
	
}
