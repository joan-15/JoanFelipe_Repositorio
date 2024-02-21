package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaDos extends AppCompatActivity {

   TextView usuarioDos,textoAnterior;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.PantallaDos);
        usuarioDos =findViewById(R.id.usuarioDos);
        usuarioDos =findViewById(R.id.textoAnterior);

        String name = getIntent().getStringExtra("name");

        usuarioDos.setText(name);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"Estoy en OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"Estoy en OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"Estoy en OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"Estoy en OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"Estoy en OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"Estoy en OnDestroy");
    }
}