// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size!=3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val s=0.5*(args[0].toFloat()+args[1].toFloat()+args[2].toFloat())
    val heron=sqrt(s*(s-args[0].toFloat())*(s-args[1].toFloat())*(s-args[2].toFloat()))

    println("Area = "+"%.5f".format(heron))
}