package freha_tddd13.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity_2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_2);

        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        param.setMargins(0, 10, 0, 0);

        LinearLayout.LayoutParams param_e = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        // Main layout (Background)
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.HORIZONTAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        // Left col
        LinearLayout leftCol = new LinearLayout(this);
        leftCol.setOrientation(LinearLayout.VERTICAL);
        leftCol.setLayoutParams(new LinearLayout.LayoutParams(70, LinearLayout.LayoutParams.MATCH_PARENT));

        // Right col
        LinearLayout rightCol = new LinearLayout(this);
        rightCol.setOrientation(LinearLayout.VERTICAL);
        rightCol.setLayoutParams(new LinearLayout.LayoutParams(180, LinearLayout.LayoutParams.MATCH_PARENT));

        // Namn text
        TextView name = new TextView(this);
        name.setText("Namn:");
        name.setLayoutParams(param);

        // Lösenord text
        TextView password = new TextView(this);
        password.setText("Lösenord:");
        password.setLayoutParams(param);

        // E-mail text
        TextView email = new TextView(this);
        email.setText("Email:");
        email.setLayoutParams(param);

        // Ålder text
        TextView age = new TextView(this);
        age.setText("Ålder:");
        age.setLayoutParams(param);

        // Namn fält
        EditText name_e = new EditText(this);
        name_e.setLayoutParams(param_e);

        // Lösenord fält
        EditText password_e = new EditText(this);
        password_e.setLayoutParams(param_e);

        // E-mail fält
        EditText email_e = new EditText(this);
        email_e.setLayoutParams(param_e);

        // Ålder reglage
        SeekBar age_e = new SeekBar(this);
        age_e.setLayoutParams(param_e);


        leftCol.addView(name);
        leftCol.addView(password);
        leftCol.addView(email);
        leftCol.addView(age);

        rightCol.addView(name_e);
        rightCol.addView(password_e);
        rightCol.addView(email_e);
        rightCol.addView(age_e);

        mainLayout.addView(leftCol);
        mainLayout.addView(rightCol);

        setContentView(mainLayout);
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
