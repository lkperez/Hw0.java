package com.gradescope.hw0;
public class Hw0 {
    //static int arr[] = new int[50];
    static int arr[] = {1,2,3};
    static int addAll()
    {
        int sum = 0;
        int i;
 
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static void main(String[] args){
        System.out.println(addAll());
    }
}
