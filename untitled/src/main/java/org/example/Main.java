package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> liczby = new ArrayList<>();
        new UserInput(liczby);
        TypeSelection typeSelection = new TypeSelection();
        int type = typeSelection.TypeNumber();

        if (type == 1)
        {
            InsertionSort is = new InsertionSort(liczby);
            System.out.println("Twoje liczby posortowane przez wstawianie");
            System.out.println(is.getSortedArrayList());
        }
        if (type == 2)
        {
            SelectionSort ss = new SelectionSort(liczby);
            System.out.println("Twoje liczby posortowane przez wybór");
            System.out.println(ss.getSortedArrayList());
        }
        if (type == 3)
        {
            MergeSort ms = new MergeSort(liczby);
            System.out.println("Twoje liczby posortowane przez scalanie");
            System.out.println(ms.getSortedArrayList());
        }
        if (type == 4)
        {
            HeapSort hs = new HeapSort(liczby);
            System.out.println("Twoje liczby posortowane przez kopcowanie");
            System.out.println(hs.getSortedArrayList());
        }
        if (type == 5)
        {
            System.out.println("coś tu będzie");
        }
    }
}