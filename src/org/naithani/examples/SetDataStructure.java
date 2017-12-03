package org.naithani.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class SetDataStructure
{
    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args)
    {
        SetDataStructure set = new SetDataStructure();

        set.insert(1);
        set.insert(3);
        set.insert(6);
        set.insert(8);

        SetDataStructure.printSet(set);

        set.remove(6);

        SetDataStructure.printSet(set);

        System.out.println("set.getRandom() = " + set.getRandom());
        System.out.println("set.getRandom() = " + set.getRandom());
        System.out.println("set.getRandom() = " + set.getRandom());
    }

    public static void printSet(SetDataStructure set)
    {
        for (int i = 0; i < set.size(); i++)
        {
            System.out.println("set.get(" + i + ") = " + set.get(i));
        }
    }

    public void insert(int num)
    {
        if (!list.contains(num))
        {
            list.add(num);
        }
    }

    public boolean remove(Integer num)
    {
        return list.remove(list.remove(num));
    }

    public int getRandom()
    {
        Random random = new Random();

        int index = random.nextInt(list.size());

        return list.get(index);
    }

    public int size()
    {
        return list.size(); 
    }

    public int get(int index)
    {
        return list.get(index);
    }
}
