package freha_tddd13.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_2);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(20,20,0,0);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);


        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.HORIZONTAL);
        l1.setLayoutParams(params);

        TextView name = new TextView(this);
        name.setText("Namn");
        name.setWidth(200);

        EditText inputname = new EditText(this);
        inputname.setInputType(InputType.TYPE_CLASS_TEXT);
        inputname.setLayoutParams(params);

        l1.addView(name);
        l1.addView(inputname);

        LinearLayout l2 = new LinearLayout(this);
        l2.setOrientation(LinearLayout.HORIZONTAL);
        l2.setLayoutParams(params);

        TextView pass = new TextView(this);
        pass.setText("Lösenord");
        pass.setWidth(200);

        EditText inputpass = new EditText(this);
        inputpass.setLayoutParams(params);
        inputpass.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);

        l2.addView(pass);
        l2.addView(inputpass);

        LinearLayout l3 = new LinearLayout(this);
        l3.setOrientation(LinearLayout.HORIZONTAL);
        l3.setLayoutParams(params);

        TextView email = new TextView(this);
        email.setText("Email");
        email.setWidth(200);
        EditText inputemail = new EditText(this);
        inputemail.setLayoutParams(params);
        inputemail.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);

        l3.addView(email);
        l3.addView(inputemail);

        LinearLayout l4 = new LinearLayout(this);
        l3.setOrientation(LinearLayout.HORIZONTAL);
        l3.setLayoutParams(params);

        TextView age = new TextView(this);
        age.setText("Ålder");
        age.setWidth(200);

        SeekBar seek = new SeekBar(this);
        seek.setLayoutParams(params);

        l4.addView(age);
        l4.addView(seek);

        layout.addView(l1);
        layout.addView(l2);
        layout.addView(l3);
        layout.addView(l4);

        setContentView(layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
