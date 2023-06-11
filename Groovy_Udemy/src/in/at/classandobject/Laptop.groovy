package in.at.classandobject

class Laptop {

    def price
    def brand
    def configuration

    static main(args) {
        Laptop tomandjerry = new Laptop()
        tomandjerry.logIn()
        tomandjerry.logOut()

        tomandjerry.price = 100000
        tomandjerry.brand = "mac Book"
        tomandjerry.configuration = true

        println(tomandjerry.price)
        println(tomandjerry.brand)
        println(tomandjerry.configuration)

    }

    def logIn(){
        println("System in Log in")
    }

    def logOut(){
        println("system is logout")
    }


}
