/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;
public class MinElementPosition {
    public static int findMinPosition(int[] arr) {
        int minPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println("Position of minimum element: " + findMinPosition(arr));
    }
}
//output:Position of minimum element:1