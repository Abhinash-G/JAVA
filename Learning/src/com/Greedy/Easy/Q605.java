package com.Greedy.Easy;

public class Q605 {
    //Basic
    {
//        public boolean canPlaceFlowers ( int[] flowerbed, int n){
//        if (n == 0)
//            return true;
//        if (n > (flowerbed.length / 2 + 1))
//            return false;
//        if (flowerbed.length == 1)
//            return flowerbed[0] == 0;
//        int possibility = 0;
//        for (int i = 0; i < flowerbed.length; i++) {
//            if ((flowerbed[i] == 0) && (i == 0 || flowerbed[i - 1] == 0)
//                    && (i == (flowerbed.length - 1) || flowerbed[i + 1] == 0)) {
//                ++possibility;
//                flowerbed[i] = 1;
//            }
//            if (possibility >= n)
//                return true;
//        }
//        if (possibility >= n)
//            return true;
//        return false;
//    }
    }

    //Faster as we jump 2 steps
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        for (int i = 0; i < flowerbed.length; i += 2) {
            if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1)
                i++;
            else if (flowerbed[i] == 0) {
                n--;
                if (n <= 0)
                    return true;
            }
        }
        return false;
    }

}
