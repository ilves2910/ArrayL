package Arr1;/*Д/з Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList и
 измерьте время, которое потрачено на это. Сравните результаты.*/
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

/*long startTime = System.nanoTime();
// блок кода, время выполнения которого нужно измерить
long endTime = System.nanoTime();

long timeElapsed = endTime - startTime;*/

        int el = 500000;
        long startTimeAL = System.nanoTime();
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < el; i++) {
            List.add(i);
        }
        long endTimeAL = System.nanoTime();
        long timeAL = endTimeAL - startTimeAL;
//---------------------
        long startTimeLL = System.nanoTime();
        LinkedList<Integer> List1 = new LinkedList<>();
        for (int i = 0; i < el; i++) {
            List1.add(i);
        }
        long endTimeLL = System.nanoTime();
        long timeLL = endTimeLL - startTimeLL;

        System.out.println("Время, затраченное на добавление " + el + " элементов в ArrayList<Integer>: " + timeAL + " наносекунд.");
        System.out.println("Время, затраченное на добавление " + el + " элементов в LinkedList<Integer>: " + timeLL + " наносекунд.");

//сравнение
        if (timeAL > timeLL) {
            System.out.println("Время для ArrayList<Integer> требуется больше");
        } else System.out.println("Время для LinkedList<Integer> требуется больше");

        /*
long startTime1 = System.currentTimeMillis();
// блок кода, время выполнения которого нужно измерить
long endTime = System.currentTimeMillis();
long timeElapsed = endTime - startTime;*/

        long startTimeAL1 = System.currentTimeMillis();
        ArrayList<Integer> List2 = new ArrayList<>();
        for (int i = 0; i < el; i++) {
            List2.add(i);
        }
        long endTimeAL1 = System.currentTimeMillis();
        long timeAL1 = endTimeAL1 - startTimeAL1;
//---------------------
        long startTimeLL1 = System.currentTimeMillis();
        LinkedList<Integer> List3 = new LinkedList<>();
        for (int i = 0; i < el; i++) {
            List3.add(i);
        }
        long endTimeLL1 = System.currentTimeMillis();
        long timeLL1 = endTimeLL1 - startTimeLL1;

        System.out.println("Время, затраченное на добавление " + el + " элементов в ArrayList<Integer>: " + timeAL1 + "  милисекунд.");
        System.out.println("Время, затраченное на добавление " + el + " элементов в LinkedList<Integer>: " + timeLL1 + " милисекунд.");

//сравнение
        if (timeAL1 > timeLL1) {
            System.out.println("Время   для ArrayList<Integer> требуется больше");
        } else System.out.println("Время для LinkedList<Integer> требуется больше");

        //-------------------------

        long startTimeALSS = System.nanoTime();
        ArrayList<String> ListSS = new ArrayList<>();
        for (int i = 0; i < el; i++) {
            ListSS.add(String.valueOf(i));
        }
        long endTimeALSS = System.nanoTime();
        long timeALSS = endTimeALSS - startTimeALSS;
//---------------------
        long startTimeLLS = System.nanoTime();
        LinkedList<String> ListS = new LinkedList<>();
        for (int i = 0; i < el; i++) {
            ListS.add(String.valueOf(i));}
            long endTimeLLS = System.nanoTime();
            long timeLLS = endTimeLLS - startTimeLLS;

            System.out.println("Время, затраченное на добавление " + el + " элементов в ArrayList<String>: " + timeALSS + " наносекунд.");
            System.out.println("Время, затраченное на добавление " + el + " элементов в LinkedList<String>: " + timeLLS + " наносекунд.");

//сравнение
            if (timeALSS > timeLLS) {
                System.out.println("Время для ArrayList<String> требуется больше");
            } else System.out.println("Время для LinkedList<String> требуется больше");

            //массив String в милисекундах

        long startTimeALSSM = System.currentTimeMillis();
        ArrayList<String> ListSSM = new ArrayList<>();
        for (int i = 0; i < el; i++) {
            ListSSM.add(String.valueOf(i));
        }
        long endTimeALSSM = System.currentTimeMillis();
        long timeALSSM = endTimeALSSM - startTimeALSSM;
//---------------------
        long startTimeLLSM = System.currentTimeMillis();
        LinkedList<String> ListSM = new LinkedList<>();
        for (int i = 0; i < el; i++) {
            ListSM.add(String.valueOf(i));}
       long endTimeLLSM = System.currentTimeMillis();
        long timeLLSM = endTimeLLSM - startTimeLLSM;

        System.out.println("Время, затраченное на добавление " + el + " элементов в ArrayList<String>: " + timeALSSM + " милисекунд.");
        System.out.println("Время, затраченное на добавление " + el + " элементов в LinkedList<String>: " + timeLLSM + " милисекунд.");

//сравнение
        if (timeALSSM > timeLLSM) {
            System.out.println("Время для ArrayList<String> требуется больше");
        } else System.out.println("Время для LinkedList<String> требуется больше");

    }
    }
