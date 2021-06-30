package strategy.algorithm;

public class InsertionSort implements SortingAlgorithm
{
     @Override
    public void sort( int[] data )
    {

        for( int i = 1; i < data.length; i++ )
        {
            // a temporary copy of the current element
            int temp = data[i];
            int j;

            // find the position for insertion
            for( j = i; j > 0; j-- )
            {
                if( data[j - 1] < temp )
                    break;
                // shift the sorted part to right
                data[j] = data[j - 1];
            }

            // insert the current element
            data[j] = temp;
        }
        System.out.println("Array is sorted using Insertion Sort Algorithm");
        return data;
    }

}