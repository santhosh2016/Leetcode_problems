class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
              if(nums[i]==key){
                int next=nums[i+1];
                mp.put(next,mp.getOrDefault(next,0)+1);
              }
        } 
        int ans=0;
        int max=0;
        for(int i:mp.keySet()){
           if(mp.get(i)>max){
            max=mp.get(i);
            ans=i;
           }}
           return ans;

    }
    
}