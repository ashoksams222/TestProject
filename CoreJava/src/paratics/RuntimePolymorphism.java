package paratics;

public class RuntimePolymorphism {
	
	public void show()
	{
		System.out.println("Hello RuntimePolymorphism");
	}

}
 class RuntimePolymorphism1 extends RuntimePolymorphism
 {
	 public void show()
	 {
		 System.out.println("Hello RuntimePolymorphism1");
	 }
 }
 class Test
 {
	 
	 
	 public static void main(String[] args) {
		 RuntimePolymorphism obj=new RuntimePolymorphism();
		 RuntimePolymorphism obj1 = new RuntimePolymorphism1();
		 obj.show();
		 obj1.show();
	}
 }