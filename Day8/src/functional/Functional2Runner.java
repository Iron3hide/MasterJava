package functional;

import java.util.List;

public class Functional2Runner {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 3, 2, 1);

        printBasicInt(list1);
        printIntWithFP(list1);
        printOddNos(list1);
        printEvenNos(list1);
        printBasicSum(list1);
        printBasicSumWithFP(list1);
        //printSort(list1);
    }

    private static void printSort(List<Integer> list1) {
        for (Integer integer:list1) {
            list1.stream().sorted().forEach(element-> System.out.println("sorted elements:" +element));
        }
    }

    private static int printBasicSumWithFP(List<Integer> list1) {
        return list1.stream().reduce(0,(number1,number2)-> {
            System.out.println(number1 + " " + number2);
            return number1 + number2;
        });
    }

    private static void printBasicInt(List<Integer> list1) {
        for (Integer number : list1) {
            System.out.println(number);
        }
    }

    private static void printIntWithFP(List<Integer> list1) {
        list1.stream().forEach(element -> System.out.println("FP element : " + element));
    }

    private static void printOddNos(List<Integer> list1) {
        list1.stream().filter(element -> element % 2 == 1).forEach(element -> System.out.println("odd elements: " + element));
    }

    private static void printEvenNos(List<Integer> list1) {
        list1.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println("Even elements: " + element));
    }

    private static void printBasicSum(List<Integer> list1) {
        int sum = 0;
        for(int n:list1){
            sum +=n;
        }
        System.out.println(sum);
    }
}