package desafio.modulo2.digitalhousefoods

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btnLogin).setOnClickListener(openActivity(HomeActivity::class.java))
        findViewById<Button>(R.id.btnRegister).setOnClickListener(openActivity(HomeActivity::class.java))
    }

    fun openActivity(activity: Class<out Activity>): View.OnClickListener? {
        return View.OnClickListener {
            startActivity(Intent(this, activity))
        }
    }
}
