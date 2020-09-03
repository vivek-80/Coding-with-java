import java.util.Scanner;
class BigSum{
	public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    long s1=0;
    int n=sc.nextInt();
    long x[]=new long[n];
    for(int i=0;i<x.length;i++){
      x[i]=sc.nextLong();
    }  
	s1=BigSum(x);
  System.out.println(s1);
	}
	static long BigSum(long arr[]){
      long sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
	}
   return sum;
}}