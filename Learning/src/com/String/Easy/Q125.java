package com.String.Easy;

public class Q125 {
    public static boolean isPalindrome(String s) {
        {
//            s = s.toLowerCase();
//            String modify = "";
//            for (char ch : s.toCharArray()) {
//                if (Character.isAlphabetic(ch) || Character.isDigit(ch))
//                    modify += ch;
//            }
//            {
////        StringBuffer p=new StringBuffer(modify);
////        p.reverse();
////        System.out.println(p);
////        System.out.println(modify);
////        return modify.equals(p.toString());
//            }
//            int length = modify.length();
//            for (int i = 0; i < length / 2; i++) {
//                if (modify.charAt(i) != modify.charAt(length - 1 - i))
//                    return false;
//            }
//            return true;
        }
//        Copied faster solution.
        {
/*
            int l = 0;
            int r = s.length()-1;
            while (l<r) {
                while (l<r && !Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                }
                while (r>l && !Character.isLetterOrDigit(s.charAt(r))) {
                    r--;
                }
                if (Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
                    return false;
                }

                l++;
                r--;

            }
            return true;
*/
        }
        {
            s = s.toLowerCase();
            int left = 0, right = s.length() - 1;
            while (left <= right) {
                if ((Character.isLetterOrDigit(s.charAt(left))) && (Character.isLetterOrDigit(s.charAt(right)))) {
                    if (s.charAt(left) != s.charAt(right))
                        return false;
                    left++;
                    right--;
                } else if (Character.isLetterOrDigit(s.charAt(left)))
                    right--;
                else if (Character.isLetterOrDigit(s.charAt(right)))
                    left++;
                else {
                    left++;
                    right--;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
