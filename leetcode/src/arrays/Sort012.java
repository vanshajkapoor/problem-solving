package arrays;

public class Sort012 {

    //tc -> 0(2n)  sc-> 0(1)
//  public void sortColors(int[] nums) {
//      int num0s = 0, num1s = 0, num2s = 0;
//      for(int i=0;i<nums.length;i++) {
//          if(nums[i]==0) num0s++;
//          else if(nums[i]==1) num1s++;
//          else nums[i]++;
//      }
     
//      for(int i=0;i<nums.length;i++){
//          if(num0s>0){
//              nums[i]=0;
//              num0s--;
//          }
//          else if(num1s>0){
//              nums[i]=1;
//              num1s--;
//          }
//          else{
//              nums[i]=2;
//              num2s--;
//          }
//      }
//  }
 //dutch national flag tc -> 0(n)
 public void sortColors(int[] nums) {
     int lo = 0; 
     int hi = nums.length - 1; 
     int mid = 0; 
     int temp; 
     while (mid <= hi) { 
         switch (nums[mid]) { 
             case 0: { 
                 temp = nums[lo]; 
                 nums[lo] = nums[mid]; 
                 nums[mid] = temp; 
                 lo++; 
                 mid++; 
                 break; 
             } 
             case 1: 
                 mid++; 
                 break; 
             case 2: { 
                 temp = nums[mid]; 
                 nums[mid] = nums[hi]; 
                 nums[hi] = temp; 
                 hi--; 
                 break; 
             } 
         } 
     }
 }

}
