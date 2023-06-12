package in.at.controlstatement

class IfDemo {

    static void main(String[] args) {
        if( 1 > 0){
            println("This code is within the block")
        }

        if(1<0){
            println("This will not run as condition is false")
        }
        println("This always run, as out of block")
    }

}
