package in.at.controlstatement

class ForDemo {

    static void main(String[] args) {
        //Java
        for( def i =1; i <= 10; i++ ){
            println("The value of i is: "+i)
        }

        def languages = ["Java", "Python", "Groovy"]

        for (def i = 0; i < languages.size(); i ++){
            println("The programming language is: "+languages[i])
        }

        for (def lang:languages){
            println("easy way for for loop: "+lang)
        }
        //---------------upto-------------------

        0.upto(10,{
            println(it)
        })

        //-------------times---------------------

        10.times {
            println(it)
        }

        //----------for-------------------

        for(i in 1..10){
            println(i)
        }
        //--------------------------
        println("----------------foreach--------")
        languages.each {
            println(it)
        }
        println("-----------0 to 10-------------")
        (0..10).each {
            println(it)
        }
        //---------------------------------
        println("Increase step by 2 ")

        for( def i=0; i <=10; i+=2){
            println("The value if i is: "+i)
        }
        println("The increase in steps of 2")

        0.step(11,2){
            println(it)
        }
    }

}
