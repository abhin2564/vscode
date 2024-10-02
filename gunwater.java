import java.util.*;
public class gunwater{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        ob.nextLine();
        String b = ob.nextLine();
        System.out.println(game(a,b));
        ob.close();

    }

    static int game(int a, String b){
        String p1="";
        String p2="";

        int p1count=0;
        int p2count=0;
        int idx=0;

        // check input for p1
        for(int i=0;i<a;i++){
            if(b.startsWith("rock",idx)){
                p1="rock";
                idx+=4;
            }
            else if(b.startsWith("paper",idx)){
                p1="paper";
                idx+=5;
            }
            else if(b.startsWith("scissor",idx)){
                p1="scissors";
                idx+=7;
            }
    
            // check input for p2
            if(b.startsWith("rock",idx)){
                p2="rock";
                idx+=4;
            }
            else if(b.startsWith("paper",idx)){
                p2="paper";
                idx+=5;
            }
            else if(b.startsWith("scissor",idx)){
                p2="scissors";
                idx+=7;
            }
    
            //compare
            if((p1=="rock" && p2=="scissors") || (p1=="paper" && p2=="rock") || (p1=="scissors" && p2=="paper")){
                p1count++;
    
            }
            else{
                p2count++;
            }
        }
        return p1count;





    }
}