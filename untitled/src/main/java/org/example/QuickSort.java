package org.example;

import java.util.ArrayList;

public class QuickSort {

    private ArrayList<Integer> liczby;

    public QuickSort(ArrayList<Integer> liczby)
    {
        this.liczby = liczby;
    }

    private boolean OneElement(ArrayList<Integer> list)
    {
        return list.size() <= 1;
    }

    private ArrayList<Integer> SortedArrayList(int start, int end)
    {
        if (start < end)
        {
            int pivot_location = Partition(start, end);
            SortedArrayList(start, pivot_location - 1);
            SortedArrayList(pivot_location + 1, end);
        }
        return liczby;
    }

    private int Partition(int start, int end)
    {
        int pivot = liczby.get(end);
        int left = start - 1;

        for (int j = start; j <= end - 1; j++)
        {
            if (liczby.get(j) < pivot)
            {
                left++;
                Swap(liczby, left, j);
            }
        }
        left++;
        Swap(liczby, left, end);
        return left;
    }

    private void Swap(ArrayList<Integer> list, int pos1, int pos2)
    {
        int temp = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
    }

    public ArrayList<Integer> getSortedArrayList()
    {
        return SortedArrayList(0, liczby.size() - 1);
    }
}
