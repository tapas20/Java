public class TrappingRainWater {
    public static int Trapping_RainWater(int height[]){
        int n=height.length;
        //Calculate Left max boundary-array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //Calculate Right max boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int TrappedWater=0;
        //Loop
        for(int i=0;i<n;i++){
            //Waterlevel=min(Left max boundary,Right max boundary)
            int Waterlevel=Math.min(leftmax[i],rightmax[i]);
            //Trapped Water+=WaterLevel-height[i]
            TrappedWater += Waterlevel-height[i];
        }
            return TrappedWater;
    }
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trapping_RainWater(height));
    }
}
