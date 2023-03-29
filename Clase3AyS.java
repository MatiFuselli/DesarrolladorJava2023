package PaqueteDeLaClase3AyS;

public class Clase3AyS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto1 = "Buenos dias";
		String texto2 = "buenas noches";
		String texto5 = "guten tag";
		
		boolean texto3 = texto1.equals(texto2);
		System.out.println("los textos 1 y 2 son iguales?:" +texto3);
		
		texto3 = texto2.contains("che");
		System.out.println("texto 2 contiene los caracteres \"che\"?: " + texto3);
		
		System.out.println("Pasamos a mayusculas texto1 " +texto1.toUpperCase());
		
		String texto4 = texto2.replace("noches","tardes");
		System.out.println("La variable texto4 a minusculas: " +texto4.toLowerCase());
		
		
	}

}
