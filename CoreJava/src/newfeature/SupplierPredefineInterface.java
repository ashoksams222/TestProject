package newfeature;

import java.sql.Date;
import java.util.function.Supplier;

public class SupplierPredefineInterface {

	public static void main(String[] args) {
		
		//Print the current date
		Supplier<Date> s=()-> new Date(0);
		System.out.println(s.get());
		
		
		//Generates OTP of 6 digits Number
		Supplier<String> s1=()->{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());

	}

}
