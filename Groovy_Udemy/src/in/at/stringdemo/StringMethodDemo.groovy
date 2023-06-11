package in.at.stringdemo

class StringMethodDemo {
    static void main(String[] args) {

        def s1 = "Groovy Program"
        println("The lenght of string s1 is " + s1.length())
        println("CHaracter at position 5 is " + s1.charAt(5))
        println("The contain value is "+s1.contains('Groovy'))
        println("S1 string star with Gro: "+s1.startsWith('Gro'))
        println("s1 string end wit gram: "+s1.endsWith('gram'))
        def s2= "Java Program"
        println("Is s1 string equal to s2: "+s1.equals(s2))
        def s3 = ""
        println("Is s2 string is empty: "+s2.isEmpty())
        println("Is s3 string is empty: "+s3.isEmpty())
        def s4 = "Groovy Program"
        println("Replace Groovy with Python in s4: "+s4.replace("Groovy","Python"))
        println("Substring of s4: "+s4.substring(3,11))
        println("Lower case: "+s4.toLowerCase())
        println("Upper Case: "+s4.toUpperCase())
        def s5 = "           Great       "
        println("Trim spaces: "+s5.trim())
        println("Split string: "+s4.split(" ")[1])
        def s6 = "groovy"
        def s7 = "GROOVY"
        println("Ignore case:"+s6.equalsIgnoreCase(s7))

        def s8 = s1.concat(s5.trim())
        println(s8)










    }
}
