// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>) {
    if(args.size!=1){
        println("error: provide one filename")
        exitProcess(1)
    }
    
    var placeholder=0
    var linenum=1
    var longestline=1
    val filePath=Path(args[0])
    filePath.useLines {
        for(line in it) {
            if(line.length>placeholder) {
                placeholder=line.length
                longestline=linenum
            }
            linenum=linenum+1
        }
    }
    println("longest line is line $longestline with length $placeholder")
}