// COMP2850 Portfolio: Week 4
// Triangle class
import kotlin.math.sqrt

class Triangle (val sideA: Double, val sideB: Double, val sideC: Double){

    init {
        require(side1 < side2 + side3 || side2 < side1 + side3 || side3 < side1 + side2) {"Degenerate or imaginary case"}
    }
    val perimeter: Double get() = sideA + sideB + sideC
    val semiPerimeter: Double get() = (sideA + sideB + sideC)/2
    val S: Double =0.5f*(side1+side2+side3)
    val AreaToRoot: Double =S*(S-side1)*(S-side2)*(S-side3)
    val AreaTotal: Double =sqrt(AreaToRoot)
    val area: Double get() = AreaToRoot
    toString() "Triangle($sideA, $sideB, $sideC)"

}
/*
    sideA : Double
    sideB : Double
    sideC : Double
    perimeter : Double [computed]
    semiPerimeter : Double [computed]
    area : Double [computed]
    toString() String
*/
