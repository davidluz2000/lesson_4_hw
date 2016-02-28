package com.company;

public class Main {


    //11. reverse array  - v
    //12. biggest num     - v
    //13 exists in
    //14. sort array



    public static void main(String[] args) {

        int [][] arr_off_arrays =  {{3,4,5,6,3,53,2,79,3,23,3455,34},{3},{3,4},{3,4,5,6,3},{4,5,6,3},{4,5,6},{3,23,3455,34}};

        int [] array = {3,4,5,6,3,53,2,79,3,23,3455,34};
        int [] ar2 = {};
        int [] ar3 = {3};
        int [] ar4 = {3,4};
        int [] ar5 = {3,4,5};
        int [] ar6 = {4,5,6,3};
        int [] ar7 = {4,5,6};
        int [] ar8 = {3,23,3455,34};
        int [] ar9 = {3,4,5,6,3,53,2,79,3,23,3455,34};
        int [] ar10 = {35};
        int [] ar11 = {3,34,34};
        int [] ar12 = {3,3455,34};
        int [] ar13 = {5,6,3,53,2,6};
        int [] ar14 = {23,3455,34,33};
        int [] ar15 = {9,8,7,6,5,4,3,2,1};
        //int [] ar16 = {};
        int [] ar16 ={};

        //System.out.println("array[] :");
        //System.out.println(biggestNum(array));
        //reverseArray (array);
//        for (int i = 1; i <=6 ; i++) {
//            System.out.println(existsIn(array,arr_off_arrays[i]));
//        }
        for (int i = 1; i <=6 ; i++) {
            sort(arr_off_arrays[i]);
        }

        for (int i = 1; i <=6 ; i++) {
            printArr(arr_off_arrays[i]);
            System.out.println();
        }

//        for (int i = 0; i < 6 ; i++)
//            System.out.print(ar15[i]+","+" ");

//        try{
//            int max = biggestNum (ar16);
//        }
//        catch (Exception ex){
//            System.out.println("exception catched");
//        }
//        System.out.println("program continued after catch");

           // int [] arr = {3,4,5,6,3,53,2,79};
//            int [] arr = {3};
//            System.out.println(existsIn(array,arr));

        // swap without temp parameter
//        int b =2;
//        int y =3;
//        b += y;
//        y = b-y;
//        b = b-y;
//        System.out.println(b);
//        System.out.println(y);

//        System.out.println("  ");
//
//        for (int i = 0; i < array.length ; i++)
//            System.out.print(array[i]+","+" ");

        // reverseArray (array);
    }

    public static int biggestNum(int [] arr)throws Exception{
        // when we call Exception function we need to call it from try and catch
        if (arr == null) {
            throw new Exception ("null ponter exception");
        }
        if(arr.length == 0){
            throw new Exception ("empty set");
        }
        int biggest = arr[0];
        for (int i = 1; i < arr.length ; i++)
            if(arr[i]>biggest)
                biggest = arr[i];

        return biggest;
    }

    public static void reverseArray(int [] arr){

        int temp1;

        for (int i = 0; i < arr.length/2 ; i++){
            temp1 = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-i-1]=temp1;
        }
    }


    public static int existsIn(int[] arr, int[] arr2){

        int j=0;
        int count=0;

        if(arr.length==0 || arr2.length==0)
            return 0;
        for (int i = 0; i < arr.length-arr2.length+1 ; i++){
            int k=i;
            while (arr[k]==arr2[j] && j<arr2.length-1){
                k++;
                j++;
                count++;
            }
            if (count==arr2.length-1)
                return i;
            count = 0;
            j = 0;
        }
        return 0;
    }


    public static int arraySearch(int[] arr, int[] arr2){

        int j=0;
        int count=0;

        if(arr.length==0 || arr2.length==0)
            return 0;
        for (int i = 0; i < arr.length-arr2.length+1 ; i++){
            int k=i;
            while (arr[k]==arr2[j] && j<arr2.length-1){
                k++;
                j++;
                count++;
            }
            if (count==arr2.length-1)
                return i;
            count = 0;
            j = 0;
        }
        return -1;
    }

    public static void sort(int[] arr){

        int temp_int;
        boolean sorted;
        int compareUpTo =  arr.length-1;

        while (true) {
            sorted = true;
            for (int i = 0; i < compareUpTo ; i++) {
                if(arr[i]>arr[i+1]){
                    temp_int = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = temp_int;
                    sorted = false;
                }
            }
            compareUpTo--;
            if (sorted)
                break;
        }
    }

    static public void printArr (int[] arr){

        for (int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+","+" ");
    }
}