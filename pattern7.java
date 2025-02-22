/*
		 		5 5 5 5 5 5 5 5 5 
				  4 4 4 4 4 4 4 
				    3 3 3 3 3 
				      2 2 2 
				        1 

		 */
		for(int i=5;i>=1;i--)
		{
			for(int s=1;s<=5-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
}
