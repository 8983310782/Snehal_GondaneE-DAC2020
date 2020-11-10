  
import java.util.*;
import java.lang.Math;


/*
class Student
{
    int rollno;
    String name;
    
    void setData(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    
    void showData()
    {
        System.out.println("ID: "+rollno);
        System.out.println("Name: "+name);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Student obj=new Student();
        obj.setData(12345,"Sumit");
        obj.showData();
    }
}
*/



/*
class Circle
{
    int radius;
    float area;
    
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius=sc.nextInt();
    }
    
    void calculateArea()
    {
        area=(float)(22/7.0f)*(radius*radius);
    }
    
    void display()
    {
        System.out.println("Area: "+area);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Circle obj=new Circle();
        obj.init();
        obj.calculateArea();
        obj.display();
    }
}
*/




/*
class MathOperation
{
    static int add(int a, int b)
    {
        return a+b;
    }
    
    static int subtract(int a, int b)
    {
        if(b>a)
            return b-a;
        else
        return a-b;
    }
    
    static int multiply(int a, int b)
    {
        return a*b;
    }
    
    static double power(int a, int b)
    {
        return Math.pow(a,b);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a: ");
        int a=sc.nextInt();
        System.out.println("b: ");
        int b=sc.nextInt();
        
        System.out.println(MathOperation.add(a,b));
        System.out.println(MathOperation.subtract(a,b));
        System.out.println(MathOperation.multiply(a,b));
        System.out.println(MathOperation.power(a,b));
    }
}*/








/*
class Employee
{
    static int empNo=0;
    int salery;
    static int totalSalery=0;
    
    Employee(int sal)
    {
        salery=sal;
        empNo++;
        totalSalery=totalSalery+salery;
    }
    
    static void display()
    {
        System.out.println("\nTotal Employees: "+empNo+"\nTotal Salery of all Employees: "+totalSalery);
    }
    
}

class Assignment6
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter total Entries: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Salery of Employee "+(i+1)+": ");
            int s=sc.nextInt();
            Employee emp=new Employee(s);
        }
        
        Employee.display();
    }
}
*/



/*
class Product{
	
	int pid;
	double price;
	int quantity;
	
	public Product(int pid, double price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static void productWithHighestPrice(Product[] p) {
		double max=p[0].price;
		for (int i = 0; i < p.length; i++) {
			if(p[i].price>max)max=p[i].price;
		}
		System.out.println();
		System.out.println("Maximum price is := "+max);
		
		System.out.println();
		for (int i = 0; i < p.length; i++) {
			if(p[i].price==max) {
				System.out.println("The Pid of Highest price is := "+p[i].pid);
			}
		}
		
	}
	
	
	static double[] moneySpentOn(Product[] arr) {
		
		double[] sum =new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			sum[i]=(arr[i].price * arr[i].quantity);
		}
		return sum;
		
	}

	
}
public class ProductOfStore {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Product[] arr=new Product[5];
		
		for (int i = 0; i < arr.length; i++) {
		
			System.out.print("Enter Product Id := ");
			int pid=sc.nextInt();
			System.out.print("Enter the Price := ");
			double price=sc.nextDouble();
			System.out.print("Enter the Quantities :=");
			int quantity=sc.nextInt();
			
			arr[i]=new Product(pid,price,quantity);
		}
		
		Product.productWithHighestPrice(arr);
		double[] spent=Product.moneySpentOn(arr);
	System.out.println();
		for (int i = 0; i < spent.length; i++) {
			System.out.println(arr[i]+"  spent on each item := "+spent[i]);
		}
	}
}

*/



/*
class OneBHK{
	int roomArea;
	int hallArea;
	int price;
	
	public OneBHK() {
		this.roomArea=10;
		this.hallArea=10;
		this.price=1000;
	}
	
	public OneBHK(int roomArea, int hallArea, int price) {
	
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	void show() {
		System.out.println("Room Area := "+this.roomArea+"  Hall Area := "+this.hallArea+"  Price := "+this.price);
	}
	
}

class TwoBHK extends OneBHK{
	
	int room2Area;
	public TwoBHK(){
		super();
		this.room2Area=10;
	}
	public TwoBHK(int roomArea, int room2Area,int hallArea,int price) {
		super(roomArea,hallArea,price);
		this.room2Area = room2Area;
	}
	
	void show() {
		System.out.println("Room  1 Area := "+this.roomArea+"  Room 2 Area := "+this.room2Area+"  Hall Area := "+this.hallArea+"  Price := "+this.price);
	}
	
	 static void totalAmountOfFlates(TwoBHK ob1,TwoBHK ob2,TwoBHK ob3) {
		int total=ob1.price+ob2.price+ob3.price	;
		System.out.println("Total Price is := "+total);
				}
}

public class Construction{

	public static void main(String[] args) {
		
		TwoBHK ob1=new TwoBHK(100,100,100,1000);
		TwoBHK ob2=new TwoBHK(200,200,200,2000);
		TwoBHK ob3=new TwoBHK(300,300,300,3000);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
		TwoBHK.totalAmountOfFlates(ob1, ob2, ob3);
	}
}

*/



/*
class Faculty{
	int facultyId;
	double salary;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	
	void printSalary() {
		System.out.println("Salary is  := "+this.salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSalary;
	int allowance;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	void input(int facultyId,int basicSalary,int allowance)
    {
        super.input(facultyId);
        this.basicSalary=basicSalary;
        this.allowance=allowance;
        super.salary=basicSalary + allowance;
    }
}

class PartTimeFaculty extends Faculty{
	int workingHours;
	int ratePerHour;
	void input(int facultyId) {
		this.facultyId=facultyId;
	}
	void input(int id,int workingHours,int ratePerHour)
    {
        super.input(facultyId);
        this.workingHours=workingHours;
        this.ratePerHour=ratePerHour;
        super.salary=this.workingHours * this.ratePerHour;
    }
	
}


public class CollegeFaculty {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("For Full Time Faculty");
		System.out.print("Enter Faculty id := ");
		int facultyId=sc.nextInt();
		System.out.print("Enter Faculty basic Salary := ");
		int basicSalary=sc.nextInt();
		System.out.print("Enter Faculty Allowance := ");
		int allowance=sc.nextInt();
		
		FullTimeFaculty ob=new FullTimeFaculty();
		ob.input(facultyId, basicSalary, allowance);
		
		
		System.out.println("For Part Time Faculty");
		System.out.print("Enter Faculty id := ");
		int facultyId1=sc.nextInt();
		System.out.print("Enter Faculty Working Hours := ");
		int workingHours=sc.nextInt();
		System.out.print("Enter Faculty ratePerHour := ");
		int ratePerHour=sc.nextInt();
		
		PartTimeFaculty ob2=new PartTimeFaculty();
		ob2.input(facultyId1, workingHours, ratePerHour);
		
		ob.printSalary();
		ob2.printSalary();
	}
}
*/





/*
abstract class Processor{
	double data;
	void showData() {
		System.out.println("Data := "+this.data);
	}
	abstract void process(int n); 
}
class  Factorial extends Processor{
	void process(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		data=fact;
	}
}


class Circle extends Processor{
	void process(int n) {
	final float PI=3.14f;	
	double area=PI*n*n;
	data=area;
	}
} 
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Factroial of number \n 2.Area of Circle ");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:Factorial ob=new Factorial();
					System.out.println("Enter the number whose Factorial is to be find := ");
						int n=sc.nextInt();
						ob.process(n);
						ob.showData();
						break;
			case 2:	Circle ob1=new Circle();
					System.out.println("Enter the Circle whose Area is to be find := ");
							int r=sc.nextInt();
								ob1.process(r);
								ob1.showData();
								break;
			default:System.out.println("Wrong Choice");					
		}
	}
}
*/