import java.util.*;

public class MesNews {
	
	private static BaseDeNews bdn = new BaseDeNews();
	
	public static void main(String[] args)
	{
		/*
		System.out.println("Premier jour");
		
		System.out.println("Entrez un nombre :");
		Scanner s = new Scanner(System.in);
		int nombre = s.nextInt();
		System.out.println("Vous avez entr� : " + nombre);
		*/
		
		int choix = 0;
		Scanner s;
		
		// Gestion du choix
		do {
			System.out.println("---- Votre choix ----\n"
					+ " 1 - Cr�er\n"
					+ " 2 - Ouvrir\n"
					+ " 3 - Sauvegarder\n"
					+ " 4 - Ins�rer\n"
					+ " 5 - Supprimer"
					+ " 6 - Afficher"
					+ " 7 - Rechercher"
					+ " 8 - Quitter");

			s = new Scanner(System.in);
			choix = s.nextInt();

			switch(choix)
			{
			case 1:
				creer();
				break;
			case 2:
				ouvrir();
				break;
			case 3:
				sauvegarder();
				break;
			case 4:
				inserer();
				break;
			case 5:
				supprime();
				break;
			case 6:
				afficher();
				break;
			case 7:
				rechercher();
				break;
			case 8:
				quitter();
				break;
			default:
				System.out.println("Ce choix n'existe pas");	
			}
		}while(choix != 8);
	}

	// Quitte
	private static void quitter() {
		System.out.println("Quitter");
	}

	// Recherche un actualit� avec le titrre / mots cl�s
	private static void rechercher() {
		System.out.println("Rechercher");
	}

	// Affiche le contenu total de la base
	private static void afficher() {
		System.out.println("Afficher");
	}

	// Supprime une actualit� dans la base
	public static void supprime() {
		System.out.println("Supprime");
	}

	// Ins�re une nouvelle actualit� dans la base
	public static void inserer() {
		System.out.println("Inserer");
		News n = new News();
		n.saisir();
		
		System.out.println(n.toString());
	}

	// Sauvegarde la base courante
	public static void sauvegarder() {
		System.out.println("Sauvegarder");
	}

	// Charge une base d'actualit� existante
	public static void ouvrir() {
		System.out.println("Ouvrir");
	}

	// Cr�e une nouvelle base d'actualit�
	public static void creer() {
		System.out.println("Cr�er");
		bdn.initialise();
	}
}
