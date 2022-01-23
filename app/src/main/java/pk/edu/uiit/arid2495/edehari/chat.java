package pk.edu.uiit.arid2495.edehari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Toolbar toolbar=(Toolbar)findViewById(R.id.bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("دانش");
    }
}