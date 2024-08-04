package LeetCode;

import java.util.Arrays;

public class removeElement
{

        public static int removeElement(int[] nums, int val) {
            int len = nums.length;
            int c = 0;int temp=len;

            for (int i = 0; i < len; i++) {
                if (nums[i] == val) {
                    nums[i] = -1;
                }

            }
            System.out.println(Arrays.toString(nums));

            int k = 0;
            for (int i = 0; i < len; i++) {
                if(nums[i]!= -1 )
                    {
                        nums[k++]=nums[i];
                    }

                }
            for(int i=0;i<len;i++)
            {
                if(i>=k)
                {
                    nums[i]=-1;
                }

            }


            System.out.println(Arrays.toString(nums));
            return k;
        }


    public static void main(String[] args) {
        int arr[]={3,2,2,3,4,5,3,1};
        System.out.println(removeElement(arr,2));

    }




}

