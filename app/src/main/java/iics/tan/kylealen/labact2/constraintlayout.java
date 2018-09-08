package iics.tan.kylealen.labact2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class constraintlayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraintlayout);

        final Button constraintnext = (Button) findViewById(R.id.constraintnext);
        constraintnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(),linearlayout.class);
                startActivity(moveConstraint);
            }
        });

    }
}
