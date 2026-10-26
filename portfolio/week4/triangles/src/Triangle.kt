// COMP2850 Portfolio: Week 4
// Triangle class
import kotlin.math.sqrt

class Triangle (val sideA: Double, val sideB: Double, val sideC: Double){

    init {
        require(sideA < sideB + sideC || sideB < sideA + sideC || sideC < sideA + sideB) {"Degenerate or imaginary case"}
    }
    val perimeter: Double get() = sideA + sideB + sideC
    val semiPerimeter: Double get() = (sideA + sideB + sideC)/2
    val S: Double =(sideA+sideB+sideC)/2.0
    val AreaToRoot: Double =S*(S-sideA)*(S-sideB)*(S-sideC)
    val AreaTotal: Double =sqrt(AreaToRoot)
    val area: Double get() = AreaToRoot
    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"


/*
Could do positive only numbers with a require
Maybe change to ANDs

/*
    sideA : Double
    sideB : Double
    sideC : Double
    perimeter : Double [computed]
    semiPerimeter : Double [computed]
    area : Double [computed]
    toString() String
*/
