public class Thing {

    private int num;    
    
    public static void main(String[] args) {
        Fling fling = new Fling();
        fling.setFling(6);
        System.out.println("Hello World!" + fling.getFling());
        Fling.main(args);
    }
    
    public int getNum() {
        return num;
    }
    
}
