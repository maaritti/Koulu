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
public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] a) throws Exception {
        
                for (int i = a.length; --i >= 0;) {
            boolean flipped = false;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int T = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = T;
                    flipped = true;
                }
            }
            if (!flipped) {
                return;
            }
                }
    }
    
}
