package Arr2;

/*Д/з Расширим предыдущую задачу. Замерить время
добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet.
 Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее*/
import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;

public class Main {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Main() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {

        int el = 500000;
        ArrayList<Integer> List = new ArrayList<>();
          long startTimeAL1 = System.currentTimeMillis();
                        for (int i = 0; i < el; i++) {
                    List.add(i);
                }
          long endTimeAL1 = System.currentTimeMillis();
        long timeAL1 = endTimeAL1 - startTimeAL1;
        //---------------------
        LinkedList<Integer> List1 = new LinkedList<>();
        long startTimeLL1 = System.currentTimeMillis();
                for (int i = 0; i < el; i++) {
                    List1.add(i);
                }
                long endTimeLL1 = System.currentTimeMillis();
                long timeLL1 = endTimeLL1 - startTimeLL1;

            System.out.println("Время, затраченное на добавление " + el + " элементов в ArrayList<Integer>: " + timeAL1 + "  милисекунд.");
            System.out.println("Время, затраченное на добавление " + el + " элементов в LinkedList<Integer>: " + timeLL1 + " милисекунд.");

        // TreeSet
        Set<String> TS = new TreeSet<>();
                long startTTS = System.currentTimeMillis();
                for (int i = 0; i < el; i++) {
                    TS.add(String.valueOf(i));
                }
                long endTTS = System.currentTimeMillis();
                long timeTS = endTTS - startTTS;

                //HashSet
        HashSet<String> HS = new HashSet<>();
        long startTHS = System.currentTimeMillis();
                for (int i = 0; i < el; i++) {
                    HS.add(String.valueOf(i));
                }
                long endTHS = System.currentTimeMillis();
                long timeHS = endTHS - startTHS;

                System.out.println("Время, затраченное на добавление " + el + " элементов в TreeSet<String>: " + timeTS + "  милисекунд.");
                System.out.println("Время, затраченное на добавление " + el + " элементов в HashSet<String>: " + timeHS + " милисекунд.");

                //ПОИСК
        //поиск в ArrayList
         long startTimeALS = System.nanoTime();
                List.getFirst();
        long endTimeALS = System.nanoTime();
         long timeALS = endTimeALS - startTimeALS;

        System.out.println("Время, затраченное на поиск первого элемента в ArrayList " + timeALS + " наносекунд");

// поиск в LinkedList
                long startTimeLLF = System.nanoTime();
                List1.getFirst();
               long endTimeLLF = System.nanoTime();
                long timeLLF = endTimeLLF - startTimeLLF;

System.out.println("Время, затраченное на поиск первого элемента в LinkedList: " + timeLLF + "  наносекунд.");

//поиск в TreeSet
                long startTTSF = System.nanoTime();
                System.out.println(TS.stream().findFirst());
                long endTTSF = System.nanoTime();
                long timeTSF = endTTSF - startTTSF;
                System.out.println("Время, затраченное на поиск первого элемента в TreeSet: " + timeTSF + "  наносекунд.");

// поиск в HashSet
                long startTHSF = System.nanoTime();
                System.out.println(HS.stream().findFirst());
                long endTHSF = System.nanoTime();
                long timeHSF = endTHSF - startTHSF;

                System.out.println("Время, затраченное на поиск первого элемента в HashSet: " + timeHSF + "  наносекунд.");

                //УДАЛЕНИЕ
        //Удаление элемента из ArrayList
        long startTimeALR = System.nanoTime();
        List.removeFirst();
        long endTimeALR = System.nanoTime();
        long timeALR = endTimeALR - startTimeALR;
        System.out.println("Время для удаления элемента из ArrayList " + timeALR + " наносекунд");

//Удаление элемента из LinkedList
        long startTimeLLR = System.nanoTime();
        List1.removeFirst();
        long endTimeLLR = System.nanoTime();
        long timeLLR = endTimeLLR - startTimeLLR;
        System.out.println("Время для удаления элемента из LinkedList " + timeLLR + " наносекунд");
//Удаление элемента из TreeSet
        long startTimeTSR = System.nanoTime();
         TS.remove(0);
        long endTimeTSR = System.nanoTime();
        long timeTSR = endTimeTSR - startTimeTSR;
        System.out.println("Время для удаления элемента из TreeSet " + timeTSR + " наносекунд");
//Удаление элемента из HashSet
        long startTimeHSR = System.nanoTime();
        HS.remove(0);
        long endTimeHSR = System.nanoTime();
        long timeHSR = endTimeHSR - startTimeHSR;
        System.out.println("Время для удаления элемента из HashSet " + timeHSR + " наносекунд");
               }
        }