import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multipliers {
    public static void multipliers(int num, int k) {
        if (k > num / 2) {
            System.out.println(num);
            return;
        }
        if (num % k == 0) {
            num /= k;
            System.out.println(k);
        } else
            k++;
        multipliers(num, k);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        multipliers(num, 2);
    }
}
