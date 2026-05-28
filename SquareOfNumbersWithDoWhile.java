public class SquareOfNumbersWithDoWhile {
    public static void main(String[] args) {
    
        int count = 1;
        int square = 0;
        
        do {
            square = count * count;
            System.out.print(square + " ");
            count++;            
        } while (count <= 10);
        
    }
}
