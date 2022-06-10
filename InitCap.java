import java.util.*;
public class InitCap{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String x=sc.nextLine();
        char y[]=x.toCharArray();
        int size=y.length;
        if(y[0]>='a' && y[0]<='z')
        {
        y[0]=(char)(y[0]-32);
        }
      
      int i=1,flag=0;
     
      while(i!=size)
      {
          if( y[i]==' ' && y[i+1]>='a' && y[i+1]<='z')
          {
              y[i+1]=(char)(y[i+1]-32);
              flag=flag+1;
          }
          ++i;
      }
      if(flag==0){
          System.out.println("First character of each word is already in uppercase");
      }
      else{

      System.out.println(y);
      }

        
        
    }
}