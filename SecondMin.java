/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;
public class SecondMin {
    public static int findSecondMin(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num > min1) {
                min2 = num;
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("There is no second minimum element.");
        }

        return min2;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 5};
        try {
            System.out.println("Second minimum element: " + findSecondMin(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
//output:Second Min:8