package org.spekframework.speksample
import org.jetbrains.spek.api.dsl.*

fun SpecBody.whenever(description: String, body: ActionBody.() -> Unit) {
    action("when $description", body = body)
}

fun SpecBody.`when`(description: String, body: SpecBody.() -> Unit) {
    group("when $description", body = body)
}

fun SpecBody.given(description: String, body: SpecBody.() -> Unit) {
    group("given $description" , body = body)
}

fun SpecBody.with(description: String, body: SpecBody.() -> Unit) {
    group("with $description", body = body)
}

fun SpecBody.xwith(description: String, reason: String? = null, body: SpecBody.() -> Unit) {
    group("with $description", Pending.Yes(reason), body)
}

fun TestContainer.then(description: String, body: TestBody.() -> Unit) {
    test("then $description", body = body)
}

fun TestContainer.should(description: String, body: TestBody.() -> Unit) {
    test("should $description", body = body)
}

fun TestContainer.xshould(description: String, reason: String? = null, body: TestBody.() -> Unit = {}) {
    test("should $description", Pending.Yes(reason), body)
}
