public class hollow_rectangle {
    public static void main(String[] args) {
        int i,j, n=4, m=5;
        for (i=1; i<=n; i++){
            for (j=1; j<=m; j++){
                if (i == 1 || i == n || j == 1 || j == m){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
