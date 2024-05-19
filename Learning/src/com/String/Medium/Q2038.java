package com.String.Medium;

public class Q2038 {
//    Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.
//    public boolean winnerOfGame(String colors) {
//        if(colors.length()<3)
//            return false;
//        StringBuilder string=new StringBuilder(colors);
//        int count=0;
//        while(true){
//            count++;
//            if(string.indexOf("AAA")!=-1){
//                string.deleteCharAt(string.indexOf("AAA")+1);
//            }
//            else break;
//            count++;
//            if(string.indexOf("BBB")!=-1){
//                string.deleteCharAt(string.indexOf("BBB")+1);
//            }
//            else break;
//        }
//        return count%2==0;
//    }

    public static boolean winnerOfGame(String colors) {
        if (colors.length()<3)
            return false;
        int possibilityOfAlice=0,possibilityOfBob=0,frequency=1;
        char prev=colors.charAt(0);
        for(int i=1;i<colors.length();i++){
            System.out.print(prev+ ","+colors.charAt(i)+"=");
            if(colors.charAt(i)!=prev){
                if(frequency>=3){
                    if(prev=='A') possibilityOfAlice+=frequency-2;
                    else possibilityOfBob+=frequency-2;
                }
                prev=colors.charAt(i);
                frequency=1;
            }
            else
                frequency++;
            System.out.print(frequency+"\n");
            System.out.println(possibilityOfAlice+" , "+possibilityOfBob);
        }
        if(frequency>=3){
            if(prev=='A') possibilityOfAlice+=frequency-2;
            else possibilityOfBob+=frequency-2;
        }
        return possibilityOfAlice > possibilityOfBob;
    }

    public static void main(String[] args) {
        System.out.println(Q2038.winnerOfGame("AAABBB"));
    }
}
