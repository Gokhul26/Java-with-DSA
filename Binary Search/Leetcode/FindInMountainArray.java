// HARD LEETCODE
package Leetcode;
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        else{
            return orderAgnosticBS(mountainArr, target, peak + 1,mountainArr.length()-1);
        }

    }
    static int peakElement(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr.get(mid) < arr.get(mid+1)){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    static int orderAgnosticBS(MountainArray arr, int target, int s, int end){
        boolean isAcs = arr.get(s) < arr.get(end);
        while (s <= end){
            int mid = s + (end - s)/2;
            if (arr.get(mid) == target){
                return  mid;
            }
            if (isAcs){
                if(target >  arr.get(mid)){
                    s = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if(target < arr.get(mid)){
                    s = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
}}