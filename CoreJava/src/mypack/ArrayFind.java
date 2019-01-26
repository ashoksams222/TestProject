package mypack;

public class ArrayFind {
	public static void main(String[] args) {
		int a[]= {4,5,6,1,2,3,8};
		int findelement=10;
		int result=find(a,findelement);
		if(result==0)
		{
			System.out.println("Element Not Found");
		}
	}
	static int find(int a1[],int f1)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==f1)
			{
				System.out.println("Element Found"+a1[i]+"Index Of"+i);
				return 1;
			}
		}
		return 0;
	}

}
