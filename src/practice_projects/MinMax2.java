package practice_projects;

public class MinMax2 {

    public static void main(String[] args) {

        int nums[] = {99, -10, 1000123, 18, -978, 5623, 463, -9, 287, 49};

        int min, max;

        min = max = nums[0];
        for(int i = 1; i < 10; i++){
            if(nums[i] < min) min = nums[i];
            // loop start at 99 num[0] < min <-- there is no min because loop has only looped once
            // on the next loop it's 99 < -10 <-- because it is nums[i/99] is greater than -10 min get a value of -10 now
            // next loop it will compare if min which is now -10 greater than index 2 which is 1000123 which is not so min stay at -10
            // this process continues until the end of the array the smallest number is then stored as (min = which is the smallest index of array nums[i])
            if(nums[i] > max) max = nums[i];
            // same process happens as above
        }
        System.out.println("Min and Max: " + min + " " + max);
    }
}
