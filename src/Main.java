import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList тузунуз
         * 1ден 100го чейинки 50 сан менен толтурунуз
         * Дагы 2 ArrayList тузуп бирисине жогорудагы келген сандардын так сандардын, экинчисине жуп сандардын салыныз
         * Аларды консольго чыгарыныз
         */

        Random random = new Random();
        ArrayList<Integer> numbers  = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1,100));
        }
        System.out.println("Рандом сандар: " + numbers);

        getByChetNumbers(numbers);
    }
    public static void getByChetNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number %2 == 0){
                integers.add(number);
            }else {
                integers2.add(number);
            }
        }
        System.out.println("Жуп сандар: " + integers);
        System.out.println("Так сандар: " + integers2);
    }
}