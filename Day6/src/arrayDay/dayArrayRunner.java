package arrayDay;

public class dayArrayRunner {

    public static void main(String[] args){

        String[] daylist = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        dayArray newday = new dayArray(daylist);

        System.out.println("Day of week in given format: ");
        /*for (int i = 0;i<daylist.length;i++){
            System.out.println(daylist[i]);
        }*/
        for (String day:daylist){
            System.out.println(day);
        }

        newday.mostNoOfLetters();
        newday.backwards();
    }
}