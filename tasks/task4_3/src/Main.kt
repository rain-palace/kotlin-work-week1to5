// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if(args.size!=3) {
        println("error: please input three marks")
        exitProcess(1)
    }
    val avgmark=((args[0].toFloat()+args[1].toFloat()+args[2].toFloat())/3).roundToInt()
    val grade=when(avgmark) {
        in 0..39 -> "fail"
        in 40..69 -> "pass"
        in 70..100 -> "distinction"
        else -> "what?"
    }

    println("mark: $avgmark, grade: $grade")
}