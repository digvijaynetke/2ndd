package backtracking;

import java.util.ArrayList;
import java.util.List;
public class permutation {
   static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args){
        int[] arr = {1 ,2 , 3};

        help(0 , arr);

        // for(List<Integer> lst : ans){
            // System.err.println(Arrays.toString(ans));
            
        // }

            // now i want to print the ans list of list
        for(List<Integer> lst : ans){
            System.out.println(lst);    
        }

    }   

    static void help(int idx , int[] arr){
        if(idx == arr.length -1 ){

            List<Integer> lst = new ArrayList<>();
            for(int a : arr){
                lst.add(a);
            }
            ans.add(lst);
            return;
        }

        for(int i = idx ; i < arr.length ; i++){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        
            help(idx+1 , arr);
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }
    }
}
