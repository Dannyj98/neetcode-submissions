/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int LOW = 1;
        int HIGH = n;

        while (LOW <= HIGH) {
            // int mid = (HIGH + LOW) / 2 // this causes an overflow
            int mid = LOW + (HIGH - LOW) / 2;

            int guess = guess(mid);

            if (guess == -1) {
                HIGH = mid - 1;
            } else if (guess == 1) {
                LOW = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}