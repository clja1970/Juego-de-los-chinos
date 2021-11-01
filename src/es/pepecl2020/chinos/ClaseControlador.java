package es.pepecl2020.chinos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener,WindowListener, ItemListener
{
	VistaPrincipal objVistaPrincipal = null;
	ClaseModelo objClaseModelo = null;
	int numUno, numDos, numTres;


	public ClaseControlador (VistaPrincipal objVistaPrincipal, ClaseModelo objClaseModelo)
	{
		this.objVistaPrincipal = objVistaPrincipal;
		this.objClaseModelo = objClaseModelo;

		objVistaPrincipal.btnAyuda.addActionListener(this);

		objVistaPrincipal.BtnSiguiente.addActionListener(this);
		objVistaPrincipal.BtnSiguiente.setEnabled(false);

		objVistaPrincipal.btnSiguienteUno.addActionListener(this);
		objVistaPrincipal.btnSiguienteDos.addActionListener(this);
		objVistaPrincipal.btnSiguienteTres.addActionListener(this);

		objVistaPrincipal.choC.addItemListener(this);

		objVistaPrincipal.dlgUno.addWindowListener(this);
		objVistaPrincipal.dlgDos.addWindowListener(this);
		objVistaPrincipal.dlgTres.addWindowListener(this);
		objVistaPrincipal.addWindowListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent choC)
	{

		System.out.println("Entra");


		if (" Elige número de jugadores".equals(choC.getItem()))
		{
			objVistaPrincipal.BtnSiguiente.setEnabled(false);
		}

		else if (" Dos Jugadores".equals(choC.getItem()))
		{
			System.out.println("Dos jugadores");
			objVistaPrincipal.BtnSiguiente.setEnabled(true);
			objVistaPrincipal.txtGuardaTres.setVisible(false);
			objVistaPrincipal.lblChinosTres.setVisible(false);
			objVistaPrincipal.txtJTres.setVisible(false);
			objVistaPrincipal.dlgTres.setTitle(" Resultado ");
			objVistaPrincipal.txtGuardaTres.setText("0");
		}
		else if (" Tres Jugadores".equals(choC.getItem()))
		{
			System.out.println("Tres jugadores");
			objVistaPrincipal.BtnSiguiente.setEnabled(true);
			objVistaPrincipal.txtJTres.setVisible(true);
			objVistaPrincipal.txtGuardaTres.setVisible(true);
			objVistaPrincipal.lblChinosTres.setVisible(true);
			objVistaPrincipal.txtGuardaTres.setText("");
		}
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
	public void windowClosing(WindowEvent salir)
	{
		// TODO Auto-generated method stub
		if (objVistaPrincipal.isActive())
		{
			System.exit(0);
		}
		else if (objVistaPrincipal.dlgUno.isActive())
		{
			objVistaPrincipal.setVisible(true);
			objVistaPrincipal.dlgUno.setVisible(false);
		}
		else if (objVistaPrincipal.dlgDos.isActive())
		{
			objVistaPrincipal.setVisible(true);
			objVistaPrincipal.dlgDos.setVisible(false);
		}
		else if (objVistaPrincipal.dlgTres.isActive())
		{
			objVistaPrincipal.setVisible(true);
			objVistaPrincipal.dlgTres.setVisible(false);		
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
	public void actionPerformed(ActionEvent event)
	{

		if(event.getSource().equals(objVistaPrincipal.BtnSiguiente))
		{		
			objVistaPrincipal.dlgUno.setTitle(objVistaPrincipal.txtJUno.getText());
			objVistaPrincipal.dlgUno.setVisible(true);
		}
		else if (event.getSource().equals(objVistaPrincipal.btnSiguienteUno))
		{
			objVistaPrincipal.dlgDos.setTitle(objVistaPrincipal.txtJDos.getText());
			objVistaPrincipal.dlgUno.setVisible(false);
			objVistaPrincipal.dlgDos.setVisible(true);
		}
		else if (event.getSource().equals(objVistaPrincipal.btnSiguienteDos))
		{
			objVistaPrincipal.dlgTres.setTitle(objVistaPrincipal.txtJTres.getText());
			objVistaPrincipal.dlgDos.setVisible(false);
			objVistaPrincipal.dlgTres.setVisible(true);
		}
		else if (event.getSource().equals(objVistaPrincipal.btnSiguienteTres))
		{
			try
			{

				//Guia para saber por donde se va
				System.out.println("Siguiente ventana");
				//Se pasa lo que se guarda en cadena en el texto a INT
				numUno = Integer.parseInt(objVistaPrincipal.txtGuardaUno.getText());
				numDos = Integer.parseInt(objVistaPrincipal.txtGuardaDos.getText());
				numTres = Integer.parseInt(objVistaPrincipal.txtGuardaTres.getText());
				if ((numUno >3 || numUno<0)||(numDos >3 ||numDos <0)||(numTres >3 || numTres <0))
				{
					System.out.println("números");
					objVistaPrincipal.dlgTres.setVisible(false);
					objVistaPrincipal.setVisible(true);
					System.out.println("Erroneos");
				}

				else 
				{
					int numTotal = numUno + numDos + numTres;

					//Ahora la siguiente ventana la creamos como un nuevo objeto de la clase Vistanumeros
					System.out.println(numUno);
					System.out.println(numDos);
					System.out.println(numTres);
					//suma de los numeros;
					System.out.println(numTotal);

					//Lo que hemos guardado en las variables hay que pasarla para crear el objeto de la clase
					VistaNumeros VistaNumeros = new VistaNumeros (objVistaPrincipal.txtJUno.getText(),objVistaPrincipal.txtJDos.getText(), objVistaPrincipal.txtJTres.getText(), numTotal, numUno, numDos, numTres);
					ClaseModelo ClaseModelo = new ClaseModelo ();

					objVistaPrincipal.setVisible(false);
					objVistaPrincipal.dlgTres.setVisible(false);

					new ClaseControladorDos (VistaNumeros,ClaseModelo);
				}
			}

			catch (NumberFormatException n)
			{
				System.out.println("Intenta poner lo que se pide melón ");
				objVistaPrincipal.dlgTres.setVisible(false);
				objVistaPrincipal.setVisible(true);

			}
		}
	}
}




