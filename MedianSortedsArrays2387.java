import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianSortedsArrays2387 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] tempArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
        Arrays.sort(tempArray);
        if(tempArray.length % 2 != 0){
            return tempArray[tempArray.length/2];
        } else {
            return (double) (tempArray[(tempArray.length/2)-1] + tempArray[tempArray.length/2])/2;
        }
    }
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
