package in.at.controlstatement

class SwtichDemo {

    static void main(String[] args) {

        def marks = 60
        switch (marks){
            case 0..34:
                println("Failed")
                break
            case 35..59:
                println("Third")
                break
            case { marks >= 60 && marks <75 }:
                println("Second")
                break
            default:
                println("First")
                break
        }
    }

}
