public class tickets {
    public static void main(String args[]) {
        int a[] = { 5, 1, 1, 1 };
        int i;
        int k = 0;
        int c = 0;
        while (a[k] > 0) {
           for (i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    a[i]--;
                    c++;
                    
                }
              //  i++;
                // Sysstem.out.println(c);
                if (a[k] == 0) {
                    System.out.println(c);
                    break;
                }
           }
        }
    }
}
