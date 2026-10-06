// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    } else {
        val side1 =args[0].toFloat()
        val side2 =args[1].toFloat()
        val side3 =args[2].toFloat()
        // s=1/2(a+b+c), then sqrroot s*a*b*c
        val S=0.5*(side1+side2+side3)
        val AreaToRoot=S*side1*side2*side3
        val AreaTotal=sqrt(AreaToRoot)
        val AreaOutput = round(AreaTotal)
        println("Area = $AreaOutput")

    }



}


