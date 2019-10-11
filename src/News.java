import java.time.LocalDate;

public abstract class News implements Comparable<News>{

	private String titre;
	private LocalDate date;
	private String auteur;
	private String source;
	
	News(String titre, String auteur, String source){
		this.titre = titre;
		this.auteur = auteur;
		this.source = source;
		this.date = LocalDate.now();
	}
	
	// Getter
	public String getTitre() {
		return titre;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public String getSource() {
		return source;
	}
	
	// Setter
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	/*
	// Affiche la news
	public void afficher() {
		System.out.println(titre + " " + date + " " + auteur + " " + source);
	}
	*/
	
	/*
	// demande a l'utilisateurs de personnaliser la news
	public void saisir() {
		Scanner s;
		
		System.out.println("Entrez un titre");
		s = new Scanner(System.in);
		this.titre = s.nextLine();
		
		System.out.println("Entrez un auteur");
		s = new Scanner(System.in);
		this.auteur = s.nextLine();
		
		System.out.println("Entrez un source");
		s = new Scanner(System.in);
		this.source = s.nextLine();
		
		this.date = LocalDate.now();
		
	}
	*/
	
	public String toString() {
		return titre + " " + date + " " + auteur + " " + source;
	}

	@Override
	public int compareTo(News n) {
		return this.titre.compareTo(n.titre);
	}
}
