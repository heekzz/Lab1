package freha_tddd13.lab1;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity_3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        //rad 1 - hur trivs du på LIU
        TextView text1 = new TextView(this);
        text1.setText("Hur trivs du på LIU");
        text1.setLayoutParams(lparams);

        RadioButton rbutton = new RadioButton(this);
        rbutton.setText("Bra");
        RadioButton rbutton2 = new RadioButton(this);
        rbutton2.setText("Mycket Bra");
        RadioButton rbutton3 = new RadioButton(this);
        rbutton3.setText("Jättebra");

        RadioGroup group1 = new RadioGroup(this);
        group1.setLayoutParams(lparams);
        group1.setOrientation(LinearLayout.HORIZONTAL);
        group1.addView(rbutton);
        group1.addView(rbutton3);
        group1.addView(rbutton2);

        //rad 2 - Läser du på LITH
        TextView text2 = new TextView(this);
        text2.setText("Läser du på LITH");
        text2.setLayoutParams(lparams);

        RadioButton rbutton4 = new RadioButton(this);
        rbutton4.setText("Ja");
        RadioButton rbutton5 = new RadioButton(this);
        rbutton5.setText("Nej");

        RadioGroup group2 = new RadioGroup(this);
        group2.setLayoutParams(lparams);
        group2.setOrientation(LinearLayout.HORIZONTAL);
        group2.addView(rbutton4);
        group2.addView(rbutton5);

        //rad 3 - LOGO
        TextView text3 = new TextView(this);
        text3.setText("Är detta LIUs logotyp");

        ImageView image = new ImageView(this);
        image.setLayoutParams(lparams);



//        image.setImageResource(getResourceE);
        Button button = new Button(this);
        button.setText("Skicka in");
        button.setLayoutParams(lparams);


        layout.addView(text1);
        layout.addView(group1);

        layout.addView(text2);
        layout.addView(group2);
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
