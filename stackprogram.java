import java.util.Scanner;
class stack{	
   public static int top=-1;
   public int capacity=5;
   public int stack[]=new int[capacity]; 
   public static void main(String a[]){
     Scanner sc=new Scanner(System.in);
     stack arr=new stack();   
     System.out.println("if you want to perform push operation press 1");
     System.out.println("if you want to perform pop operation press 2");
     int y=sc.nextInt();
     switch(y){

     	   case 1: System.out.println("How many times you push the Element");
     	           int k=sc.nextInt();
     	           for(int i=0;i<k;i++){
     	           System.out.println("Enter a push Element");
     	           int n=sc.nextInt();
     	           arr.Push(n);}
     	   case 2: System.out.println("How many times you pop the Element");
     	            int u=0;
     	            int p=sc.nextInt();
     	            for(int i=1;i<=p;i++){
     	            u=arr.Pop();
                    System.out.println("pop out: "+u);
     	        }             
     }
    }
   public static boolean StackisEmpty(){
       if(top<5)
       return true;
       else 
       return false;
   }
   public static boolean Stackisfull(){
      if(top>-1)
      	return true;
      else 
      	return false;
   }
   public void Push(int x){
   if(StackisEmpty()){
   top++;
   stack[top]=x;
   }
   else{
   	System.out.println("stack is Overflow");
   }
}
    public int Pop(){
    if(Stackisfull()){
    	top--;
        return stack[top+1];
    }
    else{
         System.out.println("stack is underflow");
         return -1;}
}
}