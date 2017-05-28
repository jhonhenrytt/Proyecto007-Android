package henrytenetorres.proyecto007;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);

    }
    //Este metodo se ejecutara cuando se presione el boton de imagen
    public void llamar(View view){
        tv1.setText("llamando...");


    }
    public void cancelar(View view){
        tv1.setText(" ");

    }
}
