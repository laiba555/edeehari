package pk.edu.uiit.arid2495.edehari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle data=this.getIntent().getExtras();
        if(data!=null) {

            String i = data.getString("status");
            if(i=="old") {
                Toast.makeText(this, i, Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void Painting(View v)
    {
        Intent intent = new Intent(home.this,showpost.class);
        startActivity(intent);
    }
    public void Poet(View v)
    {
        Intent intent = new Intent(home.this,showpost.class);
        startActivity(intent);
    }
    public void sketch(View v)
    {
        Intent intent = new Intent(home.this,showpost.class);
        startActivity(intent);
    }
}