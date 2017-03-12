/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author kushal
 */
public class Prog2 {

    public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
    for(int i: nums){
        q.offer(i);
 
        if(q.size()>k){
            q.poll();
        }
    }
 
    return q.peek();
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int k,i,n,lar;
    System.out.println("Enter no. of elements");
    n = sc.nextInt();
    int arr[] = new int[n];
    for(i=0;i<n;i++)
       arr[i] = sc.nextInt();
    System.out.println("Enter value of k");
    k = sc.nextInt();
    lar = findKthLargest(arr,k);
    System.out.println("\n"+lar);
    
    
    }
    
}
