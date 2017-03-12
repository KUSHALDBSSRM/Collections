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
public class Prog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i,n,c=0,f=0;
        String sen="",str="",str1="";
        System.out.println("Enter the no. of strings");
        n = sc.nextInt();
      
      Set<String> s = new HashSet<String>();
      for(i=1;i<=n;i++)
      { 
          sen = sc.next();
          if(s.add(sen)== false)
              c++;
      }
    System.out.println(c);
    }
    
}
