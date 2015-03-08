import java.io.*;
import java.util.*;

public class C{
   public static void main (String[] args) throws IOException
   {
      Scanner scn= new Scanner(new File ("C.in" ));
      //PrintStream output = new PrintStream(new File("cdc.out" )); 
     // Runtime run=new Runtime();
      //System.out.println(run.totalMemory());
      int iter=1;
      while(scn.hasNextInt()){
         int n=scn.nextInt();
         //output.println(n);
         if(iter>5)
            break;
         int max1=-1;
         int max2=-1;
         int min1=(int)Math.pow(2,32)-1;
         int min2=(int)Math.pow(2,32)-1;
         ArrayList<Integer> s1=new ArrayList<Integer>(n);
         ArrayList<Integer> s2=new ArrayList<Integer>(n);
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s1.add(D);
            if(D>max1)
               max1=D;
            if(D<min1)
               min1=D;
         }
         
         System.out.println("b");
        
         ArrayList<Integer> nu1=flip(s1, max1, min1);
         s1.clear(); s1.trimToSize();
         
         for(int i=0;i<n;i++){
            int D=scn.nextInt();
            s2.add(D);
            if(D>max2)
               max2=D;
            if(D<min2)
               min2=D;
         }
         
         System.out.println("mid");
         ArrayList<Integer> nu2=flip(s2, max2, min2);
         s2.clear(); s2.trimToSize();
         System.out.println("end");
      
         //output.println(s1.toString()+"\n"+s2.toString());
         int place=0;
         //System.out.println(s1.get(s1.size()-1));
         // System.out.println(s2.get(s2.size()-1));
         //System.out.println(s1.containsAll(s2));
                           // Collections.sort(s1);
               // Collections.reverse(s1);
               // Collections.sort(s2);
               // Collections.reverse(s2);
               // System.out.println(s1.toString()+"\n"+s2.toString());// 
         // while(!s1.isEmpty()){
            // place++; 
            // int r1=s1.indexOf(Collections.max(s1));
            // int r2=s2.indexOf(Collections.max(s2));
         //    //System.out.println(r1+" "+r2);
         //    //System.out.println(s1.get(r1)+" "+s2.get(r2));
            // if(r1!=r2)
               // break;
            // s1.remove(r1);
            // s2.remove(r2);
         // }
         //if(nu1.size()!=s1.size()){
        // System.out.println(nu1.size()+"    "+s1.size()+"     "+n);
        // }
         for(int i=(n-1);i>=0;i--){
            if(nu1.get(i)!= nu2.get(i)){
               place=n-i;
               break;
            }
         }
         System.out.print("Case "+iter+": ");
         if(place!=n)
            System.out.println(place);
         else
            System.out.println("agree");
         iter++;
         nu1.clear();nu2.clear();
      }
      scn.next();
   }
   public static ArrayList<Integer> flip( ArrayList<Integer> pass, int max, int min){
      ArrayList<Integer> nu= new ArrayList<Integer>();
      System.out.println(max);
      for(int i=0;i<=(max-min);i++){
         nu.add(-1);
         //System.out.println(i);
      }
      System.out.println("first done");
      for(int i=0;i<pass.size(); i++)
         nu.set(pass.get(i)-min, i);
      for(int i=0;i<nu.size();i++)
         if(nu.get(i)== -1){
            nu.remove(i);
            --i;
         }
      System.out.println("end");
      return nu; //CREATE MIN METHOD
   }
}


      
