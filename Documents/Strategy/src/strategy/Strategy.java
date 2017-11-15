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
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         final int ARRAY_SIZE = 10000;
        Context context;
        
        int[] a = initArray(ARRAY_SIZE);
        
        System.out.println("array length: " + a.length);
        context = new Context(new QSort());
        long startTime = System.nanoTime();
        context.executeStrategy(a);
        long duration = System.nanoTime() - startTime;
        System.out.println("Duration (QSort): " + (duration) + " nanosec");
        
        a = initArray(ARRAY_SIZE);
        context = new Context(new BubbleSort());
        startTime = System.nanoTime();
        context.executeStrategy(a);
        duration = System.nanoTime() - startTime;
        System.out.println("Duration (BubbleSort): " + (duration) + " nanosec");
        
        a = initArray(ARRAY_SIZE);
        context = new Context(new SelectionSort());
        startTime = System.nanoTime();
        context.executeStrategy(a);
        duration = System.nanoTime() - startTime;
        System.out.println("Duration (SelectionSort): " + (duration) + " nanosec");
    }
    
    public static int[] initArray(int size) {
        int[] a = new int[size];
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            a[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return a;
        
    }
    
}
