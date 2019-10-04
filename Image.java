
public class Image extends News{
	
	private String chemin;
	private String format;
	private int resolutionX;
	private int resolutionY;
	private boolean couleur;

	Image(String titre, String auteur, String source, String chemin, String format, int resolutionX, int resolutionY, boolean couleur) {
		super(titre, auteur, source);
		this.chemin = chemin;
		this.format = format;
		this.resolutionX = resolutionX;
		this.resolutionY = resolutionY;
		this.couleur = couleur;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getResolutionX() {
		return resolutionX;
	}

	public void setResolutionX(int resolutionX) {
		this.resolutionX = resolutionX;
	}

	public int getResolutionY() {
		return resolutionY;
	}

	public void setResolutionY(int resolutionY) {
		this.resolutionY = resolutionY;
	}

	public boolean isCouleur() {
		return couleur;
	}

	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	
	public String toString() {
		String isCouleur;
		if(couleur)
			isCouleur = "couleur";
		else
			isCouleur = "N&B";
		return chemin + "\\" + super.getTitre() + "." + format + " " + super.getAuteur() + " " + super.getSource() + " " + resolutionX + "*" + resolutionY + " " + isCouleur;
	}
}
