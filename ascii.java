import java.util.Scanner;
public class ascii {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        char c = ob.next().charAt(0);
        int i = c;
        System.out.println(i);
        ob.close();
    }
    
}
