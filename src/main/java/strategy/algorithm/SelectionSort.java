package strategy.algorithm;


    public class SelectionSort implements SortingAlgorithm
    {
         @Override
        public void sort( int[] data )
        {

            // find the smallest element starting from position i
            for (int i = 0; i < data.length - 1; i++)
            {
                int min = i;  // record the position of the smallest
                for (int j = i + 1; j < data.length; j++)
                {
                    // update min when finding a smaller element
                    if (data[j] < data[min])
                        min = j;
                }

                // put the smallest element at position i
                swap(data, i, min);
            }
          }
        private void swap( int[] data,int x, int y )
        {
            int temp = data[x];
            data[x] = data[y];
            data[y] = temp;
        }
    }
