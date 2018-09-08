package iics.tan.kylealen.labact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relativelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout);

        final Button relativenext = (Button) findViewById(R.id.relativenext);
        relativenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent(getApplicationContext(),constraintlayout.class);
                startActivity(moveRelative);
            }
        });
    }
}
