package loreans;

/**
 * Created by nikeshs on 23/06/16.
 */
public class SortStrategy {
    private Sorter sorter;

    public SortStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortElements(int[] elements) {
        sorter.sort(elements);
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }
}
