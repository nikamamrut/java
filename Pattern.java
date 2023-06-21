class Pattern
{
    public static void main(String args[])
    {
        int num = 5;
        int rows = 3;
        for(int i = 1; i <= rows; i++) {
            for(int j = rows; j > i; j--) {
                System.out.print("   ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num + " ");
                num+=5;
            }
            System.out.println();
        }

        for(int i = rows - 1; i >= 1; i--) {
            for(int j = i; j < rows; j++) {
                System.out.print("   ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(num + " ");
                num+=5;
            }
            System.out.println();
        }
    }
}