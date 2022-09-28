package com.gasca1234.gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Integer c = 0,turno=0;
    EditText Et_Ganador;
Button Btn_1,Btn_2,Btn_3,Btn_4,Btn_5,Btn_6,Btn_7,Btn_8,Btn_9,Btn_salir,Btn_reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et_Ganador=(EditText)findViewById(R.id.ganador);
        Btn_salir=(Button)(findViewById(R.id.salir));
        Btn_reset=(Button)(findViewById(R.id.voolverajugar));
        Btn_1=(Button)(findViewById(R.id.boton1));
        Btn_2=(Button)(findViewById(R.id.boton2));
        Btn_3=(Button)(findViewById(R.id.boton3));
        Btn_4=(Button)(findViewById(R.id.boton4));
        Btn_5=(Button)(findViewById(R.id.boton5));
        Btn_6=(Button)(findViewById(R.id.boton6));
        Btn_7=(Button)(findViewById(R.id.boton7));
        Btn_8=(Button)(findViewById(R.id.boton8));
        Btn_9=(Button)(findViewById(R.id.boton9));
        Btn_1.setOnClickListener(this);
        Btn_2.setOnClickListener(this);
        Btn_3.setOnClickListener(this);
        Btn_4.setOnClickListener(this);
        Btn_5.setOnClickListener(this);
        Btn_6.setOnClickListener(this);
        Btn_7.setOnClickListener(this);
        Btn_8.setOnClickListener(this);
        Btn_9.setOnClickListener(this);
        Btn_reset.setOnClickListener(this);
        Btn_salir.setOnClickListener(this);





    }



    @Override
    public void onClick(View view) {
        c++;
        turno=c%2;


        if (turno==1){
            imprimirXO('x',view);
        }
        else
        {
            imprimirXO('o',view);
        }


    }
    public void imprimirXO(char letra,View view)
    {
        if (view.getId()==R.id.voolverajugar)
        {
            Et_Ganador.setEnabled(true);
            Et_Ganador.setText("");
            Btn_1.setEnabled(true);
            Btn_1.setText("");
            Btn_2.setEnabled(true);
            Btn_2.setText("");
            Btn_3.setEnabled(true);
            Btn_3.setText("");
            Btn_4.setEnabled(true);
            Btn_4.setText("");
            Btn_5.setEnabled(true);
            Btn_5.setText("");
            Btn_6.setEnabled(true);
            Btn_6.setText("");
            Btn_7.setEnabled(true);
            Btn_7.setText("");
            Btn_8.setEnabled(true);
            Btn_8.setText("");
            Btn_9.setEnabled(true);
            Btn_9.setText("");
        }
        if(view.getId()==R.id.salir)
        {
            System.exit(0);
        }

        if (view.getId()==R.id.boton1)
{
    Btn_1.setText(letra+"");
    Btn_1.setEnabled(false);
}
else if (view.getId()==R.id.boton2)
{

    Btn_2.setText(letra+"");
    Btn_2.setEnabled(false);
}
else if (view.getId()==R.id.boton3)
{

    Btn_3.setText(letra+"");
    Btn_3.setEnabled(false);
}
else if (view.getId()==R.id.boton4)
{

    Btn_4.setText(letra+"");
    Btn_4.setEnabled(false);
}
else if (view.getId()==R.id.boton5)
{

    Btn_5.setText(letra+"");
    Btn_5.setEnabled(false);
}
        else if (view.getId()==R.id.boton6)
        {

            Btn_6.setText(letra+"");
            Btn_6.setEnabled(false);
        }else if (view.getId()==R.id.boton7)
{

    Btn_7.setText(letra+"");
    Btn_7.setEnabled(false);
}else if (view.getId()==R.id.boton8)
{

    Btn_8.setText(letra+"");
    Btn_8.setEnabled(false);
}
else if (view.getId()==R.id.boton9)
{

    Btn_9.setText(letra+"");
    Btn_9.setEnabled(false);
}
Ganador(letra);


    }
    public void  Ganador(char letra)
    {
        if(Btn_1.getText().toString().equals(letra+"")&& (Btn_2.getText().toString().equals(letra+"")) && (Btn_3.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);
            Et_Ganador.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);

        }
        else if(Btn_5.getText().toString().equals(letra+"")&& (Btn_1.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);

            Et_Ganador.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
        }
        else if(Btn_5.getText().toString().equals(letra+"")&& (Btn_4.getText().toString().equals(letra+"")) && (Btn_6.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);

            Et_Ganador.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
        } else if(Btn_7.getText().toString().equals(letra+"")&& (Btn_8.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);

            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
        }
        else if(Btn_2.getText().toString().equals(letra+"")&& (Btn_4.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);

            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
        }
        else if(Btn_1.getText().toString().equals(letra+"")&& (Btn_4.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);
            Et_Ganador.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_7.setEnabled(false);
        }
        else if(Btn_3.getText().toString().equals(letra+"")&& (Btn_4.getText().toString().equals(letra+"")) && (Btn_8.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_9.setEnabled(false);
        }
        else if(Btn_2.getText().toString().equals(letra+"")&& (Btn_4.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
        } else if(Btn_2.getText().toString().equals(letra+"")&& (Btn_6.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+"")))
        {
            Et_Ganador.setText("El ganador es  "+""+""+ letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_7.setEnabled(false);
        }
        else
        {
            Et_Ganador.setText("Empate");
        }

    }
}