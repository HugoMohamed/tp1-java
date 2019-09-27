import java.util.TreeSet;

public class BaseDeNews implements Comparable{

	private TreeSet<News> base;
	
	@Override
	public int compareTo(Object o) {
		News n = new News();
		return 0;
	}
	
	public void initialise() {
		this.base = new TreeSet<News>();
	}
	
	public void ajoute(News n) {
		base.add(n);
	}
	
	public void afficher() {
		int i = 0;
		while(i < base.size()) {
			
		}
	}
}
