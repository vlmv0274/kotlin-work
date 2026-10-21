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
        median(listOf(10f)) shouldBe 10f
    }

    "Median should be 15 of list=10,20" {
        median(listOf(10f, 20f)) shouldBe 15f
    }

    "Median should be 20 of list=10,20,40" {
        median(listOf(10f, 20f, 40f)) shouldBe 20f
    }
    
    "Median should be 15 of list=10,20,40,100" {
        median(listOf(10f, 20f, 40f, 100f)) shouldBe 30f
    }
    
})
