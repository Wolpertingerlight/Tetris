import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int maxXor(List<Integer> arr, int n) {
        int maxXor = 0;
        int i = 0;

        for (; i < n; ++i) {
            int j = i + 1;

            for (; j < n; ++j) {
                maxXor = Math.max(maxXor, arr.get(i)^ arr.get(j));
            }
        }

        return maxXor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
            System.out.println(maxXor( arr, arr.size()));
        }
    }
}