package in.at.controlstatement

class IfElseIfDemo {

    static void main(String[] args) {
        def marks = 60

        if (marks >= 60){
            println("First Division")
        }
        else if (marks < 60 && marks >= 50){
            println("Second Devision")
        }
        else if (marks < 50 && marks >= 40){
            println("Third Devision")
        }
        else{
            println("Failed")
        }

    }

}
