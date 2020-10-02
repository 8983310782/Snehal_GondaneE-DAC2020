public class Rpyramid {

	public static void main(String[] args)
	{
		  for(int i=1;i<=6;i++)
			{
				for(int j=1;j<=i;j++)					//space
				{
					System.out.print(" ");
				}
				for(int k=6;k>i;k--)					//star
				{
					System.out.print("*");
				}
				for(int l=4;l>=i;l--)					
				{
					System.out.print("*");
				}
				System.out.println();
}
}
}