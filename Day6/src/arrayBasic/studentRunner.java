package arrayBasic;

import java.util.ArrayList;

public class studentRunner {

    public static void main(String[] args){

        int[] marks = {55,60,65,70};

        ArrayList arrayList = new ArrayList();

        arrayList.add("Lord");
        arrayList.add("Knight");
        arrayList.add("Squire");

        System.out.println(arrayList);
        System.out.println();

        System.out.println(arrayList.get(2));
        System.out.println();

        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println();

        ArrayList<String> items = new ArrayList<String>();
        items.add("Dragon");
        items.add("Lion");
        items.add("Wolf");
        System.out.println(items);
        System.out.println();

        items.remove(1);
        System.out.println(items);
    }
}