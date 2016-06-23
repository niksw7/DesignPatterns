package loreans;

/**
 * Created by nikeshs on 22/06/16.
 */
public class BubbleSort implements Sorter {
    public void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (elements[j] < elements[i]) {
                    elements = swap(i, j, elements);
                }
            }
        }
    }

    private int[] swap(int position1, int position2, int[] elements) {
        elements[position1] = elements[position1] + elements[position2];
        elements[position2] = elements[position1] - elements[position2];
        elements[position1] = elements[position1]-elements[position2];
        return elements;
    }
}
