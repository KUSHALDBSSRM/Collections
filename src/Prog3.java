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
public class Prog3 {
    public static int find(int [] A, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<A.length;i++){
			pq.offer(A[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int k,i,n,small;
    System.out.println("Enter no. of elements");
    n = sc.nextInt();
    int arr[] = new int[n];
    for(i=0;i<n;i++)
       arr[i] = sc.nextInt();
    System.out.println("Enter value of k");
    k = sc.nextInt();
    small = find(arr,k);
    System.out.println("\n"+small);
    
    
    
    }
    
}
