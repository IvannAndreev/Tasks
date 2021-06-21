import java.util.Scanner;

public class TowerTask {
    public static int count=1;

    public static void main(String[] args) {
        System.out.println("Please enter a number of disks!");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        tower(n,'A','B','C');






    }
    public static void tower(int n, char A, char B, char C){
        if (n == 1) {
            System.out.println(count + " Move disk 1 from rod " + A + " to " + C);
            count++;

        }
        else {
            tower(n-1, A, C, B);
            System.out.println(count + " Move disk " + n + " from rod " + A + " to " + C);
            count++;
            tower(n-1, B, A, C);

        }
    }

}
