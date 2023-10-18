import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр WaitList с элементами
        WaitList<Integer> waitList = new WaitList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("WaitList: " + waitList);

        // Добавляем элемент в WaitList
        waitList.add(6);
        System.out.println("WaitList after adding 6: " + waitList);

        // Удаляем элемент из WaitList
        int removedElement = waitList.remove();
        System.out.println("Removed element from WaitList: " + removedElement);
        System.out.println("WaitList after removal: " + waitList);

        // Проверяем наличие элемента в WaitList
        boolean containsElement = waitList.contains(3);
        System.out.println("WaitList contains 3: " + containsElement);

        // Проверяем наличие всех элементов из коллекции в WaitList
        Collection<Integer> testCollection = new ArrayList<>(Arrays.asList(2, 4, 6));
        boolean containsAllElements = waitList.containsAll(testCollection);
        System.out.println("WaitList contains all elements from the testCollection: " + containsAllElements);

        // Создаем экземпляр BoundedWaitList с ограниченной емкостью
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
        boundedWaitList.add("One");
        boundedWaitList.add("Two");
        boundedWaitList.add("Three");

        // Попытка добавить элемент, превышающий максимальную емкость
        try {
            boundedWaitList.add("Four");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("BoundedWaitList: " + boundedWaitList);

        // Создаем экземпляр UnfairWaitList
        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add('A');
        unfairWaitList.add('B');
        unfairWaitList.add('C');
        unfairWaitList.add('A');

        System.out.println("UnfairWaitList: " + unfairWaitList);

        // Перемещаем элемент 'A' в конец UnfairWaitList
        unfairWaitList.moveToBack('A');
        System.out.println("UnfairWaitList after moving 'A' to the back: " + unfairWaitList);
    }
}
