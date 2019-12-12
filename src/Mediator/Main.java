package Mediator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menuButton = "";
        CheckBoxComponent checkBoxComponent1 = new CheckBoxComponentImpl("1. Ćwiczenia zaliczone.");
        CheckBoxComponent checkBoxComponent2 = new CheckBoxComponentImpl("2. Wykład (egzamin) zaliczony.");
        CheckBoxComponent checkBoxComponent3 = new CheckBoxComponentImpl("3. Ćwiczenia zaliczone.");
        Mediator mediator = new MediatorImpl(checkBoxComponent1, checkBoxComponent2, checkBoxComponent3);
        while(!menuButton.equals("4")){
            System.out.println(checkBoxComponent1);
            System.out.println(checkBoxComponent2);
            System.out.println(checkBoxComponent3);
            System.out.println("4. Wyjście z programu.");
            menuButton = scan.nextLine();
            mediator.inform(menuButton);
        }
    }
}
