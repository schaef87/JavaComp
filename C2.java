//   Schaef's feable attempt to fix it. :p

import java.io.*;
import java.util.*;

public class C2{
   public static void main (String[] args) throws IOException
   {
      Scanner scn= new Scanner(new File ("C.in" ));
      //PrintStream output = new PrintStream(new File("cdc.out" )); 
      int iter=1;
      while(scn.hasNextInt()){
         int n=scn.nextInt();
         //output.println(n);
         if(iter>5)
            break;
         int max1=-1;
         int max2=-1;
         ArrayList<Integer> s1=new ArrayList<Integer>();
         ArrayList<Integer> s2=new ArrayList<Integer>();
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s1.add(D);
            if(D>max1)
               max1=D;
         }
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s2.add(D);
            if(D>max2)
               max2=D;
         }
         
         int place=0;
         
         int temp1 = 0;
         int temp2 = 0;
         
            for(int x=0; x <= max1;x++){
               temp1 = s1.get(x);
               temp2 = s2.get(x);
               if(temp1 != temp2){
                  place = x;
      //             s1.remove(x);
      //             s2.remove(x);
                }
             }
      
         System.out.print("Case "+iter+": ");
         if(place!=n)
            System.out.println(place);
         else
            System.out.println("agree");
         iter++;
      }
   }
}


      
