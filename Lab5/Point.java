public class Point{

        protected int x;
        protected int y;

        public Point(int xin,int yin)
            {
                setX(xin);
                setY(yin);
            }

    public void setX (int xcoordonate)
        {
            x=xcoordonate;
        }
    public int getX()
        {
        return x; 
        }

    public void setY (int ycoordonate)
        {
            y=ycoordonate;
        }
    public int getY()
        {
        return y; 
        }

    public String toString()
        {
            return "X is :" + getX() + ";  Y is :" + getY() + "; \n" ;
        }
}
