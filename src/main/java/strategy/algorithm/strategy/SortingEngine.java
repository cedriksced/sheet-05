package strategy;

import strategy.algorithm.*;


public class SortingEngine {
    private SortingAglorithm strategy;



    public SortingEngine()  {
        this.strategy = new BubbleSort();
    }


        public void setStrategy(SortingAlgorithm strategy)  {
            this.strategy = strategy;
        }

        public void sort(int[] data)  {
            strategy.sort(data);
        }
}
