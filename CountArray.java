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
}

