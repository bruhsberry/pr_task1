import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a;
        try {
        a = s.nextFloat(); }
        catch (java.util.InputMismatchException ex){
            System.out.println("Неверно введено число 1!");
            return;
        }
        String op = s.next();
        float b;
        try{
        b = s.nextFloat();
        }
        catch (java.util.InputMismatchException ex){
            System.out.println("Неверно введено число 2!");
            return;
        }
        switch (op){
        case "+": {
            System.out.println(a + b);
            break;
        }
        case "-": {
            System.out.println(a - b);
            break;
        }

        case "*": {System.out.println(a * b);
            break;
        }
        case "/":{
            if(b==0) System.out.println("Делитель = 0!");
            else System.out.println(a / b);
            break;
        }
            default:
                System.out.println("Неверно введена операция!");
        }
    }
}
