import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new LinkedList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        intList.removeIf(i -> i <= 0);
        intList.removeIf(i -> i % 2 != 0);
        Collections.sort(intList);
        System.out.println(intList);

    }
}