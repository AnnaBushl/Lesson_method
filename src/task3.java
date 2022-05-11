public class task3 {

    public static void Distance(int OurDistance) {
        int time = 1;
        if (OurDistance > 20){
            if (OurDistance > 60 && OurDistance <=100){
                time=time+2;
                System.out.println("Потребуется дней: " + time);
            }else {
                time=time+1;
                System.out.println("Потребуется дней: " + time);}

        }else System.out.println("Потребуется дней: " + time);
    }

    public static void main(String[] args) {
        int deliveryDistance = 15;    // интервал от [0;20] - 1 день; от (20;60] - 2 дня; от (60;100] - 3 дня
        Distance(deliveryDistance);
    }

}
