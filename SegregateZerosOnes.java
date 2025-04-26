/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;

public class SegregateZerosOnes {
    public static void segregateZerosOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1};
        segregateZerosOnes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
