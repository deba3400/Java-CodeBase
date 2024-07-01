public class LuckyNumberFind {

        public static int findLucky(int[] arr) {
            int n = arr.length;
            int[] freq = new int[n + 1]; // Frequency array to count occurrences

            // Count occurrences of each element
            for (int num : arr) {
                if (num >= 1 && num <= n) {
                    freq[num]=freq[num]+1;
//                    System.out.println(freq[num]);
                }
            }
            for(int i=0;i<freq.length-1;i++){
                System.out.println(freq[i]);

            }
            int max = -1; // Initialize max as -1 because the problem mentions returning -1 if no lucky integer is found

            // Find the maximum lucky integer
            for (int i = 1; i <= n; i++) {
                if (freq[i] == i) {
                    max = Math.max(max, i);
                }
            }

            return max;
        }

    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,7};
        System.out.println(findLucky(arr1));

    }


}
