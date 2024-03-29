package Testate.Testat0;

public class Testat0
{
    public static int[] apply( int[] arr, int x ){
        int counter = 0;
        for (int i : arr){
        if(i==x) 
        counter++;
       }   
       if(counter == 0)
       return arr;
       
       int[] reduce = new int[arr.length - counter];
       int offset = 0;
       for (int index = 0; index < arr.length; index++){
            if(arr[index] != x){
                reduce[index - offset] = arr[index];
            }
            else
            offset++;
       }
       return reduce;
    }
    public static void main(String[] args){
        int [] test={25,7,90,111,38,44};
        for (int i : apply(test, 7)){
            System.out.println(i);
        }
    }
}
