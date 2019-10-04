import java.util.Iterator;
import java.util.TreeSet;

public class BaseDeNews{

	private TreeSet<News> base;

	// initialise la base
	public void initialise() {
		this.base = new TreeSet<News>();
	}

	// ajoute une news dans la base
	public void ajoute(News n) {
		base.add(n);
	}

	// affiche la base
	public void afficher() {
		if(base.isEmpty())
			System.out.println("La base est vide");
		else {
			News n;
			int i = 1;
			Iterator<News> e = base.iterator();
			while(e.hasNext()){
				n = e.next();
				System.out.println(i + " " + n.toString());
				i++;
			}
		}

	}
	
	public void supprimer(int numNews) {
		Iterator<News> e = base.iterator();
		int i = 1;
		News n;
		boolean stop = true;
		while(e.hasNext() && stop) {
			n = e.next();
			if(i == numNews) {
				base.remove(n);
				stop = false;
				System.out.println("News supprimée");
			}
			i++;
		}
	}
}
