import java.util.Scanner;

public class factorial_rec {

    public static int fact(int i){

        if (i==0){
            return 1;
        }
        else if (i==1){
            return 1;
        }
        else {
            return (i * fact(i -1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int fact = fact(num);
        System.out.println("Factorial is :" + fact);
    }
}
