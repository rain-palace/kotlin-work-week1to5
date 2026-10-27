// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size!=2) {
        println("input two words only")
        exitProcess(1)
    }

    val yorn=anagrams(args[0], args[1])

    if(yorn) {
        println("the words you inputted are anagrams")
    }
    else {
        println("the words you inputted are not anagrams")
    }
}