class Rectangle
{
	private int length;
	private int width;
	private int perimeter;
	private int area;

	
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

	public int getArea ()
	{
		area=length*width;
		return area;
	}

	public int getPerimeter()
	{
		perimeter=(2*length)+(2*width);
		return perimeter;
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
		myString += "\n Length = " + length + ", Width = " + width;
		myString += "\nThe area of The rectangle is : " + area ;
		myString += "\nThe Perimeter of the rectangle is : " + perimeter;
		myString += "\n";

		for(int i=0;i<width;i++)
		{myString+="*";}
		myString+="\n";
		for(int i=0;i<length-2;i++)
		{
			myString+="*";
			for(int y=0;y<width-2;y++)
			{
				myString+=" ";
			}
			myString+="*";
			myString += "\n";
		}

		for(int i=0;i<width;i++)
		{myString+="*";}
			
		return myString;
	
	}


}