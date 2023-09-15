class Solution {
    public int minDeletions(String s) {
        int deletion=0;
        int []freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        HashSet<Integer>uniqueelement=new HashSet<>();
        for(int count:freq){
            while(count>0&&uniqueelement.contains(count)){
                deletion++;
                count--;


            }
            uniqueelement.add(count);

        }
        return deletion;
    }
}
