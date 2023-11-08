/*Д/з Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList и
 измерьте время, которое потрачено на это. Сравните результаты.*/
import javax.lang.model.element.NestingKind;
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
if (timeAL>timeLL) {
    System.out.println("Время для ArrayList<Integer> требуется больше");
} else System.out.println("Время для LinkedList<Integer> требуется больше");

        /*

long startTime1 = System.currentTimeMillis();
// блок кода, время выполнения которого нужно измерить
long endTime = System.currentTimeMillis();
long timeElapsed = endTime - startTime;*/

       // int el = 500000;
        long startTimeAL1 = System.currentTimeMillis() ;
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
if (timeAL1>timeLL1) {
    System.out.println("Время   для ArrayList<Integer> требуется больше");
} else System.out.println("Время для LinkedList<Integer> требуется больше");
    }
}