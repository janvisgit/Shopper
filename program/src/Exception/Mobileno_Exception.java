package Exception;
	
	public class Mobileno_Exception extends Exception
	{
		String msg;
		Mobileno_Exception(String msg)
		{
			this.msg=msg;
		}
		public String getmsg()
		{
			return msg;
		}

	}

