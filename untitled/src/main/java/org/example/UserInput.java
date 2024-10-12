package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private ArrayList<Integer> liczby;
    private Scanner scanner = new Scanner(System.in);

    public UserInput(ArrayList<Integer> liczby)
    {
        this.liczby = liczby;

        System.out.print("Podaj liczby, w celu zakończenia, wciśnij ENTER w miejscu liczby \n");
        ScannerNumbers(liczby);
        System.out.println("Twoje liczby:\n" + liczby);
    }

    private void ScannerNumbers(ArrayList<Integer> liczby)
    {
        while (true)
        {
            String input = scanner.nextLine();
            if (input.isEmpty())
            {
                break;
            }
            try
            {
                int number = Integer.parseInt(input);
                liczby.add(number);
            }
            catch (NumberFormatException e)
            {
                System.out.println("To nie jest poprawna liczba. Spróbuj ponownie.");
            }
        }
    }

}
