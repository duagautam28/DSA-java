import java.util.*;
public class moment {
    public static void main(String args[]){
        
      int p[][]={{1,3},{2,4},{2,3},{4,5}};
      int sum=0;
      for(int i=0;i<p.length;i++){
        //for(int j=0;j<p.length;j++){
            //System.out.print(p[i][j]);
            sum+=(p[i][0]*p[i][1]);
        }
       // System.out.print("\n");
      
      System.out.print(sum);
    }
    }
