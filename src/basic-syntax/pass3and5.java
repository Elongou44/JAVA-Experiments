public class pass3and5 {
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);
            else {
                int sel = i % 10;
                if (sel == 3 || sel == 5)
                    System.out.println(i);
            }
        }
    }
}
