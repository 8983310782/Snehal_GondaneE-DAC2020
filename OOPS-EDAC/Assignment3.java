import java.util.Scanner;

//1. Write a program to merge two arrays of integers by reading one number at a time from
//   each array until one of the array is exhausted, and then concatenating the remaining numbers.
//   Input: [23,60,94,3,102] and [42,16,74]
//   Output: [23,42,60,16,94,74,3,102]
/*
class Assignment3
{
    public static void main(String [] args)
    {
        int i;
        int arr[]=new int[]{23,60,94,3,102};
        int arr1[]=new int[]{42,16,74};
                
        for(i=0;i<5;i++)
        {
            if(i<3)
            System.out.print(arr[i]+", "+arr1[i]+", ");
            else
                System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
*/




/*
class Assignment3
{
    public static void main(String [] args)
    {
        int i,j,sum=0,avg=0;
        int arr[]=new int[]{5,14,35,89,140};
                
        for(i=0;i<5;i++)
        {
            if(i<3)
            {
                sum=arr[i]+arr[i+1]+arr[i+2];
                avg=sum/3;
                System.out.print(avg+", ");
            }
        }
        System.out.println();
    }
}
*/




/*

class Assignment3
{
    public static void main(String [] args)
    {
        int i,j,sum=0,avg=0;
                
        for(i=1;i<=6;i++)
        {
            if(i%2==0)
                System.out.print(i*i+", ");
            else
                System.out.print(i*i*i+", ");
        }
        System.out.println();
    }
}

*/



/*
class Assignment3
{
    public static void main(String [] args)
    {
        int i,j,Asc=0,Desc=0;
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[5];
        
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
                
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(arr[i]<arr[j])
                    Asc++;
                else if(arr[i]>arr[j])
                    Desc++;
            }
        }
        
        if(Asc==10)
            System.out.println("Ascending");
        else if(Desc==10)
            System.out.println("Descending");
        else
            System.out.println("Random");
    }
}
*/




/*
import java.util.Scanner;
class Assignment3
{
    public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any floting number");
		float x =sc.nextFloat(); 
		sc.close();
        int count=0;
        do
    	{
    	    x =x*10;
    		count++ ;
    	} 
        while(x != (int)x);
	System.out.println("Digits after decimal are: "+count);
	} 
}
*/




/*
class Assignment3
{
    public static void main(String [] args)
    {
        int i,y=0,x=0,z=0;
        int arr[]=new int[]{24,54,31,16,82,45,67};
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>y)
                y=arr[i];
        }
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>x && arr[i]<y)
                x=arr[i];
        }
        
        for(i=0;i<7;i++)
        {
            if(arr[i]>z && arr[i]<x)
                z=arr[i];
        }
        System.out.println(z);
    }
}
*/