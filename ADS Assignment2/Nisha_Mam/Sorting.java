
import java.util.Scanner;

class Main {
  Scanner input = new Scanner(System.in);

  void bubbleSort(int array[]) {
    int size = array.length;

    System.out.println("Choose Sorting Order:");
    System.out.println("1 for Ascending \n2 for Descending");
    int sortOrder = input.nextInt();

    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)

        if (sortOrder == 1) {
          // compares the adjacent element
          if (array[j] > array[j + 1]) {

            // swap if left element is greater than right
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
        }

        else {
          // compares the adjacent element
          if (array[j] < array[j + 1]) {

            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
          }
        }

  }

  // driver code
  public static void main(String args[])
  {

    int[] data = { -2, 45, 0, 11, -9 };

    Main bs = new Main();

    bs.bubbleSort(data);
    System.out.println("Sorted Array in Ascending Order:");

    System.out.println(Arrays.toString(data));
  }
}


Choose Sorting Order:
1 for Ascending 
2 for Descending
1
Sorted Array:
[-9, -2, 0, 11, 45]


------------------------------------------------------------------------------


class SelectionSort
{
void sort(int array[])
{
int n = array.length;
for (int i = 0; i < n-1; i++)
{
int min_element = i;
for (int j = i+1; j < n; j++)
if (array[j] < array[min_element])
min_element = j;
int temp = array[min_element];
array[min_element] = array[i];
array[i] = temp;
}
}
void printarrayay(int array[])
{
int n = array.length;
for (int i=0; i<n; ++i)
System.out.print(array[i]+" ");
System.out.println();
}
public static void main(String args[])
{
SelectionSort ob = new SelectionSort();
int array[] = {15, 10, 99, 53, 36};
ob.sort(array);
System.out.println("Sorted arrayay");
ob.printarrayay(array);
}
}
-----------------------------------------------------------------

public class InsertionSortExample {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    



Output:


Before Insertion Sort
9 14 3 2 43 11 58 22 
After Insertion Sort
2 3 9 11 14 22 43 58 


-----------------------------------------------------------------------------------



public class QuickSort {  
public static void main(String[] args) {  
        int i;  
        int[] arr={90,23,101,45,65,23,67,89,34,23};  
        quickSort(arr, 0, 9);  
        System.out.println("\n The sorted array is: \n");  
        for(i=0;i<10;i++)  
        System.out.println(arr[i]);  
    }  
    public static int partition(int a[], int beg, int end)  
    {  
          
        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            elseif(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                elseif(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        returnloc;  
    }  
    static void quickSort(int a[], int beg, int end)  
    {  
          
        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
    }  
}  
Output:

The sorted array is: 
23
23
23
34
45
65
67
89
90
101


-------------------------------------------------------------------------------------------


public class MyMergeSort  
{  
void merge(int arr[], int beg, int mid, int end)  
{  
  
int l = mid - beg + 1;  
int r = end - mid;  
  
intLeftArray[] = new int [l];  
intRightArray[] = new int [r];  
  
for (int i=0; i<l; ++i)  
LeftArray[i] = arr[beg + i];  
  
for (int j=0; j<r; ++j)  
RightArray[j] = arr[mid + 1+ j];  
  
  
int i = 0, j = 0;  
int k = beg;  
while (i<l&&j<r)  
{  
if (LeftArray[i] <= RightArray[j])  
{  
arr[k] = LeftArray[i];  
i++;  
}  
else  
{  
arr[k] = RightArray[j];  
j++;  
}  
k++;  
}  
while (i<l)  
{  
arr[k] = LeftArray[i];  
i++;  
k++;  
}  
  
while (j<r)  
{  
arr[k] = RightArray[j];  
j++;  
k++;  
}  
}  
  
void sort(int arr[], int beg, int end)  
{  
if (beg<end)  
{  
int mid = (beg+end)/2;  
sort(arr, beg, mid);  
sort(arr , mid+1, end);  
merge(arr, beg, mid, end);  
}  
}  
public static void main(String args[])  
{  
intarr[] = {90,23,101,45,65,23,67,89,34,23};  
MyMergeSort ob = new MyMergeSort();  
ob.sort(arr, 0, arr.length-1);  
  
System.out.println("\nSorted array");  
for(int i =0; i<arr.length;i++)  
{  
    System.out.println(arr[i]+"");  
}  
}  
}  
Output:

Sorted array 
23
23
23
34
45
65
67
89
90
101
-----------------------------------------------------------------------------------------