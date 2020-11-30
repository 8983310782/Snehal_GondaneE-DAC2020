import java.util.Scanner;

public class ArraysClass_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key, index;
        int[] a = {59, 4, 30, 12, 91};
        int[] b = new int[a.length];
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            b[i] = a[i - 1] + a[i];
        }
        System.out.println("Array a is: " + Arrays.toString(a));
        System.out.println("Array b is: " + Arrays.toString(b));
        System.out.println("\nCalling binarySearch for array b. ");
        System.out.print("Enter search key: ");
        key = input.nextInt();
        index = Arrays.binarySearch(b, key);
        if(index < 0)
            System.out.println("Key NOT found!");
        else
            System.out.println("Key found in the element with index " + index);
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("The sorted array a is: " + Arrays.toString(a));
        System.out.println("The sorted array b is: " + Arrays.toString(b));
        Arrays.fill(b, 59);
        System.out.println("Array b (after .fill) is: " + Arrays.toString(b));
    }
}
OUTPUT:
Array a is: [59, 4, 30, 12, 91]
Array b is: [59, 63, 34, 42, 103]

Calling binarySearch for array b.
Enter search key: 34
Key found in the element with index 2
The sorted array a is: [4, 12, 30, 59, 91]
The sorted array b is: [34, 42, 59, 63, 103]
Array b (after .fill) is: [59, 59, 59, 59, 59]


----------------------------------------------------------------------------------------------------------------








public class MatrixMultiplication
{  
public static void main(String args[])
{  

int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
int c[][]=new int[3][3];  //3 rows and 3 columns  
      
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}
System.out.print(c[i][j]+" ");  
}//end of j loop  
System.out.println(); 
}    
}
}  



Output:

6 6 6 
12 12 12 
18 18 18 

--------------------------------------------------------------



public class MatrixAddition
{  
public static void main(String args[])
{  

int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
      
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
c[i][j]=a[i][j]+b[i][j];     
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  





Output:


2 6 8
4 8 6
4 6 9
----------------------------------------------------------------



import java.util.Scanner;
public class Sparse
{
    public static void main(String args[])
    {
 	int i, j, zero = 0, count = 0; 
 	int array[][] = new int[10][10];
 	System.out.println("Enter total rows and columns: ");
 	Scanner s = new Scanner(System.in);
 	int row = s.nextInt();
 	int column = s.nextInt();
 	System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++) 
    	    {
                 array[i][j] = s.nextInt();
                 System.out.print(" ");
    	     }
        }
        for(i = 0; i < row; i++)
        {
 	    for(j = 0; j < column; j++) 
  	    {
                if(array[i][j] == 0)
    		{
        	    zero++; 
    		}
    	   	else
            	{
      	            count++;
    	    	}
   	   }
       }
       if(zero>count)
       {
           System.out.println("the matrix is sparse matrix");
       }
       else
       {
           System.out.println("the matrix is not a sparse matrix");
       }
    }
}




Output:

 
Enter total rows and columns: 
3
3
Enter matrix:
1
0
5
0
0
8
0
0
0
the matrix is sparse matrix