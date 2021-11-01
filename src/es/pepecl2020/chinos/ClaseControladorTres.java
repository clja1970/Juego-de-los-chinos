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

public class ClaseControladorTres implements ActionListener,WindowListener, ItemListener, MouseListener,EventListener, KeyListener
{
	VistaJugando objVistaJugando = null;
	ClaseModelo objModel = null;
	public ClaseControladorTres (VistaJugando objVistaJugando, ClaseModelo objModel)
	{
		this.objModel = objModel;
		this.objVistaJugando = objVistaJugando;

		objVistaJugando.addKeyListener(this);
		objVistaJugando.addMouseListener(this);
		objVistaJugando.addWindowListener(this);




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
	public void mouseClicked(MouseEvent eve)
	{
		int x = eve.getX();
		int y = eve.getY();

		System.out.println("Coordenada x: " + x);
		System.out.println("Coordenada y: " + y);
		if (this.objVistaJugando.isActive())
		{
			if ((x>=100)&&(x<=198)&&(y>=401)&&(y<=431))
			{
				System.out.println("Illoooo");
				objVistaJugando.setVisible(false);

				VistaPrincipal objVistaPrincipal = new VistaPrincipal();
				ClaseModelo objClaseModelo = new ClaseModelo();

				new ClaseControlador ( objVistaPrincipal, objClaseModelo);
			}
			else if ((x>=450)&&(x<=525)&&(y>=500)&&(y<=530))
			{
				System.exit(0);
			}
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
	public void windowClosing(WindowEvent arg0)
	{ 	 
		if (objVistaJugando.isActive())
		{
			objVistaJugando.setVisible(false);

			VistaPrincipal objVistaPrincipal = new VistaPrincipal();
			ClaseModelo objClaseModelo = new ClaseModelo();

			new ClaseControlador ( objVistaPrincipal, objClaseModelo);
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
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub

	}
}
