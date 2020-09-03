// pattern //
import java.util.Scanner;
class pat{
	public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for(int i=1;i<=x;i++){
	for(int l=x;l>=i;l--){
      System.out.print(" ");
	}
	for(int j=1;j<=i;j++){
     System.out.print("* ");
	}
	System.out.println();
	}
	
}}
