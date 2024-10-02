import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        String a = ob.next();
        String b = ob.next();
        Anagrams news = new Anagrams();
        news.isAnagram(a,b);

    }


    void isAnagram(String a,String b){
        if(a.length()!=b.length()){
            System.out.println("not an anagram");
        }
        else{
            char[] a1= a.toLowerCase().toCharArray();
            char[] a2 = b.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2)){
                System.out.println("it is an anagram");
            }
            else{
                System.out.println("it is not an anagram");
            }
        }
        ob.close();
    }
    

}
