import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int arr1[] = new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=ob.nextInt();
        }
        HashSet<Integer> list = new HashSet<>();
        List<Integer> rep = new ArrayList<>();
        for(int i:arr1){
            if(list.contains(i)){
                rep.add(i);
            }
            else{
                list.add(i);
            }
        }
        System.out.println(rep);
        System.out.println(list);
    }
}
