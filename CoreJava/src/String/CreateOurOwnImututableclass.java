package String;

public final class CreateOurOwnImututableclass {
	
	
		private int i;
		
		CreateOurOwnImututableclass(int i)
		{
			this.i = i;
			
		}
		
		public CreateOurOwnImututableclass modify(int i)
		{
			if(this.i == i)
			{
				return this;
			}
			else
			{
				return (new CreateOurOwnImututableclass(i));
			}
			
				
		}
		public static void main(String[] args) {
			CreateOurOwnImututableclass t1 = new CreateOurOwnImututableclass(10);
			CreateOurOwnImututableclass t2 = t1.modify(100);
			CreateOurOwnImututableclass t3 = t1.modify(10);
			System.out.println(t1==t2);
			System.out.println(t1==t3);
			
			
		}

		
		}
		
	


