import java.util.ArrayList;

public class RecursionSorted {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,10,8,9};
          int[] brr = {3,4,5,4,6,7,8,9};
//        System.out.print(sorted(arr,0));
            int[] searcharr = {7,8,9,0,1,2,3,4};
          int target = 2;

        ArrayList ans = findAllIndex(brr,target,0);
//        System.out.print( ans);
        System.out.print(search(searcharr,target,0,searcharr.length-1));
    }


    static boolean sorted(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }

//        for (int i = 0; i < arr.length; i++) {
           return  arr[index] < arr[index+1] && sorted(arr,index+1);
//        }
    }

    static boolean linear_search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }

        return (arr[index] == target) || (linear_search(arr,target,index+1));
    }

    static int linear_search_int(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return linear_search_int(arr,target,index+1);
        }

//        return (arr[index] == target) || ();
    }

    static ArrayList linear_search(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return linear_search(arr,target,index+1,list);
    }

    static ArrayList findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansfrombelowcall = findAllIndex(arr,target,index+1);
        list.addAll(ansfrombelowcall);

        return list;
    }

    static int search(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return search(arr,target,s,mid-1);
            }else{
                return search(arr,target,mid+1,e);
            }
        }

        if(target >= arr[mid] && target <= arr[e]){
            return search(arr,target,mid+1,e);
        }else{
            return search(arr,target,s,mid-1);
        }

    }
}
