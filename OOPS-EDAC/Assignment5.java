import java.util.Arrays;
import java.util.*;


//1.Write a program which takes a string and prints the number of vowels,
//   consonants (non-vowels) numbers and other characters.
//   Input: "Hello world 37 1!"
//   Output: Vowels: 3
//   Consonants: 7
//   Numbers: 2
//   Others: 6

class Assignment5
{
	public static void main(String args[])
	{
                                Scanner sc=new Scanner(System.in);
		int vctr=0,cctr=0,nctr=0,sctr=0;
		String strN=sc.nextLine();
		String str=strN.toLowerCase();
		System.out.println(str);
                                      char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vctr++;
			}
			else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
			{
				nctr++;
			}
			else if(ch=='@'||ch=='!'||ch=='#'||ch=='$')
			{
				sctr++;
			}
                                                          else
			{	
				if(ch!=' ')
                                                                                    cctr++;
			}
		}
		System.out.println("Vowels : "+vctr);
		System.out.println("Consonants : "+cctr);
		System.out.println("Numbers : "+nctr);
		System.out.println("Others : "+sctr);
	}
}
*/




/*
class Assignment5
{

	public static void main(String[] args) {
	

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :  ");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		 String s2=""; String s3=""; 
		 String s4=""; String s5=""; 
		 String s6=""; String s7=""; 
		 String s8=""; String s9=""; 
		 String s10=""; String s11=""; 
		 
		 if(s1.contains("nine")) 
		 { 
			 s2=s1.replace("nine", "ten");
			 
		 }else s2=s1;
		 if(s2.contains("eight")) 
		 { 
			 s3=s2.replace( "eight","nine");
		 
		 } else s3=s2;
		 if(s3.contains("seven")) 
		 { 
			 s4=s3.replace( "seven","eight");
		 
		 }else s4=s3;
		 if(s4.contains("six")) 
		 { 
			 s5=s4.replace( "six","seven");
		 
		 }else s5=s4;
		 if(s5.contains("five")) 
		 { 
			 s6=s5.replace( "five","six");
		 
		 }else s6=s5;
		 if(s6.contains("four")) 
		 { 
			 s7=s6.replace( "four","five");
		 
		 }else s7=s6;
		 if(s7.contains("three")) 
		 { 
			 s8=s7.replace( "three","four");
		 
		 }else s8=s7;
		 if(s8.contains("two")) 
		 { 
			 s9=s8.replace( "two","three");
		 
		 }else s9=s8;
		 if(s9.contains("one")) 
		 { 
			 s10=s9.replace( "one","two");
		 
		 }else s10=s9;
		 if(s10.contains("zero")) 
		 { 
			 s11=s10.replace( "zero","one");
		 
		 }else s11=s10;

		 System.out.println(s11);	 
	}
}
*/




/*
class Assignment5
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            int x=arr.length, count;
            
            for(int i=0;i<x-1;i++)
            {
                count=0;
                for(int j=0;j<x;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        if(count>1)
                        {
                            arr[j]=' ';
                            break;
                        }
                    }
                }
            }
            for(int i=0;i<x;i++)
            {
                if(arr[i]!=' ')
                    System.out.print(arr[i]);
            }
            System.out.println();
        }
}*/



/*
class Assignment5
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            int x=arr.length,count=0;
            char y=' ';
            
            for(int i=1;i<x-1;i++)
            {
                if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                {
                   y=arr[i];
                   count++;
                   break;
                }
            }
                if(count==1)
                   System.out.println(y);
                else
                   System.out.println("Not found");
        }
}
*/



/*
class Assignment5
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            
            int x=arr.length,y=0;
            
            for(int i=0;i<x;i++)
            {
                if(arr[i]==' ')
                {
                    System.out.print((i-y)+" ");
                    y=i+1;
                }
            }
            System.out.println();
        }
}
*/




/*

class Assignment5
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            
            int count=0;
            int y=s.indexOf(arr[0],1);
            
            if(3*y==arr.length)
            {
                for(int i=0;i<2*y;i++)
                {
                    if(arr[i]==arr[i+y])
                        count++;
                }
            }
            if(count==(2*y))
                System.out.println("true");
            else
                System.out.println("false");
        }
}*/




/*
class Assignment5
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            
            int x[]=new int[s.length()];
            
            for(int i=0;i<s.length();i++)
            {
                x[i]=(int)s.charAt(i);
                
                if(x[i]>=65 && x[i]<=90)
                    System.out.print((char)(32+arr[i]));
                
                else if(x[i]>=97 && x[i]<=122)
                    System.out.print((char)(arr[i]-32));
                
                else
                    System.out.print(arr[i]);
            }
            System.out.println();
        }
}
*/



/*
class Assignment5
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            String s=sc.nextLine();
            
            String sl=s.toLowerCase();
            char arr[]=sl.toCharArray();
            
            char arr1[]=new char[s.length()];
            
            int ub=s.length();
            
            for(int i=0,j=(ub-1) ; i<ub/2 ; i++,j--)
            {
                    arr1[j]=arr[i];
                    arr1[i]=arr[j];
            }
            
            if(ub%2!=0)
                arr1[ub/2]=arr[ub/2];
           

            
            sl=String.valueOf(arr1);
            System.out.println(sl);
        }
}
.*/



/*

class Assignment5
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String 1: ");
            String s1=sc.nextLine();
            System.out.print("Enter String 2: ");
            String s2=sc.nextLine();
            
            char arr1[]=s1.toCharArray();
            char arr2[]=s2.toCharArray();
            int i, j;
            char x;
            
            for(i=0 ; i<s1.length(); i++)
            {
                x=' ';
                for(j=0 ; j<s2.length() ; j++)
                {
                    if(arr1[i]==arr2[j] && arr1[i]!=' ' && arr2[j]!=x)
                    {
                        System.out.print(arr1[i]+", ");
                        x=arr2[j];
                        arr2[j]=' ';
                    }
                }
            }
            System.out.println();
        }
}
*/
Displaying Assignment 5.txt.