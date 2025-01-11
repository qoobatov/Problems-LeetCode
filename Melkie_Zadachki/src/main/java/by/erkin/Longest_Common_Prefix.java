package by.erkin;


public class Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.length() == 0){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Longest_Common_Prefix lcp = new Longest_Common_Prefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
