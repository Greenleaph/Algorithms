/**
 * Developer: Jesus Gil
 */
public class InsertionSort1 {
    /**
     *
     * @param data
     * @return
     */
    public int[] insertionSort(int[] data) {
        int n = data.length;
        for(int i = 1; i < n; i++) {                            // begin with the second integer
            int cur = data[i];                                  // time to insert cur = data[i]
            int j = i;                                          // find the correct index j for cur
            while(j > 0 && data[j - 1] > cur) {                 // data[j-1] must go after cur
                data[j] = data[j - 1];                          // slide data[j-1] to the right
                j--;
            }
            data[j] = cur;                                      // proper place for cur
        }
        return data;
    }
}
