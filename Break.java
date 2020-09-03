import java.util.Scanner;
class Break{
	static int highscore;
	static int counter; 
	public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int score[]=new int[n];
    for(int i=0;i<n;i++){
    	score[i]=sc.nextInt();
    }
    record(score,n);
	}
   static void record(int score[],int n){
   	for(int i=0;i<1;i++){
   		for(int j=i+1;j<n;j++){
   			if(score[i]>score[j]){
              
   			}
   			else{
   			   
   				counter++;}
   			}
   		}
   		System.out.println(counter);
   	}
	}
