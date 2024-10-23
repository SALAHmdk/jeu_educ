package fr.collection.jeuxjava;

import java.util.Random;

import javax.swing.JOptionPane;

public class JeuxEducatif {
	
	static Random rand = new Random();
	public static int randRange (int a, int b) {
		return (rand.nextInt(b - a) + a);
	}
	
	static void MenuPrincipal() {
		
		boolean sortie = false;
		while (!sortie) {
			switch (choix(MESSAGE_MENU_PRINCIPAL)) {
			
			case 1:
				MenuCalcul();
				break;
			case 2:
				MenuChiffreMagic();
				break;
				
			case 0:
				sortie = true;
				break;

			default:
				affichage("Erreur");
				break;
			}
		}
	}

	
	static void MenuCalcul() {
		boolean sortie = false;
		
		while (!sortie) {
			switch (choix(MESSAGE_MENU_CALCUL)) {
			case 1:
				AfficheNiveauFacile();
				break;
			case 2:
				AfficheNiveauMoyen();
				break;
			case 3:
				AfficheNiveauDifficle();
				break;
			case 4:
				AfficheNiveauHardCalcul();
				break;
			case 5:
				
				break;
			case 0:
				sortie = true;
				break;

			default:
				affichage("Erreur");
				break;
			}
		}
	}
	
	static String MESSAGE_MENU_CALCUL = "MENU CALCUL \n\n 1- Facile \n 2- Moyen \n 3- Difficile \n 4- Arcade \n\n 0- Menu Principal";
	static String MESSAGE_MENU_PRINCIPAL = "MENU PRINCIPAL \n\n 1- jeu de calcul \n 2- Chiffre Magic \n\n 0- Quitter";
	static void affichage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	static int choix(String Message) {
		return saisieEntier(Message);
	}
	
	static int saisieEntier(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	// Jeu de calcul
	
	static String Menu_Facile = "Pour quitter, rentrer 'E'";
	
	
	static void AfficheNiveauFacile() {
		int x = randRange(0, 6);
		int y = randRange(0, 6);
		int z = x + y;
		int compteur = 0;
	
		int nb = 0;
		do 
		{
			nb = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E' \nScore : " + compteur + "\n\n" + x + " + " + y));
			
			if(nb != z) {
				JOptionPane.showMessageDialog(null, "Mauvaise reponse");
			}
			if(nb == z)
			{
				
				Operation();
			}
			if(nb == Integer.parseInt("E")) {
				
			}
		}
		while(nb  == z);
	}
	
	static void AfficheNiveauMoyen() {
		int x = randRange(6, 15);
		int y = randRange(0, 6);
		int z = x - y;
		int compteur = 0;
	
		int nb = 0;
		do 
		{
			nb = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E' \nScore : " + compteur + "\n\n" + x + " - " + y));
			
			if(nb != z) {
				JOptionPane.showMessageDialog(null, "Au revoir");
			}
			if(nb == z)
			{
				OperationMoyen();
				
			}
			if(nb == Integer.parseInt("E")) {
				
			}
		}
		while(nb  == z);
	}
	
	
	static void AfficheNiveauDifficle(){
	
		int nb = 0;
		int compteur = 0;
		
		for(int i = 0; i < 1000000; i++) {
			
			int a = randRange(0, 10);
			int b = randRange(5, 15);
			int c = a*b;
			nb = Integer.parseInt(JOptionPane.showInputDialog("Pour quitter entrer 'E'\nScore : "+ compteur + "\n\n" + a + " * " + b));
			
			if(nb == c) {
				compteur++;
			}
			if(nb != c) {
				JOptionPane.showMessageDialog(null, "Mauvaise reponse");
			}
		}
		
	}
	
	static void Operation() {
		
		
		int compteur1 = 1;
		
		for(int i = 0 ; i < 100 ; i++) {
			int a = randRange(0, 6);
			int b = randRange(0, 6);
			int c = a + b;
			int nb1 = 0;
			
			nb1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E' \nScore : " + compteur1 + "\n\n" + a + " + " + b));

			if(nb1 == c)
			{
				compteur1++;
				
				
			}else if (nb1 != c) {
				affichage("Mauvaise reponse");
			}
			
			
		}
	}
	
	static void OperationMoyen() {
		int compteur1 = 1;
		
		for(int i = 0 ; i < 100 ; i++) {
			int a = randRange(6, 15);
			int b = randRange(0, 6);
			int c = a - b;
			int nb1 = 0;
			
			nb1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E' \nScore : " + compteur1 + "\n\n" + a + " - " + b));

			if(nb1 == c)
			{
				compteur1++;
				
			}else if (nb1 != c) {
				affichage("Mauvaise reponse");
			}
			
		}
	}
	
	
	static void AfficheNiveauHardCalcul() {
		
		int x,y,z;
		boolean sortie = false;
		JOptionPane.showMessageDialog(null, "Pour ce niveau vous allez parametre le jeu");
		x = Integer.parseInt(JOptionPane.showInputDialog("Entrer la valeur de la borne inferieure"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Entrer la valeur de la borne superieure"));
		z = Integer.parseInt(JOptionPane.showInputDialog("Entrer le pas d'aggrandissement pour chaque bonne reponse"));
		
		
		
		while(!sortie) {
			
			switch (choix("Autoriser d'autres opération que l'addition \n\n 1 - Oui\n 0- Non ")) {
			case 1:
				
				break;
			case 0:
				
				int compteur1 = 0;
				int compteur2 = 5;
				int d = 0;
				int t = y + d;
				for(int i = 0 ; i < 100 ; i++) {
					

					int a = randRange(x, t);
					int b = randRange(x, t);
					int c = a + b;
					int nb1 = 0;
					
					nb1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E'\nNombre de tentavies : "+compteur2 +  "\nScore :" + compteur1 + "\n\n" + a + " + " + b));

					if(nb1 == c)
					{
						compteur1++;
						d = z + d;
						
					}
					if (nb1 != c) {
						affichage("Mauvaise reponse");
						compteur2--;
					}
					
					
				}
				break;
			default:
				sortie = true;
				break;
			}
		}

	}
	
	// CHIFFRE MAGIC
	
	static String MESSAGE_MENU_CHRIFFRE = "MENU CHIFFRE MAGIC \n\n 1- Facile \n 2- Moyen \n 3- Difficile \n 4- Hard \n\n 0- Menu Principal";
	
	static void MenuChiffreMagic() {
		boolean sortie = false;
		
		while (!sortie) {
			switch (choix(MESSAGE_MENU_CHRIFFRE)) {
			case 1:
				AfficheNiveauFacileChiffre();
				break;
			case 2:
				AfficheNiveauMoyenChiffre();
				break;
			case 3:
				AfficheNiveauDifficile();
				break;
			case 4:
				AfficheNiveauHard();
				break;
			case 0:
				sortie = true;
				break;

			default:
				affichage("Erreur");
				break;
			}
		}
	}
		
	// Niveau Facile
	static void AfficheNiveauFacileChiffre() {
		
		
		int compteur = 0;
		int a = randRange(1, 10);
		int nb1 = 0;
		for(int i = 0 ; i < 100 ; i++) {
			
			nb1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pour quitter, rentrer 'E' \nScore : " + compteur + "\n\n" + "Deviner le chiffre magic compris entre [1 , 10]"));

			if(a == nb1)
			{
				compteur++;
				
				
			}if (nb1 < a) {
				affichage("Trop Petit");
			}if (nb1 > a) {
				affichage("Trop Grand");
			}
			
			
		}
	}
	
	// Niveau Moyen
	static void AfficheNiveauMoyenChiffre() {
		
		int a = randRange(1, 10);
		int compteur = 0;
		int nb = 0;
		int compteur2 = 5;
		
		for(int i = 0; i <= 100000; i++) {
			
			nb = Integer.parseInt(JOptionPane.showInputDialog("Pour quitter, rentrer 'E'\nNombre de tentavie : " + compteur2 + "\nScore : " + compteur + "\n\n" + "Deviner le chiffre magic compris entre [1 , 10]"));
			
			if(a == nb) {
				compteur++;
			}
			if(a > nb) {
				compteur2--;
				JOptionPane.showMessageDialog(null, "Trop Petit");
			}
			if(a < nb) {
				compteur2--;
				JOptionPane.showMessageDialog(null, "Trop Grand");
			}
			if(compteur2 == 0) {
				JOptionPane.showMessageDialog(null, "Game Over");
				break;
			}
		}
	}

	// Niveau Difficile
	
	static void AfficheNiveauDifficile() {
		
		
		int nb = 0;
		int compteur = 0;
		int x = 0;
		int y = 5;
		
		for(int i = 0; i < 1000000; i++) {
			
			int z = x + y;
			int a = randRange(1, z);
			
			nb = Integer.parseInt(JOptionPane.showInputDialog("Pour quitter, rentrer 'E'" + "\nScore : " + compteur + "\n\n" + "Deviner le chiffre magic compris entre " + "[1 ," + z +"]"));
			
			if(nb == a) {
				compteur++;
				x+=5;
			}
			if(nb < a) {
				JOptionPane.showMessageDialog(null, "Trop petit");
			}
			if(nb > a) {
				JOptionPane.showMessageDialog(null, "Trop Grand");
			}
		}
	}
	
	// Niveau Hard
	
	static void AfficheNiveauHard() {
		
		
		int nb = 0;
		int compteur = 0;
		int compteur2 = 5;
		int x,y,z;
		int t = 0;
		
		JOptionPane.showMessageDialog(null, "Pour ce niveau vous allez entrer votre interval dans lequel votre nombre magic se trouvera");
		x = Integer.parseInt(JOptionPane.showInputDialog("Entrer la valeur de la borne inferieure"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Entrer la valeur de la borne superieure"));
		
		
		for(int i = 0; i < 1000000; i++) {
			
			z = y + t;
			int a = randRange(x, z);
			nb = Integer.parseInt(JOptionPane.showInputDialog("Pour quitter, rentrer 'E'" + "\nNombre de tentatives : "+ compteur2 + "\nScore : " + compteur + "\n\n" + "Deviner le chiffre magic compris entre " + "["+x+","+z+"]"));
			
			if(nb == a) {
				compteur++;
				t+=5;
			}
			if(nb < a) {
				JOptionPane.showMessageDialog(null, "Trop petit");
				compteur2--;
			}
			if(nb > a) {
				JOptionPane.showMessageDialog(null, "Trop Grand");
				compteur2--;
			}
			if(compteur2 == 0) {
				JOptionPane.showMessageDialog(null, "GAME OVER");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		MenuPrincipal();
		
	}

}
