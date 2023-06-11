package in.at.classandobject

class MethodWithParamter {

    static main(args)
    {

//        def a = 10
//        def b = 12
//        def c = 14
//        def d = a + b + c
//        println("The sum of a, b and c is "+ d)
//
//        def (x,y,z) =[33,44,55]
//        def m = x+y+z
//        println("The sum of x,y,z is " + m)

        MethodWithParamter sum = new MethodWithParamter()
        sum.methodwithParamters(10,20,30)

    }

    def methodwithParamters(def firstValue, def secondValue, def thirdValue)
    {
        def total = firstValue + secondValue + thirdValue
        println("Sum of all values is "+ total)
    }
}
