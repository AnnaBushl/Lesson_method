public class task4 {
    public static void searchDuplicate(String st) {
            for (int i = 0; i < st.length()-1; i++) {
                if (st.charAt(i) == st.charAt(i + 1)) {
                    System.out.println("Найден дубль! Повторяется символ: " + st.charAt(i));
                    break;
                } else
                    // Если до последего элемента в строке не найден дубль, то есть не было прерывания,
                    // И число в счетчике +1 равно индексу последнего элемента, то вся строка без дублей
                    if (i + 1 == st.length()-1){
                    System.out.println("Дублирующихся элементов нет!");
                }
            }
    }
    public static void main(String[] args) {
        String s = "abcdefghijk";
        searchDuplicate(s);
    }
}
