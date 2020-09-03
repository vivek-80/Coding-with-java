// Linear search algorithm //
/*Linear search(array x,key_value n)
step 1: for i=0 to x.length,i++
step 2: if x[i]==key then go to step 4
step 3: else then go to step 5 
step 4: print the element at index i
step 5: print the element is not found 
step 6: exit */ 
import java.util.Scanner;
class Linear{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("array intialization");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Searching element");
		int key=sc.nextInt();
		int l=Linear_Search(arr,key);
		for(int i=0;i<arr.length;i++){
		if(arr[i]==l)
			System.out.println("Element is present at index "+i);}
		if(l==-1)
			System.out.println("Element is not present in arr[]");}
    static int Linear_Search(int arr[],int key){
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key){
    			return arr[i];}	
    	}
    	return -1;}
    }
//(The return statement terminates the execution of a function and returns control 
// to the calling function. Execution resumes in the calling function at the point 
//immediately following the call. A return statement can also return a value to 
//the calling function.)

