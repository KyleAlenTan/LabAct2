package iics.tan.kylealen.labact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        final Button constraint = (Button) findViewById(R.id.constraint);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(),constraintlayout.class);
                startActivity(moveConstraint);
            }
        });

        final Button linear = (Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear = new Intent(getApplicationContext(),linearlayout.class);
                startActivity(moveLinear);
            }
        });

        final Button relative = (Button) findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent(getApplicationContext(),relativelayout.class);
                startActivity(moveRelative);
            }
        });

    }
}






