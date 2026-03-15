class EX3
{
	public static void main(String[] args)
	{
		char ar[] []=new char [4] [5];
		ar [0] [0] = 'V';
		ar [0] [1] = 'I';
		ar [0] [2] = 'J';
		ar [0] [3] = 'A';
		ar [0] [4] = 'Y';
		ar [1] [0] = 'A';
		ar [1] [1] = 'J';
		ar [1] [2] = 'I';
		ar [1] [3] = 'T';
		ar [1] [4] = 'H';	
		ar [2] [0] = 'K';
		ar [2] [1] = 'A';
		ar [2] [2] = 'M';
		ar [2] [3] = 'A';
		ar [2] [4] = 'L';
		ar [3] [0] = 'S';
		ar [3] [1] = 'I';
		ar [3] [2] = 'M';
		ar [3] [3] = 'B';
		ar [3] [4] = 'U';
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