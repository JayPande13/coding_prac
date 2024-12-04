package JavaTrails;

public class Leapyear {
    public static void main(String[] args) {
        leapYear(1994);
    }

    public static void leapYear(int year){
        if(year%4==0) System.out.println("Year is Leap-year");
        else System.out.println("Year is non-Leap-year");
    }
}
