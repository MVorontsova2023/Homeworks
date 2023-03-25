package HW_22_03_2023;

public class Task2 {
    int[] arr1 = {100, 112, 256, 349, 770};
    int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
    int k = 7;

    public  int findKthElement() {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                if (i + j == k - 1) {
                    return arr1[i];
                }
                i++;
            } else {
                if (i + j == k - 1) {
                    return arr2[j];
                }
                j++;
            }
        }
        while (i < m) {
            if (i + j == k - 1) {
                return arr1[i];
            }
            i++;
        }
        while (j < n) {
            if (i + j == k - 1) {
                return arr2[j];
            }
            j++;
        }
        return -1; // Это никогда не произойдет, так как k гарантированно существует в обоих массивах
    }

}
