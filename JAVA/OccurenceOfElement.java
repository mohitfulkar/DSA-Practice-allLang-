
public class OccurenceOfElement {
    public static int firstOccurence(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                ans = mid;
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                ans = mid;
                low = mid + 1; 
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 3, 3, 4 };
        int firstIndex = firstOccurence(3, arr);
        int lastIndex = lastOccurence(3, arr);
        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("Occurrences: " + ((lastIndex - firstIndex) + 1));
        } else {
            System.out.println("Target not found");
        }
    }
}
