public class PostfixInc {
    
    public static void main(String[] args) {
        int x = 0;
        int y = 3 * x++;
        System.out.println("y: " + y++);
        System.out.println("y': " + y);
        
        System.out.print(3 + 3 + "3");
        System.out.print(" and ");
        System.out.println("3" + 3 + 3);
        
        System.out.print((true | false & true) + ", " );
        System.out.println(true | false & true);
    }
    
}
