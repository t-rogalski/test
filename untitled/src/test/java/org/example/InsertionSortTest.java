package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    ArrayList<Integer> list;
    InsertionSort is;
    @BeforeEach
    public void setup()
    {
        list = new ArrayList<Integer>();
    }

    @Test
    void ListIsEmpty()
    {
        is = new InsertionSort(list);

        assertArrayEquals(Collections.emptyList().toArray(), is.getSortedArrayList().toArray());
    }

    @Test
    void OnlyEqualNumbers()
    {
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        is = new InsertionSort(list);

        assertDoesNotThrow(() -> is.getSortedArrayList());
    }

    @Test
    void IsSortedWithNegatives()
    {
        Collections.addAll(list, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -2, -5);
        is = new InsertionSort(list);

        Integer[] test = {-5, -2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(test, is.getSortedArrayList().toArray());
    }
}