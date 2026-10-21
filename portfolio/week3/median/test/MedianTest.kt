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
    "Median should be 10 of list=10" {
        List<Float>(1) { 10 } shouldBe 10f
    }

    "Median should be 15 of list=10,20" {
        List<Float>(2) { 10 , 20} shouldBe 15f
    }

    "Median should be 20 of list=10,20,40" {
        List<Float>(2) { 10 , 20} shouldBe 20f
    }
    
    "Median should be 15 of list=10,20" {
        List<Float>(2) { 10 , 20, 40, 200} shouldBe 30f
    }
    
})
