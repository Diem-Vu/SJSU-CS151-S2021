
//package assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class ListManipulator
 * <p>
 * java.util.ArrayList<Integer>
 * java.util.HashMap<Integer>
 * java.util.Map<Integer>
 *
 *
 * Methods:
 * ArrayList<Integer>   sort
 * ArrayList<Integer>   swapLargestSmallest
 * void                 table
 *
 * @author Diem.Vu
 * @version 1.0
 * @since 03.22.21
 */
public class ListManipulator {

    /**
     *
     * @param myLst
     * @param ascending
     * @return
     */
    public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){

        ArrayList <Integer> sorted = new ArrayList<>(myLst.size());

        ArrayList <Integer> tempList = new ArrayList<>(myLst.size());
        for(int i = 0; i < myLst.size(); i++){
            tempList.add(myLst.get(i));
        }

        for(int i = 0; i < tempList.size() - 2; i++){
            for(int j = tempList.size() - 1; j > i; j--){

                if(tempList.get(i).compareTo(tempList.get(j)) > 0){
                    int temp = tempList.get(i);
                    tempList.set(i, tempList.get(j));
                    tempList.set(j, temp);
                }
            }
        }

        if(ascending){
            for(int i = 0; i < tempList.size(); i++){
                sorted.add(tempList.get(i));
            }
        }else{
            for(int j = tempList.size() - 1; j >= 0; j--){
                sorted.add(tempList.get(j));
            }
        }
        return sorted;
    }

    /**
     *
     * @param myLst
     * @return
     */
    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        ArrayList <Integer> swap = new ArrayList<>(myLst.size());
        for(int i = 0; i < myLst.size(); i++){
            swap.add(myLst.get(i));
        }
        int max = swap.get(0), min = swap.get(0);
        int maxIndex = 0, minIndex = 0;
        for (int n : swap) {
            if (max < n){
                max = n;
                maxIndex = swap.indexOf(n);
            }
            if(min > n){
                min = n;
                minIndex = swap.indexOf(n);
            }
        }
        swap.set(minIndex, max);
        swap.set(maxIndex, min);

        return swap;
    }

    /**
     *
     * @param myLst
     */
    public void table(ArrayList<Integer> myLst){
        //create a table from ArrayList myLst
        Map<Integer, Integer> table = new HashMap<>();
        myLst.forEach((i) -> {
            Integer j = table.get(i);
            table.put(i, (j == null)? 1: j+1); //put element i of myLst and its occurrence (1 or j+1) to the table
        });
        //sort the table
        TreeMap<Integer, Integer> sortedTb = new TreeMap<>(table);
        //output the table to command lines
        sortedTb.forEach((k, v) -> {
            System.out.println("Element " + k + " " + "occurs" + ": " + v + " times");
        });

    }
}
