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
		bdn.initialise();
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
		int news;
		System.out.println("Entrez le numéro de la news à supprimer (0 pour annuler) :");
		s = new Scanner(System.in);
		if(s.hasNextInt()) {
			news = s.nextInt();
			if(news != 0)
				bdn.supprimer(news);
		}
		else System.out.println("Cette news n'existe pas");
	}

	// Insère une nouvelle actualité dans la base
	public static void inserer() {
		Scanner s;
		int x = 0;

		System.out.println("Entrez le numéro du type d'actualité a inserer :\n"
				+ "1 - Article de presse\n"
				+ "2 - Image");
		s = new Scanner(System.in);
		if(s.hasNextInt())
			x = s.nextInt();
		else
			System.out.println("Ce type d'actualité n'existe pas");

		if(x == 1 || x == 2) {
			News n;
			
			System.out.println("Entrez un titre");
			s = new Scanner(System.in);
			String titre = s.nextLine();

			System.out.println("Entrez un auteur");
			s = new Scanner(System.in);
			String auteur = s.nextLine();

			System.out.println("Entrez un source");
			s = new Scanner(System.in);
			String source = s.nextLine();
			
			if(x == 2) {
				System.out.println("Entrez le chemin de l'image");
				s = new Scanner(System.in);
				String chemin = s.nextLine();
				
				System.out.println("Entrez l'extension de l'image (png,jpg,...)");
				s = new Scanner(System.in);
				String type = s.nextLine();
				
				System.out.println("Entrez la resolution X de l'image");
				s = new Scanner(System.in);
				int resolutionX = 0;
				if(s.hasNextInt())
					resolutionX = s.nextInt();
				
				System.out.println("Entrez la resolution Y de l'image");
				s = new Scanner(System.in);
				int resolutionY = 0;
				if(s.hasNextInt())
					resolutionY = s.nextInt();
				
				System.out.println("L'image est elle en couleur ? (o/n)");
				s = new Scanner(System.in);
				boolean couleur = false;
				String choix = s.nextLine();
				if(choix.equals("o"))
					couleur = true;
				
				n = new Image(titre, auteur, source, chemin, type, resolutionX, resolutionY, couleur);
			}
			else {
				System.out.println("Entrez le résumé de l'article :");
				s = new Scanner(System.in);
				String texte = s.nextLine();
				
				System.out.println("Entrez l'url de l'article complet :");
				s = new Scanner(System.in);
				String txtLonger = s.nextLine();
				
				System.out.println("Cette article possede-t-il une version papier ? (o/n)");
				boolean elecOnly = true;
				String choix = s.next();
				if(choix.equals("o"))
					elecOnly = false;
				
				n = new Article(titre, auteur, source, texte, txtLonger, elecOnly);
			}

			bdn.ajoute(n);

			System.out.println(n.toString());
		}
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
