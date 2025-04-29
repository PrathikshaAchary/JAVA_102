/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;

public class Element {
    public static void main(String[] args){
        int[] arr={11,13,9,96,99,45,44};
        int ele=44;
        int flag=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==ele){
            flag=1;
            break;
        }}
        if(flag==1){
            
            System.out.println("element Found");
        }
        else{
            System.out.println("element Not found ");
        }
    }
        
    
}
