import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static boolean check(String s) {
        if (s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() == 2)
                return true;
            return check(s.substring(1, s.length() - 1));
        } else return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (check(reader.readLine()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
