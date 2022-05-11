public class task2 {

    public static void selectVersion(int OS, int DeviceYear) {
        if (OS == 0) {
            if (DeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else System.out.println("Установите версию приложения для iOS по ссылке.");}

        else if(DeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }    else System.out.println("Установите версию приложения для Android по ссылке.");

    }
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2022;
        selectVersion(clientOS, clientDeviceYear);

    }

}
