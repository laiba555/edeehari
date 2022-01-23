 package pk.edu.uiit.arid2495.edehari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

 public class showpost extends AppCompatActivity {

Button post,but;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_showpost);
         but = (Button) findViewById(R.id.but);
         post = (Button) findViewById(R.id.but);
         post.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(showpost.this, chat.class);
                 intent.putExtra("status", "New");
                 startActivity(intent);
             }
         });
     }}

