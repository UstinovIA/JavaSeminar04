package Seminar04.Homework;

import java.util.LinkedList;
import java.util.List;

public class myQueue {
    List<Integer> list = new LinkedList<>();

    void enqueue(Integer item){
        list.add(item);
    }

    Integer dequeue(){
        if(!list.isEmpty()){
            return list.remove(0);
        }
        else{
            return null;
        }
    }

    Integer first(){
        if(!list.isEmpty()){
            return list.get(0);
        }
        else{
            return null;
        }
    }
}
