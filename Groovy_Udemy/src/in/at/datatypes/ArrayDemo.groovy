package in.at.datatypes

class ArrayDemo {

    static main(args)
    {
        def language = new String[3]

        language[0] = "Python"
        language[1] = "Groovy"
        language.putAt(2, "Java")

        println(language)
        println("The size of the array is " + language.size())
        println("the size of the array is " + language.length)

        def arrayAfterRemovingJava = language - "Java"
        println(arrayAfterRemovingJava)
    }
}
