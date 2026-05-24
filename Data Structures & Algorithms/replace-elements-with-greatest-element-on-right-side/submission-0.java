class Solution {
    public int[] replaceElements(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
                break;
            }


            int largestNumber = 0;
            // Find the largest number to the right
            for (int x = i + 1; x < arr.length; x++) {

                if (arr[x] > largestNumber) {
                    largestNumber = arr[x];
                }
            }
            arr[i] = largestNumber;

        }

        return arr;
    }
}