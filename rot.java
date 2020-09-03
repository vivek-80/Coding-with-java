// input :- 3 4 5
// output :- 4 5 3 rotation 2
class rot
{
	public static void main(String[] args){
	    int count=0;
	int arr[]=new int[]{3,4,5};
	for(int i=0;i<3;i++){
	  for(int j=i+1;j<=i+1;j++){
	      if(j<arr.length){
	      int temp=arr[i];
	      arr[i]=arr[j];
	      arr[j]=temp;
	      count++;}
	  }
	}
	for(int k=0;k<3;k++){
	    System.out.println(arr[k]);
	}
	System.out.println("Rotation:- "+count);
	}
}