import java.util.Scanner;
public class Capital {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String a = "my nAme is AbHInav";
        a=a.toLowerCase();
        String arr[] = a.split(" ");
        for(int i=0;i<arr.length;i++){
            int n =arr[i].length();
            if(n>2){
                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
}
