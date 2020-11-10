import java.util.*;
/*
class Example5
{  
public static void main(String args[])
{  
Scanner sc= new Scanner(System.in);
String name =sc.nextLine();
System.out.println(" Welcome "+name);  
}  
}  
*/
/*
class Example5
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
     
      double radius = sc.nextDouble();
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}*/

/*
 class Example5 {
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int totalSubjects, i;
	    float Marks, total = 0, Percentage, Average;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Total Number of Subjects : ");
		totalSubjects = sc.nextInt();
		
		System.out.print(" Please Enter the Subjects Marks : ");
		for(i = 0; i < totalSubjects; i++)
		{
			Marks = sc.nextInt();
			total = total + Marks;
		}
	
		Average = total / totalSubjects;
	    Percentage = (total / (totalSubjects * 100)) * 100;
	    
	    
	    System.out.println(" Marks Percentage =  " + Percentage);
	}
}

*/

/*
public class Example5 
{
    public static void main(String args[])
    {
        int m, year, month, day,week;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+year);
		month=m/12;
		m=m%12;
        System.out.println("No. of months:"+month);
		week = m / 7;
        m = m % 7;
        day = m;
        System.out.println("No. of days:"+day);
    }
}
*/
/*
public class Example5
{
    public static void main(String args[]) 
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest:");
        r = s.nextFloat();
        System.out.print("Enter the Time period:");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
}*/

/*
public class Example5 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
		fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius:"+celsius);        
    }
}*/

/*
public class Example5
{
public static void main(String args[]) 
{  
  System.out.println("Before swapping");  
  Scanner sc= new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  System.out.println("After swapping");  
  x = x + y;  
  y = x - y;  
  x = x - y;  
  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);  
 }  
}   */

/*
class Example5{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
        boolean leap = false;
		if(year % 4 == 0)
        {
        if( year % 100 == 0)
        {
        if ( year % 400 == 0)
			leap = true;
        else
            leap = false;
        }
        else
            leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
*/

/*
class Example5
{
	public static void main(String arg[])
	{
	
	Scanner sc = new Scanner(Sytsem.in);
	//float bs, gs, da, hra;
	float bs=sc.nextFloat();
	float hra=sc.nextFloat();
	float da=sc.nextFloat();
	if (bs<1500)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
	else
		{
			hra = 500;
			da = bs * 98 / 100;
		}
	float gs = bs + hra + da;
	System.out.println("HRA:" +hra);
	System.out.println(" DA :" +da);
	System.out.println("Gross Salary" +gs);
	}
}
*/
/*
class Example5
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greates");
		}
		else{
			System.out.println("c is greatest");
		}
	}
}
*/
/*
class Example5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		string gen=sc.next().charAt(0);
		int age=sc.nextInt();
		if(gen =='M')
		{
			if(age>=21)
			{
				System.out.println("He is eligible");
			}
			else
			{
				System.out.println("Not Eligilble");
			}
		else 
			if(age>=18)
				{
					System.out.println("She is Eligible");
				}
				else
				{
				 System.out.println("She is not Eligible");
				}
						
			
		}
	}
}
	*/				
/*		
public class Example5 {
   public static void main(String aegs[]) 
   {
      System.out.println("Hello World!!");   
   }
}		
			
*/
/*
class Example5{
	public static void main(String args[])
	{
		int roll_no;
		Scanner sc= new Scanner(System.in);
		roll_no=sc.nextInt();
		System.out.println("The Roll No :"+roll_no);
	}
}
*/


