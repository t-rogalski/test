package org.example;

import java.util.ArrayList;

public class MergeSort {

    private ArrayList<Integer> liczby;

    public MergeSort(ArrayList<Integer> liczby)
    {
        this.liczby = liczby;
    }

    private boolean OneElement(ArrayList<Integer> list)
    {
        return list.size() <= 1;
    }

    private ArrayList<Integer> SortedArrayList(ArrayList<Integer> ToDivide)
    {
        if (OneElement(ToDivide))
        {
            return ToDivide;
        }
        ArrayList<Integer> FirstGroup = new ArrayList<>(ToDivide.subList(0, ToDivide.size()/2));
        ArrayList<Integer> SecondGroup = new ArrayList<>(ToDivide.subList(ToDivide.size()/2, ToDivide.size()));

        FirstGroup = SortedArrayList(FirstGroup);
        SecondGroup = SortedArrayList(SecondGroup);

        return Merge(FirstGroup, SecondGroup);
    }

    private ArrayList<Integer> Merge(ArrayList<Integer> FirstGroup, ArrayList<Integer> SecondGroup)
    {
        ArrayList<Integer> MergeGroup = new ArrayList<>();

        while (!FirstGroup.isEmpty() && !SecondGroup.isEmpty())
        {
            if (FirstGroup.get(0) > SecondGroup.get(0))
            {
                MergeGroup.add(SecondGroup.get(0));
                SecondGroup.remove(0);
            }
            else
            {
                MergeGroup.add(FirstGroup.get(0));
                FirstGroup.remove(0);
            }
        }

        while (!FirstGroup.isEmpty())
        {
            MergeGroup.add(FirstGroup.get(0));
            FirstGroup.remove(0);
        }
        while (!SecondGroup.isEmpty())
        {
            MergeGroup.add(SecondGroup.get(0));
            SecondGroup.remove(0);
        }

        return MergeGroup;
    }

    public ArrayList<Integer> getSortedArrayList()
    {
        return SortedArrayList(liczby);
    }
}