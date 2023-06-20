import java.util.*;

public class Main {
    public static void main(String[] args) {

//  Create Hashmap with key Employee and value Team • print all records each in one line( you cannot use sout here)
//• print “John Smith is working under Mark in Digital wallet Team ”. for all records
//◦ here John smith is employee, Mark is its stackholder and Digital wallet is project name.
//• Remove employees below 50000 salary
//• print all records each in one line
//• get the set of employees which has salary of 50000 or higher.
//• Print that set
//• Convert this set to list
        //print that list
        //remove employee which has salary 50000 from
        // that list
        // print updated list

        Employee utsav = new Employee("Utsav","Kalia",22,60000,"Hcl");
        Employee varun = new Employee("Varun","Sood",24,40000,"Hcl");
        Employee piyush = new Employee("Piyush","Sharma",27,35000,"CGI");
        Employee priya = new Employee("Priya","Kalia",21,65000,"Micro");
        Employee amrit = new Employee("Amrit","Sham",20,50000,"Honda");

        Team team1 = new Team("HakkaPro","changing spice","Adam",200000,new Date("2023/12/12"));
        Team team2 = new Team("DesiPro","HOt spice","Aditya",500000,new Date("2023/12/11"));

        HashMap<Employee,Team> ourcompany = new HashMap<>();

        ourcompany.put(utsav,team1);
        ourcompany.put(varun,team2);
        ourcompany.put(piyush,team1);
        ourcompany.put(priya,team2);
        ourcompany.put(amrit,team1);

        Iterator<Map.Entry<Employee, Team>> iterator = ourcompany.entrySet().iterator();

        // Iterate through the HashMap and print each key-value pair on a separate line
        while (iterator.hasNext()) {
            Map.Entry<Employee, Team> entry = iterator.next();
            //John smith is employee, Mark is its stackholder and Digital wallet is project name
            System.out.println(entry.getKey().firstName + " " +entry.getKey().lastName
                    + " is employee, "+entry.getValue().stackholders +" is its stckholder and "
            + entry.getValue().projectName+" is project name");
        }
        Set<Employee> employeeSet = new HashSet<>();
        for (Employee employee: ourcompany.keySet()
             ) {
            if (employee.salary>=50000){
                employeeSet.add(employee);
            }
        }
        System.out.println(employeeSet);
        //• Convert this set to list
        List<Employee> employeeList = new ArrayList<>(employeeSet);
        System.out.println(employeeList);
        Iterator<Employee> iterator1 = employeeList.iterator();
       while (iterator1.hasNext()){
           Employee employee = iterator1.next();
           if (employee.salary == 50000){
               iterator1.remove();
           }
       }
        System.out.println(employeeList);

        //print that list
        //remove employee which has salary 50000 from
        // that list
        // print updated list
    }



}