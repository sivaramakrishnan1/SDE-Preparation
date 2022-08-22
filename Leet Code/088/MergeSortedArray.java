public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();

        int nums1[] = { 1, 2, 3, 0, 0, 0 }, m = 3, nums2[] = { 2, 5, 6 }, n = 3;
        int result[] = msa.merge(nums1, m, nums2, n);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, lim = 0;
        int[] ans = new int[m + n];

        while (lim < m + n) {
            if (i < m) {
                if (nums1[i] == nums2[j]) {
                    ans[lim++] = nums1[i++];
                    ans[lim++] = nums2[j++];
                }
                if (nums1[i] < nums2[j]) {
                    ans[lim++] = nums1[i++];
                }
                if (nums1[i] > nums2[j]) {
                    ans[lim++] = nums2[j++];
                }
            } else if (j < n) {
                ans[lim++] = nums2[j++];
            }
        }

        for (i = 0; i < (m + n); i++) {
            nums1[i] = ans[i];
            // System.out.println(ans[i]+" ");
        }
        return nums1;
    }

}