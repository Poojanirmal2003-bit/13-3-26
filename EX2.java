import java.util.Scanner;
class EX2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size:");
		int row = sc.nextInt();
		System.out.print("Enter the column size:");
		int column = sc.nextInt();
		String ar [] [] =new String[row][column];
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print("Enter the ar"+i+j+":");
				ar[i] [j] = sc.nextLine();
			}
			
		}
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar [i] [j] +"  ");
				
			}
			System.out.println("  ");
			
		}
		
	}
}
