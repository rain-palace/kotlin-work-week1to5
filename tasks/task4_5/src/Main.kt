// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val lim=args[0].toInt()
    
    var sum=0
    for(ma in 1..lim step 2) {
        sum=sum+ma
    }
    println(sum)
}