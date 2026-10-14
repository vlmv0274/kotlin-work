// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean{
  val (side1, side2, side3) = triangle

  return side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1
}

fun triangleArea(triangle: Triangle): Double{
  val side1 = triangle.first 
  val side2 = triangle.second 
  val side3 = triangle.third 
  // S=1/2(a+b+c), then sqrroot s*(S-a)*(S-b)*(S-c)
  val S: Double =0.5f*(side1+side2+side3)
  val AreaToRoot: Double =S*(S-side1)*(S-side2)*(S-side3)
  val AreaTotal: Double =sqrt(AreaToRoot)
  return AreaTotal
}
