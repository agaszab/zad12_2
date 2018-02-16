import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Queue<Integer> liczby = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę:");
            int liczba = scan.nextInt();
            liczby.offer(liczba);
            suma += liczba;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(liczby.poll());
            if (i<9)  System.out.print(" + "); else System.out.print(" = ");
        }

        System.out.println(suma);
    }
}
