// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

data class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA<(sideB+sideC) && sideB<(sideA+sideC) && sideC<(sideA+sideB)) {
            "Exception thrown for degnerate/imaginary case"
        }
    }
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"

    val perimeter get() = sideA+sideB+sideC
    val semiPerimeter get() = perimeter/2F
    val area get() = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

}
