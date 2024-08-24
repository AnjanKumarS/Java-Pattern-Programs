public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n*2-1;c++)
            {
                if (r + c >= n + 1 && c - r <= n - 1) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
