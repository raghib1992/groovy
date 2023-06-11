package in.at.stringdemo

class StringsDemo {

    static void main(String[] args) {
        // Java Strings
        String strliteral = "This is string leteral"
        println strliteral

        String newstr = new String("This is using new keywords")
        println(newstr)

        // Groovy String
        def singlequote = 'This is single quote string' +
                ' hence all in single'
        println(singlequote)

        def triplesinglequote = '''\
This is triple single quote string
This accept multi lines'''
        println("This is triple quote string: " + triplesinglequote)

        def sampledata = "Groovy"

        def doublequote = "This is double quote string"
        println(doublequote)

        def tripledoublequote = """This is triple quote
and its accpt multi lines
${sampledata}"""
        println(tripledoublequote)
        def slashystring = /This is slashy string
this is new line
${sampledata}/
        println(slashystring)

        def dollarSlashyString = $/This is dollar slashy line
This is new line
this accept blackward slash /
${sampledata}/$
        println(dollarSlashyString)

    }
}
