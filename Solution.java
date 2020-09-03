/*
  sample input:-6
                -4 3 -9 0 4 1         
  sample output:-
  0.500000
  0.333333
  0.166667
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Solution{
    public static void main(String a[]){
    int count_1=0,count_2=0,count_3=0,count_arr=0;
    double div_pos=0,div_neg=0,div_zero=0; 
    double d2=10;
    double d3=-4;
    DecimalFormat df = new DecimalFormat("#.######");
    Scanner s1=new Scanner(System.in);
    int x=s1.nextInt();
    int arr[]=new int[x];
    for(int i=0;i<arr.length;i++){
        arr[i]=s1.nextInt();
        count_arr++;
    }
    for(int k=0;k<arr.length;k++){
    if(arr[k]<0){
      count_1++;
    }
    if(arr[k]==0){
      count_2++;
    }                         
    if(arr[k]>0){
      count_3++;
    }
}
   div_pos=(double)count_3/count_arr;
   div_neg=(double)count_1/count_arr;
   div_zero=(double)count_2/count_arr;
  String f1= df.format(div_pos);
  String f2= df.format(div_neg);
  String f3= df.format(div_zero); 
  System.out.println("division_"+f1);
  System.out.println("division_"+f2);
  System.out.println("division_"+f3);
}
}