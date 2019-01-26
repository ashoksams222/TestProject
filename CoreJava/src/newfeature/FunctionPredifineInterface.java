package newfeature;

import java.util.function.Function;
import java.util.function.Predicate;
class Student
{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	
}

public class FunctionPredifineInterface {

	public static void main(String[] args) {
		
		Function<Student, String> f=s->{
			int mark=s.mark;
			String grade="";
			if(mark>=80) grade="A[Dictinction]";
			else if (mark>=60) grade="B[First Class]";
			else if (mark>=50) grade="C[Second Class]";
			else if (mark>=30) grade="D[Third Class]";
			else grade="E[Fail]";
			return grade;
			
		};
		/*Predicate<Student> p=s->s.mark>=60;*///it un-comment this line then it show only records which mark >=60
		Student s[]= {new Student("Ashok",100),
				new Student("Puja",60),
				new Student("Mohan",50),
				new Student("sohan",25)
		};
		for(Student s1 : s)
		{
			/*if(p.test(s1))*/
			{
				System.out.println("Student Name : "+s1.name);
				System.out.println("Student Mark : "+s1.mark);
				System.out.println("Student Grade : "+f.apply(s1));
				System.out.println();	
			}
			
		}

	}

}
