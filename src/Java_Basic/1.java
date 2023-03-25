public static int power(int x, int n) {
if (n == 0) {
return 1;
} else {
return x * power(x, n - 1);
}
}

Решение 2 - улучшить решение 1 до O(log n)

public static int power(int x, int n) {
if (n == 0) {
return 1;
} else if (n % 2 == 0) {
int y = power(x, n / 2);
return y * y;
} else {
return x * power(x, n - 1);
}
}