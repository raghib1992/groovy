package in.at.staticdemo

class StaticDemo {

    static main(args) {
        EmployeeDetail ed = new EmployeeDetail()
        ed.empId = 420
        ed.empName = "Jitu"

        println "Emplyee ID is " + ed.empId
        println("Employee Name is " + ed.empName)
        println("Company name is " + EmployeeDetail.compName)
    }
}
