import java.util.Scanner;
public class Task3 {
    public static int gcd(int a, int b){
        return (b == 0) ? a : gcd(b,a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, na=0, nb=0;
        int nok = n*n;

        for(int i = 0; i<n; i++){
            a = i;
            b = n - i;
            int t = b == 0 ? a : gcd(b,a % b);
            if(t<=nok){
                nok = t;
                na = a;
                nb =b;
            }

        }

        System.out.println(nb+" "+na);

    }
}
