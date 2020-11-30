
-----------------------------------------------------------

class FactorialExample1{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

----------------------------------------------------------------------

class FactorialExample
{  
 public static void main(String args[])
 {  
  int i,fact=1;  
  int number=5;  
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

------------------------------------------------------


class FibonacciExample2
{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int count)
 {    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    
 public static void main(String args[])
 {    
  int count=10;    
  System.out.print(n1+" "+n2);   
  printFibonacci(count-2);   
 }  
}  


---------------------------------------------------


import java.util.Scanner;
public class Sum_Numbers 
{
    int sum = 0, j = 0;
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of elements you want:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements you want:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Sum_Numbers obj = new Sum_Numbers();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }   
        else
        {
            return 0;
        }
    }
}

------------------------------------



class GFG 
{ 
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
	{ 
		if (n == 1) 
		{ 
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod); 
			return; 
		} 
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); 
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
	} 
	
	public static void main(String args[]) 
	{ 
		int n = 4; // Number of disks 
		towerOfHanoi(n, \'A\', \'C\', \'B\'); // A, B and C are names of rods 
	} 
} 
