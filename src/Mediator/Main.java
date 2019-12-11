package Mediator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuButton = 0;
        while(menuButton != 4){
            System.out.println("1. Ćwiczenia zaliczone.  " +
                    "\n2. Wykład (egzamin) zaliczony. " +
                    "\n3. Przedmiot zaliczony (wygrany konkurs). " +
                    "\n4. Wyjście z programu. ");
            menuButton = scan.nextInt();
        System.out.println("Hello World!");
    }

}
