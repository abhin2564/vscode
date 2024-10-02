import java.util.Scanner;
public class countVowels {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String a = ob.nextLine();
        char c[] =a.toCharArray();
        int vowel=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
                vowel++;
            }
        }
        System.out.println(vowel);
        ob.close();
    }
}
