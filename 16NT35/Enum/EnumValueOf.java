enum Week{
    
    //These are constant
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class EnumValueOf {
    public static void main(String[] args) {
        Week day;

        //
        day = Week.valueOf("Monday");
        System.out.println("day contains "+ day);
        day = Week.valueOf("Tuesday");
        System.out.println("day contains "+ day);
        day = Week.valueOf("Wednesday");
        System.out.println("day contains "+ day);
    }
    
}
