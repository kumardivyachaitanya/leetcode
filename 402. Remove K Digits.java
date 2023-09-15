class Solution {
    public String removeKdigits(String num, int k) {
        int digits=num.length()-k;
        if(num.length()<=k){
            return "0";
        }
        char[] c=num.toCharArray();
        int start=0;
        int top=-1;
        for(int i=0;i<c.length;i++){
            while(top>=0&&c[top]>c[i]&k>0){
                top--;
                k--;
            }
            top++;
            c[top]=c[i];
        }
        while(start<=top&&c[start]=='0'){
            start++;

        }
        String ans="";
        for(int i=start;i<digits;i++){
            ans=ans+c[i];

        }
        if(ans.equals("")){
            return "0";
        }
        return ans;

    }
}
