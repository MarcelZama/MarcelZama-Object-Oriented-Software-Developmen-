import java.util.Scanner;

public class MyHR {

    public static void main(String[] args){

        Employee[] employees = new Employee[5];
	    Office[] offices = new Office[3];

        Scanner scan = new Scanner(System.in);


        while(true){

            System.out.println("      Menu:    ");
            System.out.println("--> 1. List all offices.   ");
            System.out.println("--> 2. Create a new employee record.    ");
            System.out.println("--> 3. List all employees.     ");
            System.out.println("                             To exit Type:0");
            System.out.print("        Please enter your choise :   ");
            int menuchoise = scan.nextInt();


            switch(menuchoise){
                case 0: 
                        System.out.println();
                        System.out.println();
                        System.out.println("Exiting the application");
                        scan.close();
                        System.exit(0);
                case 1: 
                        System.out.println();
                        System.out.println();
                        System.out.println("You chossed : '--> 1. List all offices.' .");
                        System.out.println();
                        for(int i = 0; i < offices.length; i++)
                            {
                                System.out.println(offices[i]);
                            }
                         //Office.ToString();

                        System.out.print("Press enter to return to the menu...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
                break;
                case 2: 
                        System.out.println();
                        System.out.println();
                        System.out.println("You chossed : '--> 2. Create a new employee record.' .");
                        System.out.println();

                        if(employees.length >= 5)
                            {
                                System.out.println("Maximum number of Employees already created");
                                return;
                            }
                        else{

                            Employee employee = new Employee();
                            Address address1 = new Address();

                            for(int i = 0; i < offices.length; i++)
                            {
                                System.out.println(employees[i]);
                            }

                            System.out.println("Please enter the address:");
                            System.out.print(" --> Street  :");
                            String employeestreet = scan.next();
                            employeestreet+=scan.nextLine();
                            //Address.setStreet(employeestreet);
                            
                            System.out.println();
                            System.out.print(" --> City/Town  :");
                            String employeetown = scan.next();
                            employeetown+=scan.nextLine();
                            //Address.setTown(employeetown);

                            System.out.println();
                            System.out.print(" --> County  :");
                            String employeecounty = scan.next();
                            employeecounty+=scan.nextLine();
                            //Address.setCounty(employeecounty);

                            System.out.println();
                            
                            String address=employeestreet + " " + employeetown + " " + employeecounty;
                            employee.setAddress(address);
                            
                            System.out.println("Please enter employee type:                             (Staff or Manager)");
                            String type = scan.next();
                            employee.setType(type);
                                if(type == "Manager")
                                    {
                                        System.out.println("Dose the Manager have a private car?");
                                        String yesorno = scan.nextLine();
                                            if(yesorno == "yes" || yesorno == "Yes" || yesorno == "Y" ||yesorno == "y")
                                                {
                                                    System.out.println("What car is it?");
                                                    String car = scan.nextLine();
                                                    employee.setCar(car);
                                                }
                                    }

                            System.out.println("Please assign the employee to an office                           (1,2,3)");
                            String  employeee = scan.nextLine();
                            //office.addEmployeeToOffice(employeee);
                            
                        }

                        System.out.print("Press enter to return to the menu...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
                break;
                case 3: 
                        System.out.println();
                        System.out.println();
                        System.out.println("You chossed : '--> 3. List all employees.' .");
                        System.out.println();

                        for(int i = 0; i < employees.length; i++)
                            {
                                System.out.println(employees[i]);
                            }

                        System.out.print("Press enter to return to the menu...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
                break;
                default: 
                        System.out.println();
                        System.out.println();
                        System.out.println("Incorrect input!!! Please re-enter choice from the menu");
                        System.out.print("Press enter to return to the menu...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
                }

        }

    }
}


public class SecondHR {

}