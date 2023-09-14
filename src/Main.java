import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator iterator = intList.iterator();
        while (iterator.hasNext()) {
            int next = (int) iterator.next();
            if (next <= 0 || (next % 2) != 0) {
                iterator.remove();
            }
        }
        Collections.sort(intList);
        System.out.println(intList);
    }
}