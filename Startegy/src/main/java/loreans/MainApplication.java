package loreans;

/**
 * Created by nikeshs on 23/06/16.
 */
public class MainApplication {
    public static void main(String[] args) {
        int[] elements = {1,3,2,0};
      SortStrategy strategy = new SortStrategy(new BubbleSort());
        strategy.sortElements(elements);

        printElements(elements);

        strategy.setSorter(new InsertionSort());
        strategy.sortElements(elements);


        printElements(elements);
    }

    private static void printElements(int[] elements) {
        for(int element: elements){
            System.out.println(element);
        }
    }
}
