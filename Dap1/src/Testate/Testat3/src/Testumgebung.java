public class Testumgebung
{
    public static void main( String args[] )
    {
        System.out.println();
        // Beispiel 1
        int[] arr1 = {-2,12,-3,4,25};
        System.out.println( Testat.apply( arr1, 4 ) );
        
        //Beispiel 2
        int[] arr2 = {10,-2,6,5,-11};
        System.out.println( Testat.apply( arr2, 4 ) );
        
        //Beispiel 3
        int[] arr3 = {8,-8,14,22,-2,28};
        System.out.println( Testat.apply( arr3, 5 ) );
        
        //Beispiel 4
        int[] arr4 = {7,9,-3,-17,1,-2};
        System.out.println( Testat.apply( arr4, 5 ) );
        
        //Beispiel 5
        int[] arr5 = {8,7};
        System.out.println( Testat.apply( arr5, 1 ) );
        
        //Beispiel 6
        int[] arr6 = {-3};
        System.out.println( Testat.apply( arr6, 0 ) );
        
        // Beispiel 7
        int[] arr7 = {0,2,3,4,5};
        System.out.println( Testat.apply( arr7, -1 ) );
        
        // Beispiel 8
        int[] arr8 = {0,2,3,4,5};
        System.out.println( Testat.apply( arr8, 5 ) );
        
        //Beispiel 9
        int[] arr9 = {};
        System.out.println( Testat.apply( arr9, 1 ) );
        
    }
   
}

