package dsa.priyasnu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //- Created a new class "employeeList" from
        //- Employee class of type-> ArrayList<>('capacity')
        //- Default Capacity of a list is 10.
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Priyansu",
                "Sahoo",1));
        employeeList.add(new Employee("abc",
                "xyz",4));
        employeeList.add(new Employee("Thanos",
                "Sahoo",2));
        employeeList.add(new Employee("jewel",
                "kmc",3));

        /**
         * used forEach() to loop through the list.
         * used lambdas' expression.
         */
        employeeList.forEach(employee -> System.out.println(employee));

        //- Retrieve by using get().
        //- Array is backing this list, so random access like this,
        // where we just provide an index, is done in constant time.
        //- Time-complexity doesn't depend on the size of the list.
        System.out.println(employeeList.get(1));
    }
}

/**
 * ArrayList are great when we load a bunch of data and access it.
 * But
 */