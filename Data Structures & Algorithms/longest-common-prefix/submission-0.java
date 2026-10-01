class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=0,r=strs.length-1;
        return splitandsearch(strs,l,r);
    }
    String splitandsearch(String strs[],int l,int r){
        if(l==r)return strs[l];
        if(l<r){
            int mid=(l+r)/2;
            String s1=splitandsearch(strs,l,mid);
            String s2=splitandsearch(strs,mid+1,r);
            return commonprefix(s1,s2);
        }return "";
    }
    String commonprefix(String s1,String s2){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s1.length()&&i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))return result.toString();
            result.append(s1.charAt(i));
        }return result.toString();
    }
}