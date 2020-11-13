package desafio.modulo2.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager


class HomeActivity : AppCompatActivity() {

    companion object {
        lateinit var fm : FragmentManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainerHome, RestaurantFragment(), null).addToBackStack(null).commit()

    }
}