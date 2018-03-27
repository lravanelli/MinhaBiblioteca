package br.com.lravanelli.minhabiblioteca

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

object CustomToast {
    fun showToast(context: Context, mensagem: String){
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view = inflater.inflate(R.layout.custom_toast, null)

        val toast = Toast(context)

        toast.view = view
        val textView = view.findViewById<TextView>(R.id.textView1)
        textView.text = mensagem

        toast.duration = Toast.LENGTH_LONG
        toast.show()

        //para jogar a biblioteca na net/git
        //https://mayojava.github.io/android/library/creating-and-distributing-your-own-android-library/

        //infiniteScrollLibrary
        //https://github.com/heiderlopes/InfiniteScrollLibrary
    }
}