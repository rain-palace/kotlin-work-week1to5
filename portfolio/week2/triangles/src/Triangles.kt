// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {
    return triangle.first<(triangle.second+triangle.third)
            && triangle.second<(triangle.first+triangle.third)
            && triangle.third<(triangle.first+triangle.second)
}

fun triangleArea(triangle: Triangle): Double {
    val s=0.5*(triangle.first+triangle.second+triangle.third)
    val heron=sqrt(s*(s-triangle.first)*(s-triangle.second)*(s-triangle.third))

    return heron
}
