package org.spekframework.speksample

interface MainPresenter {
    fun doSomeWork()
}

class MainPresenterImpl(private val view: MainView) : MainPresenter {
    override fun doSomeWork() {
        view.anAwesomeWork("Great")
    }
}