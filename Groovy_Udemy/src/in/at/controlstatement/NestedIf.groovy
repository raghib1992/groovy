package in.at.controlstatement

class NestedIf {

    static void main(String[] args) {
        if (1 > 0){
            println("This will run if above condition is true")
            if (1<2){
                println("This will run if above both condition run")
            }
        }

        println("Out of If block")
    }
}
