class Solution {
    public int maxArea(int[] heights) 
    {
        int indexR= heights.length -1, indexL=0;
        int maxArea = -1;
        for(indexL= 0; indexL < indexR;)
        {
            if(Math.min(heights[indexL], heights[indexR]) * (indexR - indexL) > maxArea)
                maxArea = Math.min(heights[indexL], heights[indexR]) * (indexR - indexL);
            
            if(heights[indexR] >= heights[indexL])
                indexL++;
            else
                indexR--;
        }
        return maxArea;

        
    }
}
