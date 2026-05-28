public class ProductOfNumbersWithDoWhile {
    public static void main(String[] args) {
    
        int count = 1;
        int total = 0;
        
        do {
            total += count;
            
            count++;
        } while (count <= 100);
        
        System.out.println(total);
    }
}
