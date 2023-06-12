package in.at.controlstatement

class BreakDemo {

    static void main(String[] args) {
        for(def i in 1..10){
            if(i == 6){
                break
            }
            println(i)
        }
    }

}
