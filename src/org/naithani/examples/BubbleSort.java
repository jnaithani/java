package org.naithani.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
	{
        BubbleSort bs = new BubbleSort();    	
        
        bs.sortArray();
        bs.sortList();
	}

    private void sortArray()
    {
        Integer[] array = {1, 9, 2, 8, 3, 7};

        Integer[] sortedArray = sortArray(array);

        for (int i = 0; i < sortedArray.length; i++)
        {
            System.out.println(sortedArray[i]);
        }
    }

    private void sortList()
    {
        Integer[] array = {1, 9, 2, 8, 3, 7};

        List<Integer> sortedList = sortList(new ArrayList<>(Arrays.asList(array)));

        for (Integer num : sortedList)
        {
            System.out.println(num);
        }
    }

    private Integer[] sortArray(Integer[] array)
    {
        Integer tempInt;

        int left = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = left; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    tempInt = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempInt;
                }
            }

            left++;
        }

        return array;
    }

    private List<Integer> sortList(List<Integer> list)
    {
        Integer tempInt;

        int left = 0;

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = left; j < list.size() - 1; j++)
            {
                if (list.get(j) > list.get(j + 1))
                {
                    tempInt = list.get(j);
                    list.remove(j);
                    list.add(j + 1, tempInt);
                }
            }

            left++;
        }

        return list;
    }
}
