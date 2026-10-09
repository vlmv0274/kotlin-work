// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(args: Array<String>){
  if (args.size != 3) {
    var TriangleValiditity: Boolean = false
  } else if (args != Int || Float || Double){
    var TriangleValiditity: Boolean = false
  } else {
    var TriangleValiditity: Boolean = true
    return TriangleValiditity
  }
}

fun triangleArea(args: Array<String>){
  if (args.size != 3) {
    exitProcess(1)
    } else {
        val side1 =args[0].toFloat()
        val side2 =args[1].toFloat()
        val side3 =args[2].toFloat()
        // S=1/2(a+b+c), then sqrroot s*(S-a)*(S-b)*(S-c)
        val S: Float =0.5f*(side1+side2+side3)
        val AreaToRoot: Float =S*(S-side1)*(S-side2)*(S-side3)
        val AreaTotal: Float =sqrt(AreaToRoot)
        val AreaOutput = String.format("%.5f", AreaTotal)
    }
  return AreaOutput
}
