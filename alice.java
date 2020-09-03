import java.util.Scanner;
class alice{
	static int no_player;
	static int no_game;
	static int player_rank=0;
	public static void main(String a[]){
    Scanner s1=new Scanner(System.in);
    no_player=s1.nextInt();
    int scores[]=new int[no_player];
    for(int i=0;i<no_player;i++){
    scores[i]=s1.nextInt();
    }
    for(int i=0;i<no_player;i++){
    	for(int j=i+1;j<no_player;j++){
    		if(scores[i]==scores[j]){
               
    		}
    		else{
    			player_rank++;
    		}
    	}
        System.out.println(player_rank);
        }
    
    int no_game=s1.nextInt();
    int alice_scores[]=new int[no_game];
    for(int j=0;j<no_game;j++){
    	alice_scores[j]=s1.nextInt();
    }
    climbingLeaderboard(scores,alice_scores);  
	}
    static void climbingLeaderboard(int[] scores, int[] alice_scores){
      
           
           }

      
}
