/*
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class CheckForDuplicates {
    public boolean containDups(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int elem : nums) {
            if(set.contains(elem))
                return true;
            set.add(elem);
        }
        return false;
    }
}

public class ContainsDuplicates {
    public static void main(String[] args) {
        CheckForDuplicates dups = new CheckForDuplicates();
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of elements in the array - ");
        int total = sc.nextInt();
        int[] arr = new int[total];
        System.out.println("Enter the elements of the array - ");
        for(int i=0; i<total; i++) {
            arr[i] = sc.nextInt();
        }
        if(dups.containDups(arr))
            System.out.println("Contains Duplicates");
        else
            System.out.println("Doesn't contain duplicates");
    }
}
