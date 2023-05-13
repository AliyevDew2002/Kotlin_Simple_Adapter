package com.example.kotlin_simple_adapter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_simple_adapter.adapter.User_Adapter
import com.example.kotlin_simple_adapter.databinding.ActivityDetailBinding
import com.example.kotlin_simple_adapter.model.User


class DetailActivity : AppCompatActivity() {

    lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailBinding= ActivityDetailBinding.inflate(layoutInflater)
        val view: View =detailBinding.root
        setContentView(view)

        initViews()
    }
    fun initViews(){
        RefreshAdapter(prepareList())
    }
    fun prepareList():ArrayList<User>{
        var user:ArrayList<User> = ArrayList()


        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))
        user.add(User(R.drawable.ic_launcher_foreground, "Shaxzod Aliyev"))

        return user
    }

    fun RefreshAdapter(user:ArrayList<User>){
        val adapter = User_Adapter(this, user)
        detailBinding.listView.adapter=adapter
    }
}