// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    var tempInit=args[0].toFloat()
    val tempMax=args[1].toFloat()
    val tempInc=args[2].toFloat()

    while(tempMax>tempInit) {
        val tempFah=tempInit*(9/5)+32
        print("| celcius: "+"%.1f".format(tempInit))
        println("    | fahrenheit: "+"%.1f".format(tempFah))
        tempInit=tempInit+tempInc
    }
}