package Seminar04.Homework;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {10, 9, 5};
        List<Integer> listNum = new LinkedList<Integer>(List.of(arr));
        System.out.println("Сумма всех элементов листа равна: " + sumListElements(listNum));
    }

    static int sumListElements(List<Integer> list){
        int result = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            result += iterator.next();
        }
        return result;
    }
}
