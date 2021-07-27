package es.pepecl2020.chinos;

public class Chinos
{

	public static void main(String[] args)
	{
		VistaPrincipal objVistaPrincipal = new VistaPrincipal();
		ClaseModelo objModelo = new ClaseModelo ();

		new ClaseControlador (objVistaPrincipal,objModelo);	
	}
}
