import java.util.Scanner;
public class findElement {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int [] arr= new int[a];
        int key = ob.nextInt();
        for(int i=0;i<a;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}
