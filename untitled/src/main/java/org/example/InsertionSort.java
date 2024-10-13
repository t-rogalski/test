package org.example;

import java.util.ArrayList;

public class InsertionSort {
    private ArrayList<Integer> liczby;
    private int length;

    public InsertionSort(ArrayList<Integer> liczby)
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

        for(int poz = 1; poz < length; poz++)
        {
            key = liczby.get(poz);
            poztemp = poz;
            while (poztemp > 0 && liczby.get(poztemp - 1) > key)
            {
                poztemp -= 1;
            }
            liczby.remove(poz);
            liczby.add(poztemp, key);
        }
        return liczby;
    }

    public ArrayList<Integer> getSortedArrayList() {
        return SortedArrayList();
    }
}
