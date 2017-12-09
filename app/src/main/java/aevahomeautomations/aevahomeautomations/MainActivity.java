package aevahomeautomations.aevahomeautomations;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextInputLayout lemail = (TextInputLayout) findViewById(R.id.lemail);
        lemail.setHint("Email");
        final TextInputLayout lpass = (TextInputLayout) findViewById(R.id.lpass);
        lpass.setHint("Password");

    }
    String em="",pw="";
    public void loggedin(View view)
    {
        EditText email = (EditText) findViewById(R.id.email);
        em = email.getText().toString();
        EditText pass = (EditText) findViewById(R.id.pass);
        pw = pass.getText().toString();
        if (em.trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "Email Address Required!", Toast.LENGTH_SHORT).show();
        }
        else if (pw.trim().length() <= 0) {
            Toast.makeText(MainActivity.this, "Password Required!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);

            Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.animation, R.anim.animation2).toBundle();
            startActivity(intent, bndlanimation);
        }

    }


}


