import java.util.*;
class Birthcake{
    public static void main(String a[]){
     int last=0,count=0;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x[]=new int[n];
     for(int i=0;i<x.length;i++){
     	x[i]=sc.nextInt();
     } 
     for(int i=0;i<x.length;i++){
     	for(int j=i+1;j<x.length;j++){
            if(x[i]>x[j]){
            	int temp=0;
            	temp=x[j]; 
            	x[j]=x[i];
            	x[i]=temp;
            }
     	}
     }
      for(int i=x.length-1;i>=0;i--){
      	if(x[i]==x[i])
         	c	ount++;
      }
         /*for(int i=0;i<x.length;i++){
         	if(x[i]==last)
         		count++;
         }*/
         System.out.println(count);

    }
}