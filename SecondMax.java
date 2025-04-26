/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;
public class SecondMax {
    public static Integer findSecondMax(int[] arr) {
        if (arr.length < 2) return null;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        return (max2 == Integer.MIN_VALUE) ? null : max2;
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 20, 8, 20};
        Integer result = findSecondMax(arr);
        if (result != null) {
            System.out.println("Second max: " + result);
        } else {
            System.out.println("No second max found.");
        }
    }
}
//output:Second Max:10