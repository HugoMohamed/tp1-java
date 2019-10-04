

public class Article extends News{

	// contenu
	private String texte;
	// url pour contenu total (si trop long)
	private String txtLonger;
	// version electronique uniquement
	private boolean elecOnly;

	Article(String titre, String auteur, String source, String texte, String txtLonger, boolean elecOnly) {
		super(titre, auteur, source);
		this.texte = texte;
		this.txtLonger = txtLonger;
		this.elecOnly = elecOnly;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getTxtlonger() {
		return txtLonger;
	}

	public void setTxtlonger(String txtlonger) {
		this.txtLonger = txtlonger;
	}

	public boolean isElecOnly() {
		return elecOnly;
	}

	public void setElecOnly(boolean elecOnly) {
		this.elecOnly = elecOnly;
	}

	public String toString() {
		String elec;
		if(elecOnly)
			elec = "version electronique uniquement";
		else
			elec = "version electronique et papier";
		return super.toString() + " \"" + texte + "\" " + txtLonger + " " + elec;
	}
}
