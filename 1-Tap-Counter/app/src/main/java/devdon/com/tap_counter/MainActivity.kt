package devdon.com.tap_counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    private var currentNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    private fun setupView() {
        this.tapButton.setOnClickListener{
            currentNumber += 1
            numberTextView.text = currentNumber.toString()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            R.id.menuReset -> {
                this.currentNumber = 0
                this.numberTextView.text = "0"
            } else -> this.toast("Error while item selected!")
        }


        return super.onOptionsItemSelected(item)
    }





}
