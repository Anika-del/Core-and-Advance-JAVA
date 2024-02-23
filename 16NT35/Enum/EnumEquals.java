enum Week{
    //These are constant
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class EnumEquals {

    public static void main(String[] args) {
        
        Week day1, day2, day3;
        day1 = Week.Monday;
        day2 = Week.Monday;
        
        //day2 = Week.Tuesday;
        day3 = Week.Tuesday;
        //day3 = Week.Wednesday;

        if(day1.equals(day2))  //compair to refrence variable
        System.out.println("Error!"); //Error!

        if(!day1.equals(day2))
        System.out.println(day1+ " not equals " +day2);

        if(!day1.equals(day3))  //Monday not equals Tuesday
        System.out.println(day1+ " not equals " +day3);

        if(day2 != (day3))   //Monday != Tuesday
        System.out.println(day2 + " != " + day3);

    }   
}
