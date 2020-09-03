// find the Longest Word in String //
--------------------------------------------------
input:- i'm not sure it's good for your health
output:- health
--------------------------------------------------
import java.util.Scanner;
class Longword{ 
public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a String :");
String s1=sc.nextLine();
s1=s1.replaceAll("\\p{Punct}","");
String s2[]=s1.split("\\s"); 
String str1=m1(s2);
System.out.println(str1);
}
static String m1(String s3[]){
	    String str;
	    int i=0;
	    //String s5="v";
	   for(i=0;i<s3.length;i++){
	   	for(int j=i+1;j<s3.length;j++){
	   if(s3[i].length()>s3[j].length()){
	   	    str=s3[i];
	   	    s3[i]=s3[j];
            s3[j]=str; 
	   	}
	   	else if(s3[i].length()==s3[j].length())
                        continue;
	   }
	}
	  return s3[i-1];
}}
// when the length of the string is equal then it return always end string.
