public class ArrayFun {
    
    public static void main(String[] args) {
        int[] things = new int[3];
        things[0] = 1;
        things[1] = 2;
        things[2] = 3;
        System.out.println("things: " + things[0] + ", " + things[1] + ", " + things[2]);
        
        int thungs[] = new int[3];
        thungs[0] = 4;
        thungs[1] = 5;
        thungs[2] = 6;
        System.out.println("thungs: " + thungs[0] + ", " + thungs[1] + ", " + thungs[2]);
        
        int[] fungs[] = new int[3][3];
        fungs[0][0] = 11;
        fungs[0][1] = 12;
        fungs[0][2] = 13;
        fungs[1][0] = 21;
        fungs[1][1] = 22;
        fungs[1][2] = 23;
        fungs[2][0] = 31;
        fungs[2][1] = 32;
        fungs[2][2] = 33;
        System.out.println("fungs: ");
        System.out.println(fungs[0][0] + ", " + fungs[0][1] + ", " + fungs[0][2]);
        System.out.println(fungs[1][0] + ", " + fungs[1][1] + ", " + fungs[1][2]);
        System.out.println(fungs[2][0] + ", " + fungs[2][1] + ", " + fungs[2][2]);
        
        int[][] dungs = new int[3][3];
        dungs[0][0] = 11;
        dungs[0][1] = 12;
        dungs[0][2] = 13;
        dungs[1][0] = 21;
        dungs[1][1] = 22;
        dungs[1][2] = 23;
        dungs[2][0] = 31;
        dungs[2][1] = 32;
        dungs[2][2] = 33;
        System.out.println("dungs: ");
        System.out.println(dungs[0][0] + ", " + dungs[0][1] + ", " + dungs[0][2]);
        System.out.println(dungs[1][0] + ", " + dungs[1][1] + ", " + dungs[1][2]);
        System.out.println(dungs[2][0] + ", " + dungs[2][1] + ", " + dungs[2][2]);
        
        int rungs[][] = new int[3][3];
        rungs[0][0] = 11;
        rungs[0][1] = 12;
        rungs[0][2] = 13;
        rungs[1][0] = 21;
        rungs[1][1] = 22;
        rungs[1][2] = 23;
        rungs[2][0] = 31;
        rungs[2][1] = 32;
        rungs[2][2] = 33;
        System.out.println("rungs: ");
        System.out.println(rungs[0][0] + ", " + rungs[0][1] + ", " + rungs[0][2]);
        System.out.println(rungs[1][0] + ", " + rungs[1][1] + ", " + rungs[1][2]);
        System.out.println(rungs[2][0] + ", " + rungs[2][1] + ", " + rungs[2][2]);
    }
}
