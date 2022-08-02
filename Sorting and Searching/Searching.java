package Mine;
import java.util.*;
public class Searching {
			public static void  main(String Args[])
		      {
		        int[] Arr=new int[6];
		        boolean status=false;


		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the 6 values for sorting");
		        for(int i=0;i<6;i++)
		        {
		          Arr[i]=sc.nextInt();
		        }
		        System.out.println("Enter the values for searching");
		        int S=sc.nextInt();

		        for(int i=0;i<6;i++)
		        {
		            if( Arr[i]== S )
		            {
		                status=true;
		            }	
		        }

		          if(status==true)
		          {
		             System.out.println("number is found");
		          }
		          else
		          {
		              System.out.println("number is not found");
		          }
}
}


