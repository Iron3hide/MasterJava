package arrayDay;

public class dayArray {

    private String[] daylist;

    public dayArray(String[] daylist)
    {
          this.daylist=daylist;
    }

    public void mostNoOfLetters() {
        String noOfCharacters = "";

        for(String day:daylist)
        {
            if(day.length()>noOfCharacters.length())
            {
                noOfCharacters = day;
            }
        }
        System.out.println("The Day with most no. of Characters is: " +noOfCharacters);
    }

    public void backwards() {
        System.out.println("Day of week in backwards: ");
        for (int i=daylist.length-1;i>=0;i--){
            System.out.println(daylist[i]);
        }
    }
}