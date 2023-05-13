package com.example.kotlin_simple_adapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.kotlin_simple_adapter.databinding.MemberListQolipBinding
import com.example.kotlin_simple_adapter.model.User
class User_Adapter(private val context: Context, private val user: ArrayList<User>) : BaseAdapter() {

    lateinit var binding:MemberListQolipBinding

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return user.size
    }

    override fun getItem(position: Int): Any {
        return user[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val users = user[position]
        val binding: MemberListQolipBinding

        if (convertView == null) {
            binding = MemberListQolipBinding.inflate(inflater, parent, false)
            convertView = binding.root
            convertView.tag = binding
        } else {
            binding = convertView.tag as MemberListQolipBinding
        }

        binding.ivProfile.setImageResource(users.getProfile())
        binding.tvFullname.text = users.getfullname()

        return convertView!!
    }
}
