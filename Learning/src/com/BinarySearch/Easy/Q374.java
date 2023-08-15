package com.BinarySearch.Easy;
/**
 * Forward declaration of guess API.
 *   num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Q374 {
    int target=10;
    public int guessNumber(int n) {
        if(n==1) return 1;
        int low = 1,high = n;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(guess(mid)==0)  return mid;
            else if(guess(mid)<0)   high=mid-1;
            else low = mid+1;
        }
        return -1;
    }

    private int guess(int mid) {
        if(mid>target)
            return -1;
        else if (mid<target)
            return 1;
        else
            return 0;
    }
}
