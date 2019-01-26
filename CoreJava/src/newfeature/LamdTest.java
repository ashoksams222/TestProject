package newfeature;


interface Interf
{
	public void hello();
	public static void hi()
	{
		System.out.println("Hello Static");
	}
	default void howru()
	{
		System.out.println("Hello Default");
	}
}
public class LamdTest implements Interf {

	@Override
	public void hello() {
		System.out.println("Hello");
		
	}
public static void main(String[] args) {
	Interf i = ()-> System.out.println("Hello...");
	i.hello();
	i.howru();
	Interf.hi();
}
	
		
	
}
