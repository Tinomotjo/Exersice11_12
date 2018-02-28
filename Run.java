package Exersice11_12;
import java.util.*;
/*
 Write a method contains3 that accepts a list of strings as a parameter and returns true
 if any single string occurs at least 3 times in the list, and false otherwise.
 Use a map as auxiliary storage.
 */

public class Run
{
    public static void main(String[] args)
    {

        Map<String, Integer> maplist = new TreeMap<String, Integer>();
        maplist.put("Bo", 1);
        maplist.put("Bo", 2);
        maplist.put("Bo", 3);
        maplist.put("Simon", 1);
        maplist.put("Kirsten", 1);

        System.out.println(contains3(maplist));


    }


    public static boolean contains3(Map<String, Integer> list)
    {
        Map<String, Integer> maplist = new TreeMap<String, Integer>();
        maplist.putAll(list);

        for(String word : list.keySet())
        {
            int count = list.get(word);
            if (count > 2)
            {
                return true;
            }
        }
        return false;
    }




}
