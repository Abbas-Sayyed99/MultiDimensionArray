import java.util.*;
class MultiSub3X3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int row,col;

		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		int [][] c = new int[3][3];

		System.out.println("Enter First Matrix Elements : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				a[row][col] = sc.nextInt();
		}
	
		System.out.println("Enter Second Matrix Elements : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				b[row][col] = sc.nextInt();
		}


		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				c[row][col] = a[row][col]-b[row][col];
		}

		System.out.println("\nElements of Matrix First are : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(a[row][col]+" ");
			
			System.out.println();
		}

		System.out.println("\nElements of Matrix Second are : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(b[row][col]+" ");
			
			System.out.println();
		}

		System.out.println("\nSubtraction of both the matrix is : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(c[row][col]+" ");
			
			System.out.println();
		}


 	}
}