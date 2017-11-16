package org.spekframework.speksample

import org.hamcrest.CoreMatchers.equalTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertThat


object HelloSpec: Spek({
    it("should say hello") {
        assertThat(Hello().hello(), equalTo("Hello"))
    }
})