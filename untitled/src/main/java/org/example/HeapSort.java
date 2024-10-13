package org.example;

import java.util.ArrayList;

public class HeapSort {

    private ArrayList<Integer> liczby;
    private int length;

    public HeapSort(ArrayList<Integer> liczby)
    {
        this.liczby = liczby;
        length = liczby.size();
    }

    private boolean OneElement(ArrayList<Integer> list)
    {
        return list.size() <= 1;
    }

    private int getLength(ArrayList<Integer> list)
    {
        return list.size();
    }

    private void Swap(ArrayList<Integer> liczby, int pos0, int pos1)
    {
        int temp = liczby.get(pos0);
        liczby.set(pos0, liczby.get(pos1));
        liczby.set(pos1, temp);
    }

    private ArrayList<Integer> SortedArrayList()
    {
        if (OneElement(liczby))
        {
            return liczby;
        }

        BuildHeap();

        for (int i = length - 1; i > 0; i--)
        {
            Swap(liczby, i, 0);
            Heapify(0, i);
        }
        return liczby;
    }

    private void BuildHeap()
    {
        for (int i = length/2 - 1; i >= 0; i--)
        {
            Heapify(i, length);
        }
    }

    private void Heapify(int id, int heapSize)
    {
        int max = id;
        int left = 2 * id + 1;
        int right = 2 * id + 2;

        if (left < heapSize && liczby.get(left) > liczby.get(max))
        {
            max = left;
        }

        if (right < heapSize && liczby.get(right) > liczby.get(max))
        {
            max = right;
        }

        if (max != id)
        {
            Swap(liczby, id, max);
            Heapify(max, heapSize);
        }
    }

    public ArrayList<Integer> getSortedArrayList()
    {
        return SortedArrayList();
    }
}
