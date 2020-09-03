/*
  cases 1) i/o:- 3
                 11 2 4
                 4  5 6
                 10 8 -12
           o/p:- 15 
*/
import java.lang.Math.*;
import java.util.Scanner;
class Square{
     public static void main(String a[]){
     Scanner s1=new Scanner(System.in);
     int m=0,k=0,Ans=0;
     int n=s1.nextInt();
     int x[][]=new int[n][n];
     for(int i=0;i<x.length;i++){
     	for(int j=0;j<x.length;j++){
     		x[i][j]=s1.nextInt();
     	}
     }
for(int i=0;i<x.length;i++){
          for(int j=i;j<=i;j++){
          m=x[i][j]+m; 
}}
for(int i=0;i<x.length;i++){
          for(int j=x.length-i-1;j>=x.length-1-i;j--){
          k=x[i][j]+k;
}}
Ans=m-k;
System.out.println(Math.abs(Ans));
}}