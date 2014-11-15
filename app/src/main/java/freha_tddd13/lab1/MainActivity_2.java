package freha_tddd13.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
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
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        layout.setPadding(20,20,0,0);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,60, getResources().getDisplayMetrics());

        LinearLayout l1 = new LinearLayout(this);
        l1.setOrientation(LinearLayout.HORIZONTAL);
        l1.setLayoutParams(params);

        TextView name = new TextView(this);
        name.setText("Namn");
//        name.setLayoutParams(params);
//        name.setTextAppearance(this, android.R.style.TextAppearance_Large);
        name.setWidth((int)px);


        EditText inputname = new EditText(this);
        inputname.setLayoutParams(params);

        l1.addView(name);
        l1.addView(inputname);

        LinearLayout l2 = new LinearLayout(this);
        l2.setOrientation(LinearLayout.HORIZONTAL);
        l2.setLayoutParams(params);

        TextView pass = new TextView(this);
        pass.setText("Lösenord");
//        pass.setLayoutParams(params);
//        pass.setTextAppearance(this, android.R.style.TextAppearance_Large);
        pass.setWidth((int)px);

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
//        email.setLayoutParams(params);
//        email.setTextAppearance(this, android.R.style.TextAppearance_Large);
        email.setWidth((int)px);


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
//        age.setLayoutParams(params);
//        age.setTextAppearance(this, android.R.style.TextAppearance_Large);
        age.setWidth((int)px);

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
