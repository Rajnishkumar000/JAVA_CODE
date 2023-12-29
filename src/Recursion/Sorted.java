package Recursion;

import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 4, 4};
        //System.out.println(sorted(arr, 0));
        ArrayList<Integer> ans=findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }

    static boolean sorted(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length)
            return list;
        if(arr[index]==target){
            list.add(index);

        }
        return findAllIndex( arr,target,index+1, list);
    }
}