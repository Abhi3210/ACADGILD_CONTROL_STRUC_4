import java.util.*;
public class Assignment4 {
       public String grade(int n){
    	   String gr=null;
    	   if(n>70)
    		   gr="Grade A";
    	   else if(n>=61 && n<=70)
    		   gr="Grade B";
    	   else 
    		   gr="Grade C";
    	   return gr;
       }
       
       public static void main(String args[]){
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter marks for sub1");
    	   int sub1=sc.nextInt();
    	   System.out.println("Enter marks for sub2");
    	   int sub2=sc.nextInt();
    	   System.out.println("Enter marks for sub3");
    	   int sub3=sc.nextInt();
    	   int avg=(sub1+sub2+sub3)/3;
    	   Assignment4 as=new Assignment4();
    	   String result=as.grade(avg);
    	   System.out.println(result);
    	   
       }
}
