import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

// Создать новый список, добавить несколько строк и вывести коллекцию на экран.

public class Task3_1 {

    public static void main(String[] args) {
        
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));

        listStr.add("Jupiter");
        listStr.add("Saturn");
        listStr.add("Uranus");
        listStr.add("Neptune");

        System.out.println("Initial list: "+listStr);

        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        // listStr.replaceAll(x -> "!" + x);
        listStr.replaceAll(x -> x + "!");
        System.out.println("Modified list with '!': "+listStr);              

        // Вставить элемент в список в первой позиции.
        listStr.add(0, "NewPlanet");
        System.out.println("Addition element in to the first position to the list: " + listStr);

        // Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("Getted list's item by the {5} position : " + listStr.get(5));

        // Обновить определенный элемент списка по заданному индексу.
        listStr.set(8, "Nept");
        System.out.println("Updated list item 'Neptune!' on 'Nept': "+ listStr);

        // Удалить третий элемент из списка.
        listStr.remove(2);
        System.out.println("List with an item deleted by index {2}: "+listStr);

        // Поиска элемента в списке по строке.
        System.out.println("Index item's finded by string {Nept}: " + listStr.indexOf("Nept"));  
        
        //Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> listStr2 = new ArrayList<>(listStr.subList(3, 6));
        System.out.println("New list from the first list item: " + listStr2);

        // Удалить из первого списка все элементы отсутствующие во втором списке.        
        listStr.removeAll(listStr2);        
        System.out.println("Removed items missing from the second list: " + listStr);  

        // *Сортировка списка.
        Collections.sort(listStr);
        System.out.println("Sorted first list:" + listStr);
        
    }
}