import java.io.*;
import java.util.*;

public class C{
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
         ArrayList<Integer> s1=new ArrayList<Integer>();
         ArrayList<Integer> s2=new ArrayList<Integer>();
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s1.add(D);
         }
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s2.add(D);
         }
         //output.println(s1.toString()+"\n"+s2.toString());
         int place=0;
         //System.out.println(s1.get(s1.size()-1));
         // System.out.println(s2.get(s2.size()-1));
         //System.out.println(s1.containsAll(s2));
                           // Collections.sort(s1);
               // Collections.reverse(s1);
               // Collections.sort(s2);
               // Collections.reverse(s2);
               // System.out.println(s1.toString()+"\n"+s2.toString());
         while(!s1.isEmpty()){
            place++; 
            int r1=s1.indexOf(Collections.max(s1));
            int r2=s2.indexOf(Collections.max(s2));
            //System.out.println(r1+" "+r2);
            //System.out.println(s1.get(r1)+" "+s2.get(r2));
            if(r1!=r2)
               break;
            s1.remove(r1);
            s2.remove(r2);
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
      
