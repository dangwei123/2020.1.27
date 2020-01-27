class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        int b=0;
        for(int num:nums){
            a=(a^num)&(~b);
            b=(b^num)&~a;
        }
        return a;
    }
}

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i=0;
        while(m!=n){
            i++;
            m>>>=1;
            n>>>=1;
        }
        return n<<i;
    }
}

class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        int ret=0;
        for(int num:nums){
            ret^=num;
        }
        int tmp=ret&(-ret);
        for(int num:nums){
            if((num&tmp)==tmp){
                res[0]^=num;
            }else{
                res[1]^=num;
            }
        }
        return res;
    }
}

class Solution {
    public int maxProduct(String[] words) {
        int[] res=new int[words.length];
        int len=0;
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                res[i]|=1<<(c-'a');
            }
        }
        for(int i=0;i<res.length-1;i++){
            for(int j=i+1;j<res.length;j++){
                if((res[i]&res[j])==0){
                    len=Math.max(len,words[i].length()*words[j].length());
                }
            }
        }
        return len;
    }
}

class Solution {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        for(int i=1;i<=num;i++){
            res[i]=res[i&(i-1)]+1;
        }
        return res;
    }
}

class Solution {
    public int integerReplacement(int n) {
        int count=0;
        while(n!=1){
            if((n&1)==0){
                n>>>=1;
                count++;
            }else if(n==3){
                count+=2;
                break;
            }else {
                if((n&3)==3){
                    n++;
                }else{
                    n--;
                }
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public int totalHammingDistance(int[] nums) {
        int count=0;
        for(int i=0;i<32;i++){
            int a=0;
            int b=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)==1){
                    a++;
                }else{
                    b++;
                }
            }
            count+=a*b;
        }
        return count;
    }
}

