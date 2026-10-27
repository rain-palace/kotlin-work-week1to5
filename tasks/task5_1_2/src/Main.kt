// Task 5.1.2: main program
import kotlin.system.exitProcess

/*fun main() {
    rollDie(20)
}*/

fun main() {
    println("which die would you like to throw?")
    println("options are: d4,d6,d8,d10,d12,d20\ninput number only please")
    val pick=readln()

    if(pick.isEmpty()) {
        println("choose one die")
        exitProcess(1)
    }
    rollDie((pick.toInt()))
}