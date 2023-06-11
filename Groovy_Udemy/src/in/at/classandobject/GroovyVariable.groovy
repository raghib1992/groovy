package in.at.classandobject

class GroovyVariable {

    def InstantInt = 15

    static void main(String[] args) {

        GroovyVariable myvar = new GroovyVariable()

        myvar.method()

        def(a,b,c) = [23,true,"Raghib"]
        println("a value is "+a)
        println("b value is "+b)
        println("c value is "+c)

    }

    def method()
    {
        def LocalInt = 10
        println("LocalInt variable is " + LocalInt)

    }
}
