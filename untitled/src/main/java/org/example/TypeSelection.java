package org.example;

import java.util.Scanner;

public class TypeSelection {

    private Scanner scanner = new Scanner(System.in);

    public TypeSelection()
    {
        System.out.println("\nPodaj rodzaj sortowania: ");
        System.out.println("1 - IS\n2 - SS\n3 - MS\n4 - HS\n5 - QS\npuste pole, aby anulować");
    }

    public int TypeNumber()
    {
        while (true)
        {
            String input = scanner.nextLine();
            if (input.isEmpty())
            {
                return 0;
            }
            try
            {
                if (WhatType(toInt(input)))
                {
                    return toInt(input);
                }
                System.out.println("Podaj rodzaj sortowania: ");
            }
            catch (NumberFormatException e)
            {
                System.out.println("To nie jest poprawna liczba. Spróbuj ponownie.");
            }
        }
    }

    private int toInt(String input)
    {
        return Integer.parseInt(input);
    }

    private boolean WhatType(int number)
    {
        return number >= 1 && number <= 5;
    }
}
