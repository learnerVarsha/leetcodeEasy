//Author: Varsha Rajawat
//Source: https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copyX = x;
        int reverse = 0;
        while(copyX!=0){
            int last_num = copyX%10;
            reverse = (reverse * 10) + last_num;
            copyX = copyX/10;
        }
        if(reverse==x){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println("Is 121 a palindrome?" + pn.isPalindrome(121));
        System.out.println("Is -121 a palindrome?" + pn.isPalindrome(-121));
        System.out.println("Is 101 a palindrome?" + pn.isPalindrome(101));
    }
}
