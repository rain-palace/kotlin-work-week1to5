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
    "Median when size=1" {
        median(listOf(1f)) shouldBe 1f
    }
    "Median when size=2" {
        median(listOf(1f, 2f)) shouldBe 1.5f
    }
    "Median when size=3" {
        median(listOf(1f, 2f, 4f)) shouldBe 2f
    }
    "Median when size=4" {
        median(listOf(1f, 2f, 4f, 8f)) shouldBe 3f
    }
})
