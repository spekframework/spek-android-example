package org.spekframework.speksample

import com.nhaarman.mockito_kotlin.clearInvocations
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyNoMoreInteractions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class MainPresenterImplTest : Spek({
    given("a main presenter") {
        val view                = mock<MainView>()

        val presenter           = MainPresenterImpl(view)

        beforeEachTest {
            // if you need to attach view
        }

        whenever("doSomeWork") {
            presenter.doSomeWork()
            then("Great") {
                verify(view).anAwesomeWork("Great")
            }
        }

        afterEachTest {
            verifyNoMoreInteractions(view)
            clearInvocations(view)
        }
    }
})