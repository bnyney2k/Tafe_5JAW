/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Matthew Gerlach
 */
public abstract class SearchUtils {
    
    /**
     * Searches the list in a linear fashion to find a matching object
     * @param _find The object to find
     * @param _in The list of objects to search in
     * @return 
     */
    public static Object findLinear(Object _find, List<Object> _in){
        for(Object o:_in){
            if(_find.equals(o)){
                return o;
            }
        }
        
        return null;
    }
    
    /**
     * Searches the list in a binary fashion to find a matching object
     * @param _find the object to find
     * @param _inSorted the list of objects to search in. Must be ordered.
     * @return 
     */
    public static Object findBinary(Object _find, List<Object> _inSorted){
        return binarySearch(_inSorted.toArray(), 0, _inSorted.size() - 1, _find.hashCode());
    }
    
    /**
     * Internal search to find the element using binary search algorithm
     * @param arr
     * @param l
     * @param r
     * @param x
     * @return 
     */
    private static Object binarySearch(Object arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is at the middle, then just return it
            if (arr[mid].hashCode() == x)
                return arr[mid];
 
            // If element is smaller than mid, then it is in the left sub-array
            if (arr[mid].hashCode() > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element is in the right sub-array
            return binarySearch(arr, mid + 1, r, x);
        }
        
        return null;
    }
}
