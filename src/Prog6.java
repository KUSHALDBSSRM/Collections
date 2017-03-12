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
public class Prog6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TreeMap <Integer,Integer> t = new TreeMap<Integer,Integer>();
    t.put(1,10);
    t.put(2,30);
    t.put(3, 50);
    t.put(4, 67);
    t.put(5, 34);
    t.put(6,68);
    System.out.println(t.floorEntry(67));
    
    }
    
}
