package sort;

public class ArrayAsendingAndDesendingOrder {

	
		 
		 public static void main(String[] args) {
		  int[] a={5,2,1,4};
		  ArrayAsendingAndDesendingOrder sia=new ArrayAsendingAndDesendingOrder();
		  int[] des=sia.toDescendingOrder(a);
		  int[] asc=sia.toAsscendingOrder(a);
		  System.out.println(">>>>>>>>>>>descending order>>>");
		  for(int i=0;i<des.length;i++){
		   System.out.print(des[i]+"\t");
		  }
		  System.out.println("");
		  System.out.println(">>>>>>>asscending order>>>>>>");
		  for(int i=0;i<asc.length;i++){
		   System.out.print(asc[i]+"\t");
		  }
		 }
		  public int[] toDescendingOrder(int[] a){
		   int[] b=toAsscendingOrder(a);
		   int c[]=new int[b.length];
		   int j=0;
		   for(int i=b.length-1;i>=0;i--){
		    c[j]=b[i];
		    j++;
		   }
		 return c;
		  }
		  public int[] toAsscendingOrder(int[] a){
		  int swap;
		  for(int i=0;i<a.length-1;i++){
		   for(int j=0;j<a.length-1-i;j++){
		    if(a[j]>a[j+1]){
		     swap=a[j];
		     a[j]=a[j+1];
		     a[j+1]=swap;
		    }
		   } 
		  }
		   return a;
		  }
		}

