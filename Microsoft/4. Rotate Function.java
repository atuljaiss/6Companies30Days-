link : https://leetcode.com/problems/rotate-function/submissions/869556907/

class Solution {
    public int maxRotateFunction(int[] nums) {
       /* int n = nums.length;
        int msum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int ind=0, index=i,sum=0;
            for(int j = 0;j<n;j++){
                sum+= ind * nums[index%n];
                ind++;
                index++;
            }
            System.out.println(sum);
            msum = Math.max(msum,sum);
        }
        return msum;
        First Calculate F(0) than update F(1) and F(2) with below equations and find max of all
        F(1) - F(0) = S - n * A[n - 1] ---> F(1) = F(0) + S - n * A[n - 1]
        F(2) - F(1) = S - n * A[n - 2] ---> F(2) = F(1) + S - n * A[n - 2]
        F(3) - F(2) = S - n * A[n - 3]
        */
        int f =0,s=0, n = nums.length;
        for(int i = 0;i<n;i++){
            f += i*nums[i];
            s+= nums[i];
        }
        int msum = f;
        for(int i = 1;i<n;i++){
            f = f + s - n*nums[n-i];
            msum = Math.max(msum,f);
        }
        return msum;
    }
}