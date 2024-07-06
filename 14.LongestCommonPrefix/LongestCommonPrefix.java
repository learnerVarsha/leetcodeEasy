// Author: Varsha Rajawat
// Source: https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        for(int i=0; i<Math.min(firstString.length(), lastString.length()); i++){
            if(firstString.charAt(i)!=lastString.charAt(i)){
                return ans.toString();
            }
            ans.append(firstString.charAt(i));
        }
        return ans.toString();
    }
}
