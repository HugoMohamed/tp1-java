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
		System.out.println("Vous avez entré : " + nombre);
		*/
		
		int choix = 0;
		Scanner s;
		
		// Gestion du choix
		do {
			System.out.println("---- Votre choix ----\n"
					+ " 1 - Créer\n"
					+ " 2 - Ouvrir\n"
					+ " 3 - Sauvegarder\n"
					+ " 4 - Insérer\n"
					+ " 5 - Supprimer\n"
					+ " 6 - Afficher\n"
					+ " 7 - Rechercher\n"
					+ " 8 - Quitter\n");

			s = new Scanner(System.in);
			if(s.hasNextInt())
				choix = s.nextInt();
			else
				choix = 0;
				
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

	// Recherche un actualité avec le titrre / mots clés
	private static void rechercher() {
		System.out.println("Rechercher");
	}

	// Affiche le contenu total de la base
	private static void afficher() {
		bdn.afficher();
	}

	// Supprime une actualité dans la base
	public static void supprime() {
		bdn.afficher();
		Scanner s;
		System.out.println("Entrez le numéro de la news à supprimer (0 pour annuler) :");
		s = new Scanner(System.in);
		if(s.hasNextInt()) {
			if(s.nextInt() != 0)
				bdn.supprimer(s.nextInt());
		}
		else System.out.println("Cette news n'existe pas");
	}

	// Insère une nouvelle actualité dans la base
	public static void inserer() {
		Scanner s;

		System.out.println("Entrez un titre");
		s = new Scanner(System.in);
		String titre = s.nextLine();

		System.out.println("Entrez un auteur");
		s = new Scanner(System.in);
		String auteur = s.nextLine();

		System.out.println("Entrez un source");
		s = new Scanner(System.in);
		String source = s.nextLine();
		
		News n = new News(titre, auteur, source);
		
		bdn.ajoute(n);
		
		System.out.println(n.toString());
	}

	// Sauvegarde la base courante
	public static void sauvegarder() {
		System.out.println("Sauvegarder");
	}

	// Charge une base d'actualité existante
	public static void ouvrir() {
		System.out.println("Ouvrir");
	}

	// Crée une nouvelle base d'actualité
	public static void creer() {
		bdn.initialise();
	}
}
