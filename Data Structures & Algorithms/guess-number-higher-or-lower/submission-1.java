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
        int l = 1;
        int r = n;

        while(l<=r){
            int pick = l + (r-l)/2;
            int guessResult = guess(pick);
            if(guessResult == 0){
                return pick;
            }else if(guessResult == 1){
                l = pick + 1;
            }else{
                r = pick - 1;
            }
        }
        return -1;
        
    }
}