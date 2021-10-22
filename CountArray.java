/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountArray;
import java.util.*;
/**
 *
 * @author Nathan
 */
public class CountArray 
{
    public static void main(String args[])
    {        
        ArrayList <List <Integer>> list = new ArrayList <List <Integer>>();
        
        ArrayList <Integer> row3 = new ArrayList <Integer>();
        ArrayList <Integer> countedRow3 = new ArrayList <Integer>();
        
        ArrayList <Integer> row4 = new ArrayList <Integer>();
        ArrayList <Integer> countedRow4 = new ArrayList <Integer>();
        
        Tally counter = new Tally();
        
        counter.AddRandom(row3, 10);
        counter.AddRandom(row4, 10);
        
        counter.Count(row3, countedRow3, list);
        counter.Count(row4, countedRow4, list);
        
    }
    
    public static void AddRandom(ArrayList<Integer> setList){
        int random;
        for(int i = 0; i < 10; i++)
        {
            random = (int) Math.floor(Math.random() * 10);
            setList.add(random);
        }
    }
    
    public static void Count(ArrayList<Integer> list, ArrayList<Integer> list2, ArrayList<List<Integer>> listOfLists)
    {   
        ArrayList<Integer> singles = new ArrayList<>();
        int temp;
        int count = 0;
        
        temp = list.get(0);
        singles.add(temp);
        
            for(int i = 0; i <= list.size() - 1; i++)
            {
                if(list.get(i).equals(temp))
                {
                    count++;
                    //Check if end of array and add the counter. Otherwise loop ends without.
                    if( i == (list.size() - 1))
                    {
                        list2.add(count);
                    }
                }

                //Checking if end of array. IF it IS add previous count. BECAUSE the last index is NOT EQUAL
                //We just add 1 appearance.
                else if( i == (list.size() - 1) && !list.get(i).equals(temp))
                {
                        list2.add(count);
                        list2.add(1);
                        singles.add(list.get(i));
                }
                //If the previous variable does NOT match the temp assign new and count SORTED integers
                else 
                {
                    list2.add(count);
                    count = 1;
                    temp = list.get(i);
                    singles.add(temp);
                }
            }
            
            listOfLists.add(singles);
            listOfLists.add(list2);
            System.out.println("Not Sorted BUT Counted\n" + list +"\n" + list2);
            System.out.println("Assorted list\n" + listOfLists.get(0) + "\n" + listOfLists.get(1) + "\n");
            
    }
}

