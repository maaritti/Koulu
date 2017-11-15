/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author maaritemilia
 */
public class SelectionSort implements SortStrategy {

    @Override
    public void sort(int[] a) throws Exception {
        
        for (int i = 0; i < a.length; i++) {
            int min = i;
            int j;
            /* * Find the smallest element in the unsorted list */
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            /* * Swap the smallest unsorted element into the end of the * sorted list. */
            int T = a[min];
            a[min] = a[i];
            a[i] = T;
        }
    }
    
}
