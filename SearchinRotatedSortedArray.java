public class SearchinRotatedSortedArray {
    public static int search(int[] arr, int target, int si, int ei){
//-----------------------------------Using Recursion-------------------------------------
        //basecase
        if(si > ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        
        if(arr[mid] == target){
            return mid;
        }
        if(arr[si] <= arr[mid]){
            if(target >= arr[si] && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            } else {
                return search(arr, target, mid+1, ei);
            }
        } else {
            if(target >= arr[mid] && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            } else {
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int indx = search(arr, target, 0, arr.length-1);
        System.out.println(indx);
    }
}


//-----------------------------------Using BinarySearch-------------------------------
// public class SearchinRotatedSortedArray {
//     public static int search(int[] arr, int target, int si, int ei){
        
//     while(si <= ei){
//         int mid = si+(ei-si)/2;
//         if(arr[mid] == target){
//             return mid;
//         }
//         if(arr[si] <= arr[mid]){
//             if(target >= arr[si] && target <= arr[mid]){
//                 ei = mid-1;
//             } else {
//                 si = mid+1;
//             }
//         } else {
//             if(target >= arr[mid] && target <= arr[ei]){
//                 si = mid+1;
//             } else {
//                 ei = mid-1;
//             }
//         }
//     }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] arr = {4, 5, 6, 7, 0, 1, 2};
//         int target = 1;
//         int indx = search(arr, target, 0, arr.length-1);
//         System.out.println(indx);
//     }
// }
