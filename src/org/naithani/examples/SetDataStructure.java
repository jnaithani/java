package org.naithani.examples;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Implement a set-like data structure that supports Insert, Remove, and GetRandomElement efficiently.
 *
 * Assumptions:
 * - Can't use a Set, okay to use List, Maps
 * - Efficient structure = order of insert and remove's is in constant time
 * - The inserted items are not maintained in sorted order
 */

public class SetDataStructure
{
    private List<Integer> list = new ArrayList<>();
    private Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args)
    {
        System.out.println("*** test() ***");
        test();
        System.out.println("*** test1() ***");
        test1();
        System.out.println("*** testNull() ***");
        testNull();
        System.out.println("*** testEmpty() ***");
        testEmpty();
    }

    public static void test()
    {
        SetDataStructure set = new SetDataStructure();

        set.insert(1);
        set.insert(3);
        set.insert(6);
        set.insert(8);

        System.out.println("*** Content after inserts");
        SetDataStructure.printSet(set);

        set.remove(6);

        System.out.println("*** Content after removing one element");
        SetDataStructure.printSet(set);

        System.out.println("*** Get random element");
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
    }

    public static void test1()
    {
        SetDataStructure set = new SetDataStructure();

        set.insert(1);

        System.out.println("*** Content after inserts");
        SetDataStructure.printSet(set);

        set.remove(1);

        System.out.println("*** Content after removing one element");
        SetDataStructure.printSet(set);

        System.out.println("*** Get random element");
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
    }

    public static void testNull()
    {
        SetDataStructure set = new SetDataStructure();

        set.insert(1);
        set.insert(3);
        set.insert(6);
        set.insert(8);
        set.insert(null);

        System.out.println("*** Content after inserts");
        SetDataStructure.printSet(set);

        set.remove(6);

        System.out.println("*** Content after removing one element");
        SetDataStructure.printSet(set);

        System.out.println("*** Get random element");
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
    }

    public static void testEmpty()
    {
        SetDataStructure set = new SetDataStructure();

        set.remove(1);

        System.out.println("*** Content after removing an element from an empty structure");
        SetDataStructure.printSet(set);

        System.out.println("*** Get random element");
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
        System.out.println("set.getRandomElement() = " + set.getRandomElement());
    }

    public static void printSet(SetDataStructure set)
    {
        if (set.size() == 0)
        {
            System.out.println("Empty set");
        }

        for (int i = 0; i < set.size(); i++)
        {
            System.out.println("set.get(" + i + ") = " + set.get(i));
        }
    }

    public void insert(Integer num)
    {
        if (map.get(num) == null)
        {
            list.add(num); // Add to the end

            map.put(num, list.size() - 1);
        }
    }

    public void remove(Integer num)
    {
        if (map.get(num) != null)
        {
            list.remove(map.get(num).intValue());

            map.remove(num);
        }
    }

    public Integer getRandomElement()
    {
        Random random = new Random();

        if (list.size() > 0)
        {
            int index = random.nextInt(list.size());

            return list.get(index);
        }
        
        return null;
    }

    public int size()
    {
        return list.size(); 
    }

    public Integer get(int index)
    {
        return list.get(index);
    }
}
