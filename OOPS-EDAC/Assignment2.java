import java.util.Scanner;


/*
public class Example41
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        for(int i=1; i <= 20; i++)
        {
            System.out.println(n*i);
        }
    }
}
*/
/*
public class Example41 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();		
		int reversed = 0;

        for(;num != 0; num /= 10) 
		{
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
*/

/*
public class Example41 {

  public static void main(String[] args) 
  {
	  Scanner sc= new Scanner(System.in);

    int num = sc.nextInt();
    boolean s = false;
    for (int i = 2; i <= num / 2; ++i) 
	{
      
      if (num % i == 0) 
	  {
        s = true;
        break;
      }
    }

    if (!s)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
*/

/*
public class Example41 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();

        while (a < b) {
            boolean n = false;

            for(int i = 2; i <= a/2; ++i) 
			{
                
                if(a % i == 0)
					{
                    n = true;
                    break;
                }
            }

            if (!n && a != 0 && a != 1)
                System.out.print(a + " ");

            ++a;
        }
    }
}*/

/*
public class Example41
{
    public static void main(String[] args) 
    {
        int  sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
       
        int a[] = new int[10];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / 10;
        System.out.println("Average:"+average);
    }
}
*/
/*
public class Example41
 {    
    public static void main(String[] args) 
	{        
        Scanner sc = new Scanner (System.in);
		    int [] arr = new int [10] ;
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in descending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
             
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}   */

/*
public class Example41
 { 

	static void reverse(int a[], int n) 
	{ 
		int[] b = new int[n]; 
		int j = n; 
		for (int i = 0; i < n; i++) { 
			b[j - 1] = a[i]; 
			j = j - 1; 
		} 

		System.out.println("Reversed array is: \n"); 
		for (int k = 0; k < n; k++) { 
			System.out.println(b[k]); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50,60,70,80}; 
		reverse(arr, arr.length); 
	} 
} */

/*

public class Example41
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
*/

public class Example41
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
		 }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}
 