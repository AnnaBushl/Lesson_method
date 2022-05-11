public class task1 {
    public static void LeapYear(int thisYear) {
        if ((thisYear%4 == 0 && thisYear%100!=0) || thisYear%400==0 ){
            System.out.println(thisYear + " - високосный год.");
        }else System.out.println(thisYear + " - не високосный год.");
    }

    public static void main(String[] args) {
        int year = 2021;
        LeapYear(year);

    }
}
