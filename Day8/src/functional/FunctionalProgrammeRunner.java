package functional;

import java.util.List;

public class FunctionalProgrammeRunner {

    public static void main(String[] args){

        List<String> list = List.of("Apple","Banana","Cat","Dog","Bat","Rat");

        printBasic(list);
        printWithFP(list);
        printBasicFilter(list);
        printWithFPFilter(list);
    }

    private static void printBasic(List<String> list)
    {
        for(String string:list){
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list)
    {
        list.stream().forEach(element -> System.out.println("FP element : " +element));
    }

    private static void printBasicFilter(List<String> list)
    {
        for(String string:list){
            if(string.endsWith("at")) {
                System.out.println(string);
            }
        }
    }

    private static void printWithFPFilter(List<String> list)
    {
        list.stream().filter(element->element.endsWith("at")).forEach(element -> System.out.println("elements ending with at:" + element));
    }
}