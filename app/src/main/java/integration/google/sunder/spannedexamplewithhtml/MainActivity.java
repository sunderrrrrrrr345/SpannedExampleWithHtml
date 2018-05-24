package integration.google.sunder.spannedexamplewithhtml;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fromHtml("Sunder??@@@$$$  // )))) ''",((TextView)findViewById(R.id.tv_hello)));

    }



    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html, View viewById){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            ((TextView)viewById).setText(Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY));
            return Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else { return Html.fromHtml(html); }
    }
}
