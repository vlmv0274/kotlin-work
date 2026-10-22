// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    //Base case test for any argument, should give out the only element
    "Median should be 10 of list=10" {
        median(listOf(10f)) shouldBe 10f
    }
    //First test with even numbers, test is to ensure correct calculation of median=x+y=0.5(x+y)
    "Median should be 15 of list=10,20" {
        median(listOf(10f, 20f)) shouldBe 15f
    }
    //First test for correctly picking middle element of odd numbers as median
    "Median should be 20 of list=10,20,40" {
        median(listOf(10f, 20f, 40f)) shouldBe 20f
    }
    //Further test to ensure logic returns the calculation of median=x+y=0.5(x+y) for just the middle two elements and not any other two elements (ie skewed left or right)
    "Median should be 15 of list=10,20,40,100" {
        median(listOf(10f, 20f, 40f, 100f)) shouldBe 30f
    }
    
})
