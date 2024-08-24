public class SquarePattern {
    public static void main(String[] args) {
        int n = 4;

        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}