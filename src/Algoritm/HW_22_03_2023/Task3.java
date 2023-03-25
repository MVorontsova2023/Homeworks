package HW_22_03_2023;

public class Task3 {
    int[] arr = {1, 1, 2, 2, 2, 2, 3};
    int x = 2;

    public  int countOccurrences() {
        int left = leftmostIndex(arr, x);
        int right = rightmostIndex(arr, x);
        return right - left + 1;
    }

    public  int leftmostIndex(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public  int rightmostIndex(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
