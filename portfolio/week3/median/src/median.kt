// Task 7.7.1: statistics functions
val Int.isOdd: Boolean get() = this%2!=0

fun median(listOfValues: List<Float>): Float {
    val valuesSorted=listOfValues.sorted()
    val middle=valuesSorted.size/2

    return when {
        valuesSorted.size.isOdd -> valuesSorted.get(middle)
        else -> (valuesSorted.get(middle-1)+valuesSorted.get(middle))/2F
    }
}