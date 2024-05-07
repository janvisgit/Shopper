package Exception;

public class Mobileno 

	{
		static void num()throws Mobileno_Exception 
		{
			int no=11;
				if(no==10)
				{
					System.out.println("Valid number");
				}
				else
				{
					throw new Mobileno_Exception("Invalid number");
				}
			}

		public static void main(String[] args) 
		{
			try
			{
				num();
			}
			catch(Mobileno_Exception e)
			{
				System.out.println(e.getmsg());
			}
		}
	}



