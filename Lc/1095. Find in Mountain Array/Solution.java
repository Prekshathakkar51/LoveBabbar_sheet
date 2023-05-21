/**
 *// This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = findPeak(mountainArr);
        int firstTry = OrderAgnosBinarySearch(mountainArr, target, 0, peak);

        if(firstTry != -1){
            return firstTry; 
        }
        
            return OrderAgnosBinarySearch(mountainArr, target, peak+1, mountainArr.length()-1 );

    }

    int findPeak(MountainArray mountainArr){
        int start = 0;
            int end = mountainArr.length() -1;

            while(start<end){
                int mid = start + (end - start)/2;

                if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                    // descending part of  arr
                    end = mid;
                }
                else{
                    // ascending part
                    start = mid+1;
                }   

            }
        return start;   
        }

        int OrderAgnosBinarySearch(MountainArray mountainArr, int target, int start, int end){
           
        boolean isAsc = mountainArr.get(start)<mountainArr.get(end);

            while(start<=end){
                int mid = start + (end-start)/2;

                if(target == mountainArr.get(mid)){
                    return mid;
                }

                if(isAsc){
                    if(target >mountainArr.get(mid)){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
                else{
                    if(target > mountainArr.get(mid)){
                        end = mid - 1;
                    }else{
                        start = mid+1;
                    }
                }       
            }
            return -1;
        }
}