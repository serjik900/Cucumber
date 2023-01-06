package steps;

import pages.*;

public class PageInitializer {

    public static LoginPage login;
    public static DashboardPage dashboard;
    public static AddEmployeePage addEmployee;
    public static EmployeeListPage employeeList;
    public static ChangeEmpContactsPage empContacts;

    public static EmployeeTerminationPage empTermination;

    public static void intializePageObjects(){
        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployee = new AddEmployeePage();
        employeeList = new EmployeeListPage();
        empContacts=new ChangeEmpContactsPage();
        empTermination=new EmployeeTerminationPage();
    }
}
