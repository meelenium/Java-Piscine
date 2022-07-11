import java.util.Scanner;

public class Program {
    public static int main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        int numDel = 2;
        int num = numIn.nextInt();
        int iterCount = 0;

        if(num < 2) {
            System.err.println("Illegal Argument\n");
            return (-1);
        }
        if(num == 2) {
            System.out.println("true 1" + '\n');
            return (0);
        }
        while(numDel * numDel <= num) {
            iterCount++;
            if(num % numDel == 0) {
                System.out.println("false " + iterCount + '\n');
                return (0);
            }
            numDel++;
        }
        System.out.println("true " + iterCount + '\n');
        return (0);

    }
}