class ValidEnroll
{
	public static void main(String args[])
	{
    		int c;
				String enrollment=args[0];
    		String year=enrollment.substring(0,2);
    		if(year.equals("17") || year.equals("18"))
      			c=1;
				else
				{
						c=0;
				}
    		String collegeCode=enrollment.substring(2,5);
				if(collegeCode.equals("047"))
      			c=1;
				else
				{
						c=0;
				}
    		String courseCode=enrollment.substring(5,7);
				if(courseCode.equals("01") || courseCode.equals("31"))
      			c=1;
				else
				{
						c=0;
				}
    		String branchCode=enrollment.substring(7,9);
				if(branchCode.equals("07"))
		      	c=1;
				else
				{
						c=0;
				}
				if(c==1)
						System.out.println("Valid Enrollment");
				else if(c==0)
						System.out.println("Invalid Number");
				System.exit(0);
  }
}
