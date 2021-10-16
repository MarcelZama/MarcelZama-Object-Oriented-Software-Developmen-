class Rectangle
{
	private int length;
	private int width;
	
    public Rectangle() 
	{
		length = 1;
		width = 1;
	}
	
	public void setLength (int newRectanglelength)
	
	{
        if( length > 0 && length <= 40 )
            {
                length = newRectanglelength;
            }
	}
	
	public void setWidth (int newRectanglewidth)
	
	{
        if( width > 0 && width <= 40 )
            {
		        width = newRectanglewidth;
            }
	}	

	public int getLength ()
	
	{
		return length;
	}
	
	public int getWidth ()
	
	{
		return width;
	}
	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "\nLength = " + length + ", Width = " + width;
		myString += "\n";

			
		return myString;
	
	}


}