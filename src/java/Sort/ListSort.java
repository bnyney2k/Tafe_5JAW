/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matt Gerlach
 */
public class ListSort {
    public static void sortByInsertion(List<Object> _list, int n){
        //If we are at element 0, then we have finished
        if(n <= 1){
            return;
        }
        //First element sorted
        sortByInsertion(_list, n-1);
        
        //Get the last object
        Object last = _list.get(n-1);
        //The next lowest last position
        int newLastPos = n-2;
        
        //While the hashcode of the last element is lower than the current element 
        //Move the last element back one
        while(newLastPos >= 0 && _list.get(newLastPos).hashCode() > last.hashCode()){
            _list.set(newLastPos+1, _list.get(newLastPos));
            newLastPos--;
        }
        
        //Reposition the last element
        _list.set(newLastPos+1, last);
    }
    
    public static void sortBySelection(List<Object> _list){
        int setPos;
        Object tmp;
        for (int i=0; i< _list.size(); i++){
            setPos = i;
            for(int i2 = 0; i2 < _list.size(); i2++){
                if(_list.get(i2).hashCode() < _list.get(setPos).hashCode()){
                    setPos = i2;
                }
            }
            
            tmp = _list.get(setPos);
            _list.set(setPos, _list.get(i));
            _list.set(i, tmp);
        }
    }
    
    public static void sortByBubble(List<Object> _list, int n){
        //If we are complete, then just return
        if (n <= 1)
        {
            return;
        }

        //For each element from the beginning of the list to the n element
        for (int i=0; i<n-1; i++)
        {
            //If the hashcode is greater than the next one
            if (_list.get(i).hashCode() > _list.get(i+1).hashCode())
            {
                //Swap the elements
                Object temp = _list.get(i);
                _list.set(i, _list.get(i+1));
                _list.set(i, temp);
            }
        }
            
        //Repeat down the list
        sortByBubble(_list, n-1);
    }
}
