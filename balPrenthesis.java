import java.util.Scanner;
public class balPrenthesis {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String a = ob.next();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='[' || a.charAt(i)=='{' || a.charAt(i)=='('){
                count++;
            }
            else if(a.charAt(i)==']' || a.charAt(i)=='}' || a.charAt(i)==')'){
                count--;
            }
        }
        if(count==0){
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
        ob.close();
    }

}
