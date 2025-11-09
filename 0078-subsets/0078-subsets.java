class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ot = new ArrayList<>();
        ot.add(new ArrayList<>());
        for(int num:nums){
            int n=ot.size();
            for(int i=0;i<n;i++){
                List<Integer> in=new ArrayList<>(ot.get(i));
                in.add(num);
                ot.add(in);
                
            }
        }return ot;
        
    }
}