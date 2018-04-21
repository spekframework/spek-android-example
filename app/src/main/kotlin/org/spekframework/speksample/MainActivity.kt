package org.spekframework.speksample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = MainPresenterImpl(this)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click.setOnClickListener { presenter.doSomeWork() }
    }

    override fun anAwesomeWork(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
