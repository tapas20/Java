public class Recursion {
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fmi=fact(n-1);
        int fn=n * fmi;
        return fn;
    }
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int nm1=calSum(n-1);
        int sum = n+nm1;
        return sum;
    }

    //calculate nth term in Fibonacci 
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurence(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedpower(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPow = optimizedpower(x, n/2);
        int halfPowSq = halfPow * halfPow;

        //if n is odd
        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;
    }

    //Tiling problem
    public static int tilingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical
        int ver = tilingProblem(n-1);

        //Horizontal
        int hor = tilingProblem(n-2);

        int totalWays = ver + hor;

        return totalWays;
    }

    //Remove Duplicates in a String
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, index + 1, newStr.append(currChar), map);
        }
    }

    //Friends pairing problems
    public static int friendsPairing(int n){
        //Base case
        if(n <= 2){
            return n;
        }

        //single
        // int fnm1 = friendsPairing(n-1);
        
        // //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totalWays
        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    //Binary String Problems
    public static void printBinString(int n, int lastPlace, String str){

        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0){
        //     printBinString(n-1, 0, str+"0");
        //     printBinString(n-1, 1, str+"1");
        // } else {
        //     printBinString(n-1, 0, str+"0");
        // }

        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinString(n-1, 1, str+"1");
        }
    }

    //================MergeSort==============
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }
        for(k=0, left=low; k<temp.length; k++, left++){
            arr[left] = temp[k];
        }
    }

    public static void main(String[] args){
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
