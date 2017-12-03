package org.naithani.examples;

import java.util.Map;
import java.util.HashMap;

public class TwoElementsExist
{
    public static void main(String[] args)
    {
        int[] array1= {5, 4, 2, 4};
        int[] array2= {5, 1, 2, 4};
        int[] array3= {4};
        int[] array4= {};
        int[] array5= null;

        int target = 8;

        TwoElementsExist twoElementsExist = new TwoElementsExist();

        System.out.println(twoElementsExist.doesExist(array1, target));
        System.out.println(twoElementsExist.doesExist(array2, target));
        System.out.println(twoElementsExist.doesExist(array3, target));
        System.out.println(twoElementsExist.doesExist(array4, target));
        System.out.println(twoElementsExist.doesExist(array5, target));

        System.out.println(twoElementsExist.doesExist2(array1, target));
        System.out.println(twoElementsExist.doesExist2(array2, target));
        System.out.println(twoElementsExist.doesExist2(array3, target));
        System.out.println(twoElementsExist.doesExist2(array4, target));
        System.out.println(twoElementsExist.doesExist2(array5, target));
    }

    private boolean doesExist(int[] array, int target)
    {
        if (array == null)
        {
            return false;
        }
        
        int index = 0;
        int count = 0;

        for (int i = index; i < array.length - 1; i++)
        {
            for (int j = index + 1; j < array.length; j++)
            {
                if ((array[i] + array[j]) == target)
                {
                    return true;
                }

                count++;
            }

            index++;
        }

        System.out.println(String.join("count = ", count + ""));

        return false;
    }

    private boolean doesExist2(int[] array, int target)
    {
        if (array == null)
        {
            return false;
        }

        Map<Integer, Integer> elements = new HashMap<>(array.length);
        int count = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (elements.get(target - array[i]) != null)
            {
                return true;
            }
            else
            {
                elements.put(target - array[i], array[i]);
            }

            count++;
        }

        System.out.println(String.join("count = ", count + ""));

        return false;
    }
}
