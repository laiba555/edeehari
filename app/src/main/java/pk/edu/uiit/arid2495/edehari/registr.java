package pk.edu.uiit.arid2495.edehari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registr extends AppCompatActivity {
    EditText name,number,password;
    Button button;
    boolean passwordvisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        button=(Button)findViewById(R.id.button);
        name=(EditText) findViewById(R.id.username);
        number=(EditText) findViewById(R.id.number);
        password=(EditText) findViewById(R.id.password);
        password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int Right=2;
                if(event.getAction()==MotionEvent.ACTION_UP)
                {
                    if (event.getRawX()>=password.getLeft()-password.getCompoundDrawables()[Right].getBounds().width())
                    {
                        int selection=password.getSelectionEnd();
                        if(passwordvisible)
                        {
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.hideneye,0);
                            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordvisible=false;
                        }
                        else
                        {
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_visibility_24,0);
                            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordvisible=true;
                        }
                        password.setSelection(selection);
                        return true;
                    }
                }

                return false;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(name.getText().toString().equals(""))
                {
                   name.setError("اپنا نام لکھیں۔");
                }
                else if(number.getText().toString().equals(""))
                {
                    number.setError("اپنا نمبر درج کریں۔");
                }
                else if(password.getText().toString().equals(""))
                {
                    password.setError("پلیز پاسورڈ لکھیں۔");
                }
                else
                {
                    Intent intent = new Intent(registr.this,MainActivity.class);
                    intent.putExtra("status" , "New");
                    startActivity(intent);
                }
            }
        });
    }
}