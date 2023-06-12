package in.at.controlstatement

class ContinueDemo {

    static void main(String[] args) {
        for ( def i in 1..10){
            if (i == 5){
                continue
                //continue the loop, donot execute the next step
            }
            println(i)
        }
    }
}
