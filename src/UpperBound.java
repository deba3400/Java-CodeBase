public class UpperBound {
    public static int upperBound(int[] arr, int x) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = n-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] <=x) {
                lo = mid + 1; // discard the left half
            } else {
                ans = mid-1; // we got a candidate ans which is >= x and we can find better on left side
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(upperBound(arr, 1));
    }
}

