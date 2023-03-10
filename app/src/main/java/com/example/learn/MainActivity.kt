package com.example.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.learn.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(ss: Bundle?){
        super.onCreate(ss)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.enter.setOnClickListener {

            val tempValue = bindingClass.data.text.toString()
            val temp = tempValue.lowercase().trim()
            Log.d("Log_exMAct", "Input name is $tempValue, $temp")

            /*
            if (temp == "linda"){
                bindingClass.res.text =" Hi, $tempValue! Your salary is 2000$"
            }else if(temp == "miha"){
                bindingClass.res.text="Hi, $tempValue! Your salary is 2100$"
            }else if(temp== "lara"){
                 bindingClass.res.text ="Hi, $tempValue! Your salary 1700$"
            }else{
                bindingClass.res.text=" Hi, $tempValue, no data about you"
            }*/
            bindingClass.res.visibility = View.VISIBLE
            var tempSal =""
            when(temp){
                Constant.Manager-> {
                        if(bindingClass.passW.text.toString() == Constant.PasswMan) {
                            tempSal = "Hi, ${
                                tempValue.trim().lowercase()
                                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
                            }! Your salary is ${Constant.Manager_Salary}"
                            bindingClass.res.text = tempSal
                            bindingClass.resPhoto.visibility = View.VISIBLE
                            bindingClass.resPhoto.setImageResource(R.drawable.done_new)
                        }else{
                            bindingClass.res.text = "Wrong password"
                            bindingClass.resPhoto.visibility = View.VISIBLE
                            bindingClass.resPhoto.setImageResource(R.drawable.wrong)
                        }
                }

                Constant.Director->{
                    if(bindingClass.passW.text.toString() == Constant.PasswDir) {
                        tempSal = "Hi, ${
                            tempValue.trim().lowercase()
                                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
                        }! Your salary is ${Constant.Director_Salary}"
                        bindingClass.res.text = tempSal
                        bindingClass.resPhoto.visibility = View.VISIBLE
                        bindingClass.resPhoto.setImageResource(R.drawable.done_new)
                    }else{
                        bindingClass.res.text = "Wrong password"
                        bindingClass.resPhoto.visibility = View.VISIBLE
                        bindingClass.resPhoto.setImageResource(R.drawable.wrong)
                    }
                }
                Constant.Sup-> {
                    if(bindingClass.passW.text.toString() == Constant.PasswSup) {
                        tempSal = "Hi, ${
                            tempValue.trim().lowercase()
                                .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
                        }! Your salary is ${Constant.Sup_Salary}"
                        bindingClass.res.text = tempSal
                        bindingClass.resPhoto.visibility = View.VISIBLE
                        bindingClass.resPhoto.setImageResource(R.drawable.done_new)
                    }else{
                        bindingClass.res.text = "Wrong password"
                        bindingClass.resPhoto.visibility = View.VISIBLE
                        bindingClass.resPhoto.setImageResource(R.drawable.wrong)
                    }
                }
                else -> {bindingClass.res.text ="Hi, ${tempValue.trim().lowercase()
                        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }} , mo data about you"
                        bindingClass.resPhoto.visibility = View.VISIBLE
                        bindingClass.resPhoto.setImageResource(R.drawable.error)
                }}
        }

    }


}
    /*lateinit var bindingClass :ActivityMainBinding
    val a:Byte = 50
    val b:Byte = 95
    var res = 0

    override fun onCreate(bs: Bundle?) {
        super.onCreate(bs)
        bindingClass =ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.pl.setOnClickListener {
            res = a + b
            bindingClass.vElem.text = "Result of sum: " + res.toString()
        }
        bindingClass.mi.setOnClickListener {
            res = b - a
            bindingClass.vElem.text ="Result of minus: $res"
        }
        bindingClass.mu.setOnClickListener {
            res = a * b
            bindingClass.vElem.text ="result of multiplay: $res "

        }}
*/

    /*lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?){
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.tex.text =" Gerrpp"

        bindingClass.cisk.setOnClickListener {
            bindingClass.vElem.visibility = View.GONE
        }

     }
     */

    /*
    var tv: TextView? = null
    lateinit var tk: TextView
    var counter = 0
    lateinit var butt: Button
    lateinit var GenTex: TextView

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv_2)
        tv?.text = "Ni"
        butt = findViewById(R.id.cisk)
        GenTex = findViewById(R.id.tex)
        butt.setOnClickListener{
            GenTex.text= "What's up"
        }
    }

    fun onClickB(view : View){
        val TVtest = findViewById<TextView>(R.id.tex)
        TVtest.text = "Hi"
        counter = 5
        tk = findViewById(R.id.tv_2)
        tk.text="g"

    }
*/
    /*
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = 6 + 6
        Log.d("Log_exMAct", "onCreate")
    }
    override fun onStart(){
        super.onStart()
        counter = 40+12
        Log.d("Log_exMAct","OnStart")

    }
    override fun onResume(){
        super.onResume()
        Log.d("Log_exMAct","OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Log_exMAct","OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log_exMAct","OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log_exMAct","OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Log_exMAct","OnRestart")
    }*/

