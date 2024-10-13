package org.example;

import java.util.ArrayList;

public class SelectionSort {
    private ArrayList<Integer> liczby;
    private int length;

    public SelectionSort(ArrayList<Integer> liczby)
    {
        this.liczby = liczby;
        length = liczby.size();
    }

    private boolean LiczbyHasOneElement()
    {
        return length <= 1;
    }

    private ArrayList<Integer> SortedArrayList()
    {
        if (LiczbyHasOneElement())
        {
            return liczby;
        }

        int key;
        int poztemp;
        int min;

        for (int poz = 0; poz < length; poz++)
        {
            min = liczby.get(poz);
            poztemp = poz;

            for (int i = poz + 1; i < length; i++)
            {
                key = liczby.get(i);
                if (key < min)
                {
                    min = key;
                    poztemp = i;
                }
            }
            Swap(liczby, poz, poztemp);
        }
        return liczby;
    }

    private void Swap(ArrayList<Integer> liczby, int id1, int id2)
    {
        int temp = liczby.get(id1);
        liczby.set(id1, liczby.get(id2));
        liczby.set(id2, temp);
    }

    public ArrayList<Integer> getSortedArrayList()
    {
        return SortedArrayList();
    }
}
