public class LastOccurence {
    public static int find_element(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 13, 13, 13, 20, 40 };
        int result = find_element(arr, 60);
        System.out.println(result);
    }
}