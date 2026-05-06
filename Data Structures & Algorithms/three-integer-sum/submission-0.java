class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        int   indexOut=0;
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<List<Integer>>();
        for(indexOut = 0; indexOut < nums.length -1 ;indexOut++)
        {
            if(indexOut > 0 && nums[indexOut] == nums[indexOut-1])
                continue;
            int indexL = 0, indexR=nums.length -1;
            int target = 0- nums[indexOut]; 
            for(indexL = indexOut+1 ; indexL < indexR ;)
            {
                if(indexR == indexOut )
                    indexR--;
                if(indexL == indexOut)
                    indexL++;

                if(nums[indexL] + nums[indexR] > target)
                    indexR--;
                else if(nums[indexL] + nums[indexR] < target)
                    indexL++;
                else
                {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[indexL]);
                    list.add(nums[indexR]);
                    list.add( nums[indexOut]);
                    ans.add(list);
                    indexL++;
                    indexR--;
                    while(indexL < nums.length && nums[indexL-1] == nums[indexL])
                        indexL++;
                    while(indexR >=0 && nums[indexR+1] == nums[indexR])
                        indexR--;
                }

                
            }
        }
        return ans;
        
    }
}
