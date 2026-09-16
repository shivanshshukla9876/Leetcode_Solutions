class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;

        for(int i = 0; i < weights.length; i++) {
            if(max < weights[i]) {
                max = weights[i];
            }
            sum += weights[i];
        }

        int left = max;
        int right = sum;
        int ans=0;

        while(left <= right) {
            int mid = (left + right) / 2;

            int daysNeeded = 1;
            int currentWeight = 0;

            for(int i = 0; i < weights.length; i++) {
                if(currentWeight + weights[i] <= mid) {
                    currentWeight += weights[i];
                } else {
                    daysNeeded++;
                    currentWeight = weights[i];
                }
            }

           if(daysNeeded <= days) {
            ans = mid;
                right = mid - 1;
            } else {
             left = mid + 1;
                }
        }

        return ans;
    }
}