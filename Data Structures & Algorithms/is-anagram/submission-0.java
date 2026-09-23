class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st1=s.toCharArray();
        char[] st2=t.toCharArray();
        Arrays.sort(st1);Arrays.sort(st2);
        String snew=String.valueOf(st1);
        String tnew =String.valueOf(st2);
        return snew.equals(tnew);

    }
}
