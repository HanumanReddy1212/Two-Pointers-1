// time complexity:O(n)
//space complexity:O(1)
class Solution {
    public void sortColors(int[] nums) {
         if (nums == null || nums.length == 0) return;
            int n = nums.length;
            int left = 0, mid = 0, right = n - 1;

            while (mid <= right)
            {
                if (nums[mid] == 0)
                {
                    swap(nums, left, mid);
                    left++;
                    mid++;
                }
                else if (nums[mid] == 2)
                {
                    swap(nums, mid, right);
                    right--;
                }
                else
                {
                    mid++;
                }
            }

        }

        private void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }