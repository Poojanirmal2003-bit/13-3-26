class EX1
{
	public static void main(String[] args)
	{
		int ar[] []=new int [3] [3];
		ar [0] [0] = 85;
		ar [0] [1] = 78;
		ar [0] [2] = 90;
		ar [1] [0] = 88;
		ar [1] [1] = 92;
		ar [1] [2] = 80;
		ar [2] [0] = 70;
		ar [2] [1] = 75;
		ar [2] [2] = 68;
		
		for (int i=0; i<ar.length;i++)
		{
			for (int j=0; j<ar[i].length;j++)
			{
				System.out.print(ar [i] [j] +" ");
			}
			System.out.println(" ");
			
		}
		
		
		
		
		
		
	}
}