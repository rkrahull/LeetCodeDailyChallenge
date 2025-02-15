class Solution {
    public boolean isPartition(int i, String str, int currSum, int target){
        int n=str.length();
        if(i==n)
            return (currSum==target);
        if(currSum>target)
            return false;
        for(int index=i;index<n;index++){
            int val=Integer.parseInt(str.substring(i,index+1));
            if(isPartition(index+1,str,currSum+val,target))
                return true;
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            String str=Integer.toString(i*i);
            if(isPartition(0,str,0,i))
                ans+=(i*i);
        }
        return ans;
    }
}