package com.wang.phone.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wang.phone.R
import kotlinx.android.synthetic.main.activity_dialpad.*
import kotlinx.android.synthetic.main.dialpad.*

class DialpadActivity : AppCompatActivity() {
    internal  val TAG="DialpadActivity ---------"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialpad)

        setDailpadListener()
        //todo call phone

    }

    fun setDailpadListener(){
        dialpad_0.setOnClickListener { Log.d(TAG,"click 0");dialpad_input_add("0") }
        dialpad_1.setOnClickListener { Log.d(TAG,"click 1");dialpad_input_add("1")  }
        dialpad_2.setOnClickListener { Log.d(TAG,"click 2");dialpad_input_add("2")  }
        dialpad_3.setOnClickListener { Log.d(TAG,"click 3");dialpad_input_add("3")  }
        dialpad_4.setOnClickListener { Log.d(TAG,"click 4");dialpad_input_add("4")  }
        dialpad_5.setOnClickListener { Log.d(TAG,"click 5");dialpad_input_add("5")  }
        dialpad_6.setOnClickListener { Log.d(TAG,"click 6");dialpad_input_add("6")  }
        dialpad_7.setOnClickListener { Log.d(TAG,"click 7");dialpad_input_add("7") }
        dialpad_8.setOnClickListener { Log.d(TAG,"click 8");dialpad_input_add("8") }
        dialpad_9.setOnClickListener { Log.d(TAG,"click 9");dialpad_input_add("9")  }
        dialpad_asterisk.setOnClickListener { Log.d(TAG,"click *");dialpad_input_add("*")  }
        dialpad_pound.setOnClickListener { Log.d(TAG,"click #");dialpad_input_add("#") }
        dialpad_clear_char.setOnClickListener {Log.d(TAG,"click delete 1"); dialpad_input_backspace()  }

        dialpad_0.setOnLongClickListener { Log.d(TAG,"long click 0");dialpad_input_add("0");true}
        dialpad_1.setOnLongClickListener { Log.d(TAG,"long click 1");dialpad_input_add("1");true}
        dialpad_2.setOnLongClickListener { Log.d(TAG,"long click 2");dialpad_input_add("2");true}
        dialpad_3.setOnLongClickListener { Log.d(TAG,"long click 3");dialpad_input_add("3");true}
        dialpad_4.setOnLongClickListener { Log.d(TAG,"long click 4");dialpad_input_add("4");true}
        dialpad_5.setOnLongClickListener { Log.d(TAG,"long click 5");dialpad_input_add("5");true}
        dialpad_6.setOnLongClickListener { Log.d(TAG,"long click 6");dialpad_input_add("6");true}
        dialpad_7.setOnLongClickListener { Log.d(TAG,"long click 7");dialpad_input_add("7");true}
        dialpad_8.setOnLongClickListener { Log.d(TAG,"long click 8");dialpad_input_add("8");true}
        dialpad_9.setOnLongClickListener { Log.d(TAG,"long click 9");dialpad_input_add("9");true}
        dialpad_asterisk.setOnLongClickListener { Log.d(TAG,"long click *");dialpad_input_add("*");true}
        dialpad_pound.setOnLongClickListener { Log.d(TAG,"long click #");dialpad_input_add("#");true}
        dialpad_clear_char.setOnLongClickListener {Log.d(TAG,"click delete all");dialpad_input_clear( );true  }

        dialpad_call_button.setOnClickListener {  }
    }

    @SuppressLint("SetTextI18n")
    private fun dialpad_input_add(string: String){
        dial_num_input.setText(dial_num_input.text.toString()+string)
    }

    fun dialpad_input_backspace(){
        if (dial_num_input.text.length!=0){
            val str:String =dial_num_input.text.toString()
            dial_num_input.setText(str.substring(0,str.length-1))
        }
    }

    fun dialpad_input_clear( ){
        dial_num_input.setText("")
    }

    fun click_call_phone(){

    }
}