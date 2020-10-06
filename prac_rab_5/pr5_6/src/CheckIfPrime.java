import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckIfPrime {
    public static boolean check(int num, int k) {
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else if (num % k == 0)
            return false;
        else if (k < num / 2) {
            k += 1;
            return check(num, k);
        }
        else
            return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (check(num, 2) == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
