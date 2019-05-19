package binary_search;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }


    private int binarySearch(int[] nums, int start, int end, int target){
          int mid = start+(end-start)/2;
          if(end < start){
              return mid;
          }

          if (target > nums[mid]){
              return binarySearch(nums,mid+1, end, target);
          }
          else if(target < nums[mid]){
              return binarySearch(nums, start, mid-1, target);
          }
          return mid;
    }
}
