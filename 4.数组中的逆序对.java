import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        if (A == null || n == 0 || n == 1) {
            return 0;
        }
        
        temp = new int[n];
        mergeSort(A, 0, n - 1);
        
        return result;
    }
    
    private int result = 0;
    private int[] temp = null;
    
    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    
    private void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                result += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (i = left; i <= right; ++i) {
            arr[i] = temp[i];
        }
    }
}