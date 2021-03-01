
public class Nivell1 {
 
	
	public static void main(String args[]) {
	
	// FASE 1 ------------------------------------------	
		
		String nom = new String ("Eduard");
		String cognom1 = new String ("Sampietro");
		String cognom2 = new String ("Amill");
		int dia = 11;
		int mes = 1;
		int any = 1971;
		System.out.println(cognom1 + " "+ cognom2 + ", " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
	
		
		
		
	// FASE 2 -------------------------------------------	
		
		final int anyInici = 1948;   //any de traspàs inicial
		int cadaQuant = 4;
		int numAnysTraspas = ((1971 - 1948)/cadaQuant); 
		int traspas = ((any - anyInici) % cadaQuant);  // si el reste és zero és any de traspàs, sinò no ho és
	
		System.out.println("Entre " + anyInici + " i " + any + " hi ha "+ numAnysTraspas + " anys de traspàs");	
	
		
		
	// FASE 3 --------------------------------------------

		String fals = new String("L'any " + any + " NO és any de traspàs");
		String cert = new String("L'any " + any + " SI és any de traspàs");
		int anyInici2 = 1948;   // declarem una nova variable int per l'any inici --> a la FASE 2 era una const
		boolean anyNaixement;
		anyNaixement = false;
		
		for (anyInici2 = 1948 ;anyInici2 < any ; anyInici2 = anyInici2 + cadaQuant) {
			System.out.println(anyInici2);	
		}
		
		if (anyNaixement == true) {
			System.out.println(cert);
		} else {
			System.out.println(fals);
		}
	
		
		
	// FASE 4 -------------------------------------------
	
		String nomComplert = nom + " " + cognom1 + " " + cognom2;
		String dataNaixement = dia + "/" + mes + "/" + any;
	
		System.out.println("El meu nom és " + nomComplert);
		System.out.println("Vaig néixer el dia " + dataNaixement);	
	
		if (traspas == 0) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {	
			System.out.println("El meu any de naixement NO és de traspàs");
		}
	
	}
}
