package Question2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws Exception {
        int first = 0, second = 1, next = 0, inputNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero para verificar se ele esta na sequencia de fibonacci:");
        inputNumber = scan.nextInt();

        while(inputNumber > next){
            next = first + second;
            first = second;
            second = next;
        }

        if(inputNumber == next){
            System.out.println("o numero " + inputNumber + " esta na sequencia de fibonacci");
        }
        else if(inputNumber < 0){
            System.out.println("digite um valor valido");;
        }
        else{
            System.out.println("o numero " + inputNumber + " NAO esta na sequencia de fib");
        }

        scan.close();


    }
}
