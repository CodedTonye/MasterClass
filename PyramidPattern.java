public class PyramidPattern {
    public static void main(String[] args) {
         
        int count = 5;
           
        for (int row = 1; row <= count; row++) {
            for (int space = row; space < count; space++) {
            System.out.print(" ");
            }
            for (int column = 1; column <= (2 * row - 1); column++) {
            System.out.print("*");
            }
            
        System.out.println();        
        }
        
    }
}
