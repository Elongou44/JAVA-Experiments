package basic_syntax;
public class Gold_fenge {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE;
        int i1 = 0;
        int j1 = 0;
        for (int i = 1;i < 21;i++) {
            for (int j = 1; j < 21; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    continue;
                else {
                    double c = (double) i / j;
                    double diff = Math.abs(c - 0.618);
                    if (diff < min) {
                        min = diff;
                        i1 = i;
                        j1 = j;
                    }
                }
            }
        }
        System.out.println(i1);
        System.out.println(j1);
    }
}
