package newfeature;

import java.util.function.Consumer;
class Movie
{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
	
}

public class ConsumerPredefineInterface {

	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.println(m.name+" Ready to release ");
		Consumer<Movie> c2=m->System.out.println(m.name+" Release but it is bigger flop");
		Consumer<Movie> c3=m->System.out.println(m.name+" Storeing information in databese");
		
		/*Consumer<Movie> cc=c1.andThen(c2).andThen(c3);*///If un-commenting this line then print all object data
		
		Movie m = new Movie("Player");
		c2.accept(m);
		
		/*cc.accept(m);*/
	}

}
