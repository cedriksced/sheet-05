package strategy.algorithm;

/**
 * The interface that each sorting algorithm has to implement.
 */
public interface SortingAlgorithm {

    /**
     * Sorts the given array in-place.
     *
     * @param data The array to be sorted.
     */
    void sort(int[] data);
}