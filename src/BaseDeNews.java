import java.util.Iterator;
import java.util.TreeSet;

public class BaseDeNews{

	private TreeSet<News> base;

	public void initialise() {
		this.base = new TreeSet<News>();
	}

	public void ajoute(News n) {
		base.add(n);
	}

	public void afficher() {
		if(base.isEmpty())
			System.out.println("La base est vide");
		else {
			News n;
			Iterator<News> e = base.iterator();
			while(e.hasNext()){
				n = e.next();
				System.out.println(n.toString());
			}
		}

	}
}
