package in.at.constructordemo

class ParameterizedConstructorDemo {

    def employeeId
    def employeeName

    ParameterizedConstructorDemo(empId, empName){

        this.employeeId = empId
        this.employeeName =empName

        println(" The Employee Id is "+empId)
        println("The Employee Name is "+ empName)

    }

    static void main(String[] args) {
        ParameterizedConstructorDemo sample1= new ParameterizedConstructorDemo(12, "Tom")
        ParameterizedConstructorDemo sample2 = new ParameterizedConstructorDemo(14, "Jerry")
    }
}
