import java.util.*;
class rott{
	public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int no_of_rotation=sc.nextInt();
    int no_of_queries=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    	arr[i]=sc.nextInt();
    }
    rot(arr,n,no_of_rotation,no_of_queries,sc);
	}
	static void rot(int arr[],int n,int no_of_rot,int no_of_quer,Scanner sc){
		int count=0;
		int m=0;
    for(int i=0;i<n;i++){
    	for(int j=i+1;j<n;j++){
    		if(no_of_rot>count && j<=i+1){
    			if(j<arr.length){
    				int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						count+=1;
    			}
    		}
    	}}
    	for(int k=0;k<no_of_quer;k++){
    	      m=sc.nextInt();
    	}
    	for(int l=0;l<no_of_quer;l++)
    		System.out.println(arr[l]);
  }
}