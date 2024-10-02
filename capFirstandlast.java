import java.util.Scanner;
public class capFirstandlast {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        char[] c = a.toCharArray();
        c[0]=Character.toUpperCase(c[0]);
        c[a.length()-1]=Character.toUpperCase(c[a.length()-1]);
        System.out.println(c);
    }
}
