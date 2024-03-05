import java.util.Scanner;

public class Calculator {
    private float a;
    private float b;
    private String op;
    private Scanner s = new Scanner(System.in);
    public float add(){return a + b;}
    public float sub(){return a - b;}
    public float mul(){return a * b;}
    public float div(){ 
        while  (b==0) {
        System.out.println("Второе число = 0, введите заного!");
        readB();
        }
        s.close();
        return a / b;}
    public float calculate(){
        
        while (true){
            switch (op) {
                case "+":
                s.close(); 
                return add();
                case "-": 
                s.close();
                return sub();
                case "*": 
                s.close();
                return mul();
                case "/": 
                return div();
                default:
                    System.out.println("Incorrect operation, try again!");
                    readOp();
                break;
            }
    }
    
}
 
    
    public void readA(){


        boolean read = false;
        while (!read){
            try {
                a = s.nextFloat(); 
                read = true;
            }
            catch (java.util.InputMismatchException ex){
                System.out.println("Неверно введено число 1!");
                s.nextLine();
                
            }
        }
        //s.close();
    }
    public void readB(){

        boolean read = false;
        while (!read){

            try {
                b = s.nextFloat(); 
                read = true;
            }
            catch (java.util.InputMismatchException ex){
                System.out.println("Неверно введено число 2!");
                s.nextLine();
                
            }
        }
    }
    public void readOp(){
        while (true){
                op = s.next(); 
                if (op.equals("+")||op.equals("/")||op.equals("*")||op.equals("-")) {
                break;}    
                System.out.println("Неверно введена операция!");
        }
    };
    public void readAll(){
        readA();
        readOp();
        readB();

        
    };

    
}
