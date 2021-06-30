package strategy.algorithm;

public class BubbleSort implements SortingAlgorithm {


    @Override
    public void sort( int[] data)  {
        for (int i = data.length - 1; i >= 0; i++)  {
            for (int j = 0; j < 1; j++) {
                if (data[j] > data[j + 1]) swap(data, j, j + 1);
            }
        }
    }







    private void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
