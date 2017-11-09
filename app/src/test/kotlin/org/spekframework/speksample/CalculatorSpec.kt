package org.spekframework.speksample

import org.hamcrest.CoreMatchers.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertThat

object CalculatorSpec : Spek({
    val calculator by memoized { Calculator() }

    it("should be 4") {
        assertThat(calculator.add(2, 2), equalTo(4))
    }
})