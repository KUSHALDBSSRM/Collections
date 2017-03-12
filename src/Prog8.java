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
public class Prog8 {

    /**
     * @param args the command line arguments
     */
    static void characterCount(String inputString)
    {
     
 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
     
 
        char[] strArray = inputString.toCharArray();
 
     
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
     
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
     
                charCountMap.put(c, 1);
            }
        
        
        }
        int lar=0;char ch='0';
      Set s = charCountMap.entrySet();
      Iterator it = s.iterator();
      while(it.hasNext()){
          Map.Entry me = (Map.Entry)it.next();
          if(lar<(int)me.getValue())
          {
              lar = (int)me.getValue();
              ch = (char)me.getKey();
          }
      }
     
 
        System.out.println(ch);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    characterCount("javalanguage");
    }
    
}
