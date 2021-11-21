public class Teacher extends Person 
{
    private int numCourses;
    private String[] courses = new String [10];
    boolean intwasdeleted=false;

    public Teacher(String name, String address)
    {
        super(name, address);
    }

    public boolean addCourse(String course)
    {
        if(numCourses == 10)
            {
                return false;
            }
        else
            {
                courses[numCourses]=course;
                numCourses++;
                return true;
            }
    }

    public boolean removeCourse(String course)
    {
        //daca locu sters nu ii ultimu atunci toate din dreapta se misca spre stanga cu una si counteru se ii --
        //for - if - if 
        for(int i=0;i<numCourses;i++)
            {
                if(courses[i].equals(course))
                    {
                        /*if(i==numCourses)
                            {
                                courses[i]="";
                                numCourses--;
                            }
                        else
                            {                        
                                for(int y=i;y<course.length()-1;i++)
                                    {
                                        courses[i]=courses[i+1];
                                    }

                                courses[i]="";
                                numCourses--;
                            }*/

                            int indexToDelete = i ;
                            for (int y = indexToDelete; y < courses.length-1; y++) 
                                {
                                    courses[i]="";
                                    numCourses--;
                                    intwasdeleted=true;
                                }
                    }  
                else if(intwasdeleted==true)
                {
                    courses[i-1] = courses[i];
                }
            }
        return intwasdeleted;
    }

    public String toString()
    {
        return "Teacher [numCourses=" + numCourses + "," + super.toString()+"]";
    }
}