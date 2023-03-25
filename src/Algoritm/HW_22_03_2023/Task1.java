package HW_22_03_2023;
import java.lang.Math;

import static java.lang.Math.pow;

public class Task1 {
    public  int Solution1(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) (x * pow(x, n - 1));
        }
    }

    public  int Solution2(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int y = (int)(pow(x, n / 2));
            return y * y;
        } else {
            return (int)(x * pow(x, n - 1));
        }
    }
}
