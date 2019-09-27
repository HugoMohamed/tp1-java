import java.net.URL;
import java.time.LocalDate;
import java.util.Scanner;

public class News {

	private String titre;
	private LocalDate date;
	private String auteur;
	private String source;
	
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
	
	public String toString() {
		return titre + " " + date + " " + auteur + " " + source;
	}
}
