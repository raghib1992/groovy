package in.at.staticdemo

class StaticMethodDemo {
    def num = 10
    static def staticNum = 20

    static main(args){

        StaticMethodDemo smd = new StaticMethodDemo()
        smd.sum()
        staticSum()

    }

    def sum(){
        println(num + staticNum)
        println(num + num)
    }

    def static staticSum(){
        println(staticNum + staticNum)
    }
}
