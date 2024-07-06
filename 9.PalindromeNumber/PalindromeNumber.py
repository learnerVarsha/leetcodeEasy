#Author: Varsha Rajawat
#Source: https://leetcode.com/problems/palindrome-number/

class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        temp = x
        reverse = 0
        while temp!=0:
            last_digit = temp%10
            reverse = (reverse * 10) + last_digit
            temp //= 10

        return reverse==x