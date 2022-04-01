package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers){
        double sum=0.0;
        for (Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.1);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args)
    {
        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        MyCustomList<String> list = new MyCustomList<>();
        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));

        list.addElement("element 1");
        list.addElement("element 2");
        list.addElement("element 3");
        list.addElement("element 4");
        list.addElement("element 5");
        System.out.println(list);

        String value = list.get(0);
        System.out.println(value);

        list.removeElement("element 1");
        System.out.println(list);

        MyCustomList<Integer> list1 = new MyCustomList<>();
        list1.addElement(5);
        list1.addElement(10);
        list1.addElement(15);
        list1.addElement(20);
        list1.addElement(25);
        System.out.println(list1);

        list1.removeElement(5);
        System.out.println(list1);

        Integer number = list1.get(0);
        System.out.println(number);
    }
}