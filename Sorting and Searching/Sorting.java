package Mine;
import java.util.*;
public class Sorting {
	public static void  main(String Arg[])
		{
			int[] Arr=new int[4];
			int temp;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 4 values for sorting");
			for(int i=0;i<4;i++)
			{
			Arr[i]=sc.nextInt();
			}
			System.out.println("Desending Order");
			for(int i=0;i<4;i++)
			{
				for(int j=i+1;j<4;j++)
				{
					if(Arr[i]<Arr[j])
					{
						temp=Arr[i];
						Arr[i]=Arr[j];
						Arr[j]=temp;
					}
				}
			}
			int[] Arr1=new int[4];
			for(int i=0;i<4;i++)
			{
			Arr1[i]=Arr[i];
			}
			
			for(int i=0;i<4;i++)
			{
				for(int j=i+1;j<4;j++)
				{
	          if(Arr1[i]>Arr1[j])
	          {
	            temp=Arr1[i];
	            Arr1[i]=Arr1[j];
	            Arr1[j]=temp;
	          }
				}
			}
			
			
	      for(int i=0;i<4;i++)
	      {
	          System.out.println(" "+Arr[i]);
	      }
	      System.out.println("");
	      System.out.println("Asending Order");
	      for(int i=0;i<4;i++)
	      {
	          System.out.println(" "+Arr1[i]);
	      }
		}
	}

