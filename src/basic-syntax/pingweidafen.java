public class pingweidafen {
    public static void main(String[] args) {
        double[] a = new double[]{100,80,90,85.5,87.5,95};
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 6; j++) {
                if (a[i]>a[j]) {
                    double temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        double sum = 0;
        for (int i = 1; i < a.length-1; i++) {
            sum += a[i];
        }
        System.out.println("项目的最终得分是: " + sum/(a.length-2));
    }
}