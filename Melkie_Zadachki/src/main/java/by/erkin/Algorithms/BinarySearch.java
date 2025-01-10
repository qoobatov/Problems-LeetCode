package by.erkin.Algorithms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // Элемент найден
            } else if (arr[mid] < target) {
                low = mid + 1; // Ищем в правой половине
            } else {
                high = mid - 1; // Ищем в левой половине
            }
        }

        return -1; // Элемент не найден
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 7));
    }
}
