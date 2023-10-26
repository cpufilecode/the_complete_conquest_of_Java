package ch04;

public class IfControlStatement {
    public static void main(String[] args) {
        int value1 = 5;
        if(value1 > 3) {
            System.out.println("실행1");
        }
        if(value1 < 5) {
            System.out.println("실행2");
        }

        boolean bool1 = true;
        boolean bool2 = false;
        if(bool1) {
            System.out.println("실행3");
        }
        if(bool2) {
            System.out.println("실행4");
        }


    }
}
