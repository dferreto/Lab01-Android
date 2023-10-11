package com.bananas.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.EditText
import android.widget.Button



class MainActivity : AppCompatActivity() {
    val TAG = "Estados"
    private lateinit var txtID: EditText
    private lateinit var txtPasswd: EditText
    private lateinit var btnIniciarSesion: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Call logCat
        Log.i(TAG, "Método onCreate()")
        Toast.makeText(this,"Método onCreate()",Toast.LENGTH_SHORT).show()
        txtID =  findViewById(R.id.txtID)
        txtPasswd = findViewById(R.id.txtPasswd)
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion)

        btnIniciarSesion.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)


            startActivity(intent)
        }


    }

    //Declaring override on all state methods
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Método onStart()")
        Toast.makeText(this,
            "Método onStart()",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Método onResume()")
        Toast.makeText(this,
            "Método onResume()",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Método onPause()")
        Toast.makeText(this,
            "Método onPause()",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Método onStop()")
        Toast.makeText(this,
            "Método onStop()",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "Método onRestart()")
        Toast.makeText(this,
            "Método onRestart()",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Método onDestroy()")
        Toast.makeText(this,
            "Método onDestroy()",Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "Método onSaveInstanceState()")

        outState.putCharSequence("txtPrueba", txtID.text)
        outState.putCharSequence("txtPasswd", txtPasswd.text)
    }

    private fun Intent(packageContext: Any, mainActivity: MainActivity, any: Any): Intent {
        TODO("Not yet implemented")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "Método onRestoreInstanceState()")

        txtID.setText(savedInstanceState?.getCharSequence("txtPrueba"))
        txtPasswd.setText(savedInstanceState?.getCharSequence("txtPasswd"))




    }



}