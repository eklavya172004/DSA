//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {10,12,15,39};
//        int num = 12;
////        System.out.println(BinarySearch(arr,num));
//        System.out.println(Ceiling(arr,11));
//        System.out.println(Floor(arr,11));
//
//    }
//
//    static int BinarySearch(int[] arr,int target){
//        int s = 0;
//        int e = arr.length - 1;
//
//        while(s<=e){
//
//        int mid =  s + (e-s)/2;
//
//            if(target>arr[mid]){
//                s=mid+1;
//            }
//            else if(target<arr[mid]){
//                e = mid - 1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//
////    ceiling of number
//    static int Ceiling(int[] arr,int target){
//        if(target > arr[arr.length - 1]){
//            return - 1;
//        }
//
//        int s = 0;
//        int e = arr.length - 1;
//
//        while(s<=e){
//
//            int mid =  s + (e-s)/2;
//
//            if(target>arr[mid]){
//                s=mid+1;
//            }
//            else if(target<arr[mid]){
//                e = mid - 1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return arr[s];
//    }
//    //    floor of number
//    static int Floor(int[] arr,int target){
//        int s = 0;
//        int e = arr.length - 1;
//
//        while(s<=e){
//
//            int mid =  s + (e-s)/2;
//
//            if(target>arr[mid]){
//                s=mid+1;
//            }
//            else if(target<arr[mid]){
//                e = mid - 1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return e;
//    }
//
//}
public class Main{
public static void main(String[] args) {
    int[] arr = {2,4,5,66,77,88,99};
    int target =1;
    int ans = Floor(arr,target);
    System.out.println(ans);
}
//smallest element grater or equal to taregt
static int Ceiling(int[] arr,int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(target<arr[mid]){
                e = mid - 1;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                return mid;
            }
        }
        return s;
}
//greatest number less than or equal to target
static int Floor(int[] arr,int target){
//    if(target < arr[0]){
//        return -1;
//    }

    int s = 0;
    int e = arr.length-1;

    while(s<=e){
        int mid = s + (e-s)/2;

        if(target<arr[mid]){
            e = mid - 1;
        }
        else if(target>arr[mid]){
            s = mid+1;
        }
        else{
            return mid;
        }
    }
    return e;
}
}