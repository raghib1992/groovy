package in.at.classandobject

class MethodWithOptionalParamterDemo {

        static main(args) {

            MethodWithOptionalParamterDemo sum = new MethodWithOptionalParamterDemo()
            sum.methodwithParamters(10, 30, 10)

        }


    def methodwithParamters(def firstValue, def secondValue, def thirdValue = 40)
        {
            def total = firstValue + secondValue + thirdValue
            println("Sum of all values is "+ total)
        }
}
