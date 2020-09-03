import java.util.Scanner;
class magic{
	public static void main(String a[]){
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
          arr[i][j]=sc.nextInt();
		}
	} 
	/*for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(arr[i][j]);
		}
		System.out.println(); 
	}*/
	magic_matrix(arr);
}
 static void magic_matrix(int arr[][]){
 	int row1_sum=0,row2_sum=0,row3_sum=0;
 	int column1_sum=0,column2_sum=0,column3_sum=0;
 	int diagonal1_sum=0,diagonal2_sum=0;
 	for(int i=0;i<1;i++){
		for(int j=0;j<3;j++){
             row1_sum=arr[i][j]+row1_sum;
 }
}
for(int i=1;i<2;i++){
		for(int j=0;j<3;j++){
            row2_sum=arr[i][j]+row2_sum;
}}
for(int i=2;i<3;i++){
		for(int j=0;j<3;j++){
            row3_sum=arr[i][j]+row3_sum;
}}
for(int i=0;i<3;i++){
		for(int j=0;j<1;j++){
            column1_sum=arr[i][j]+column1_sum;
}
}
for(int i=0;i<3;i++){
		for(int j=1;j<2;j++){
            column2_sum=arr[i][j]+column2_sum;
}
}
for(int i=0;i<3;i++){
		for(int j=2;j<3;j++){
            column3_sum=arr[i][j]+column3_sum;
}
}
for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
            
            if(i==1){
            	continue;
            }
            if(i==2){
            	continue;
            }
            diagonal1_sum=arr[i][j]+diagonal1_sum;
}
}
}}
