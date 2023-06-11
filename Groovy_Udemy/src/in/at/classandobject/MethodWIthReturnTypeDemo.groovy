package in.at.classandobject

class MethodWIthReturnTypeDemo {

    static main(args){
        def m = 10

        MethodWIthReturnTypeDemo mwrtd = new MethodWIthReturnTypeDemo()
        def summing = mwrtd.sumOfThreeNumber(10,20,30)
        def x = summing * m
        println("Muliplied "+ x )

    }

    def sumOfThreeNumber(a,b,c)
    {
        def total = a + b + c
        // in groovy by default last statement is consider as return
        total
    }
}
