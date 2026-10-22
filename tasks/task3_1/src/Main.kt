// Task 3.1: command line arguments
import kotlin.system.exitProcess

fun main(args: Array<String>) {
	if(args.size!=2) {
		println("error: you did not input two arguments")
		exitProcess(4)
	}
	else {
	println(args[0])
	println(args[1])
	}
}
