package es.pepecl2020.chinos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;

public class ClaseControladorDos implements ActionListener,WindowListener, ItemListener, MouseListener,EventListener, KeyListener
{
	VistaNumeros objVistaNumeros = null;
	ClaseModelo objModelo = null;



	public ClaseControladorDos (VistaNumeros objVistaNumeros, ClaseModelo objModelo)
	{
		this.objVistaNumeros= objVistaNumeros;
		this.objModelo = objModelo;

		objVistaNumeros.addKeyListener(this);
		objVistaNumeros.addMouseListener(this);
		objVistaNumeros.addWindowListener(this);

		objVistaNumeros.btnSiguiente.addKeyListener(this);
		objVistaNumeros.btnSiguiente.addActionListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent event)
	{
		
		//Para dar las coordenadas

		/*int x = event.getX();
		int y = event.getY();
		 
		System.out.println("hola");
		 */
		if (this.objVistaNumeros.isActive())
		{
			//System.out.println("La coordenada x: " + x);
			//System.out.println("La coordenada y: " + y);
			
		}
		

	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent even)
	{
		if (objVistaNumeros.isActive())
		{
			objVistaNumeros.setVisible(false);
			
			VistaPrincipal objVistaPrincipal = new VistaPrincipal();
			ClaseModelo objClaseModelo = new ClaseModelo ();
			
			new ClaseControlador (objVistaPrincipal,objClaseModelo);
		}

	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if (evento.getSource().equals(objVistaNumeros.btnSiguiente))
		{	
			try
			{
			int eliUno = Integer.parseInt(objVistaNumeros.txtJugadorUno.getText());
			int eliDos = Integer.parseInt(objVistaNumeros.txtJugadorDos.getText());
			int eliTres = Integer.parseInt(objVistaNumeros.txtJugadorTres.getText());
			
			VistaJugando objVistaJugando = new VistaJugando(objVistaNumeros.jugadorUno, objVistaNumeros.jugadorDos, objVistaNumeros.jugadorTres, objVistaNumeros.numTotal, eliUno, eliDos, eliTres, objVistaNumeros.numUno, objVistaNumeros.numDos, objVistaNumeros.numTres);
			ClaseModelo objModel = new ClaseModelo();
			
			objVistaNumeros.setVisible(false);
			
			new ClaseControladorTres (objVistaJugando, objModel);
			}
			catch (NumberFormatException excep)
			{
				objVistaNumeros.txtJugadorUno.setText("0");
				objVistaNumeros.txtJugadorDos.setText("0");
				objVistaNumeros.txtJugadorTres.setText("0");
			}
			
		}


	}
}
