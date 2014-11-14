package freha_tddd13.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity_3 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);


        //rad 1 - hur trivs du på LIU
        TextView text1 = new TextView(this);
        text1.setText("Hur trivs du på LIU");
        text1.setLayoutParams(params);
        text1.setGravity(Gravity.CENTER);

        RadioButton rbutton = new RadioButton(this);
        rbutton.setText("Bra");
        RadioButton rbutton2 = new RadioButton(this);
        rbutton2.setText("Mycket Bra");
        RadioButton rbutton3 = new RadioButton(this);
        rbutton3.setText("Jättebra");

        RadioGroup group1 = new RadioGroup(this);
        group1.setLayoutParams(params);
        group1.setOrientation(LinearLayout.HORIZONTAL);
        group1.addView(rbutton);
        group1.addView(rbutton3);
        group1.addView(rbutton2);

        //rad 2 - Läser du på LITH
        TextView text2 = new TextView(this);
        text2.setText("Läser du på LITH");
        text2.setLayoutParams(params);
        text2.setGravity(Gravity.CENTER);

        RadioButton rbutton4 = new RadioButton(this);
        rbutton4.setText("Ja");
        RadioButton rbutton5 = new RadioButton(this);
        rbutton5.setText("Nej");

        RadioGroup group2 = new RadioGroup(this);
        group2.setLayoutParams(params);
        group2.setOrientation(LinearLayout.HORIZONTAL);
        group2.addView(rbutton4);
        group2.addView(rbutton5);

        //rad 3 - LOGO
        TextView text3 = new TextView(this);
        text3.setText("Är detta LIUs logotyp");
        text3.setLayoutParams(params);
        text3.setGravity(Gravity.CENTER);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.liu_logo);

        RadioButton rbutton6 = new RadioButton(this);
        rbutton6.setText("Ja");
        RadioButton rbutton7 = new RadioButton(this);
        rbutton7.setText("Nej");

        RadioGroup group3 = new RadioGroup(this);
        group3.setLayoutParams(params);
        group3.setOrientation(LinearLayout.HORIZONTAL);
        group3.addView(rbutton6);
        group3.addView(rbutton7);

        Button button = new Button(this);
        button.setText("Skicka in");
        button.setLayoutParams(params);


        layout.addView(text1);
        layout.addView(group1);

        layout.addView(text2);
        layout.addView(group2);

        layout.addView(image);
        layout.addView(text3);
        layout.addView(group3);

        layout.addView(button);

        setContentView(layout);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_3, menu);
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
