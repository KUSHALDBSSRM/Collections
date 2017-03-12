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
public class Prog11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int c=0;
    ArrayList<Integer>countsmall = new ArrayList<Integer>();
        ArrayList <Integer>l = new ArrayList<Integer>();
        l.add(12);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(0);
        l.add(11);
        l.add(4);
                
            for(int i=0;i<l.size();i++)
            {
                c=0;
                for(int j=i+1;j<l.size();j++)
                {
                    if(l.get(i)>l.get(j))
                        c++;
                }
        countsmall.add(c);
    
    }
    System.out.print(countsmall);
}
}
