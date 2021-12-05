public class TestPerson{

        public static void main(String[] args){
            Employee e = new Employee("Bob",20000);
            Student s = new Student("Alice","Programming");

            Person p;
            p = e;

            System.out.println("name:" + p.getName());

             p = s;

            System.out.println("name:" + p.getName());

            Person[] persons = new Person [2];
            
            persons[0]=e;
            persons[1]=s;

            for(int i= 0;i<2;i++)
            {
                System.out.println("name:" + persons[i].getName());
                System.out.println("description:" + persons[i].getDescription());
            }
            

    }
}