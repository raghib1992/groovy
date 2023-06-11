package in.at.classandobject

class SimpleMethod {

    static void main(String[] args) {

        SimpleMethod sum = new SimpleMethod()
        sum.simpleMethod()

    }

    def simpleMethod(){
        def a = 5
        def b = 14
        def c = a + b
        println("Sum of a and b is " + c)
    }
}
