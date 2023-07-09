package Seminar04.Homework;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {2, 5, 9, 10, 0, 5, 9, 1, 3, 8};
        List<Integer> listNum = new LinkedList<>(List.of(arr));
        System.out.println(listNum);
        System.out.println(reverseList(listNum));
    }

    static List<Integer> reverseList(List<Integer> list){
        List<Integer> result = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            result.add(iterator.previous());
        }
        return result;
    }
}
