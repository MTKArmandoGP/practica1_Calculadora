package com.example.practicaclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    private TextView tv_Operacion,tv_Resultado;

    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_rest,btn_sum,btn_porcentaje,btn_div,btn_mult,btn_igual,btn_parentesis,
            btn_c,btn_del,btn_punto;

    String data;

    private boolean decimal=false;

    private boolean tipoPar=false;

    private boolean bandera=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_Operacion=(TextView) findViewById(R.id.tv_Operacion);
        tv_Resultado=(TextView) findViewById(R.id.tv_Resultado);
        btn_0=(Button) findViewById(R.id.btn_cero);
        btn_1=(Button) findViewById(R.id.btn_uno);
        btn_2=(Button) findViewById(R.id.btn_dos);
        btn_3=(Button) findViewById(R.id.btn_tres);
        btn_4=(Button) findViewById(R.id.btn_cuatro);
        btn_5=(Button) findViewById(R.id.btn_cinco);
        btn_6=(Button) findViewById(R.id.btn_seis);
        btn_7=(Button) findViewById(R.id.btn_siete);
        btn_8=(Button) findViewById(R.id.btn_ocho);
        btn_9=(Button) findViewById(R.id.btn_nueve);
        btn_rest=(Button)findViewById(R.id.btn_menos);
        btn_sum=(Button) findViewById(R.id.btn_mas);
        btn_porcentaje=(Button) findViewById(R.id.btn_porcentaje);
        btn_div=(Button) findViewById(R.id.btn_dividir);
        btn_mult=(Button) findViewById(R.id.btn_multiplicar);
        btn_igual=(Button) findViewById(R.id.btn_igual);
        btn_parentesis=(Button) findViewById(R.id.btn_parentesis);
        btn_c=(Button) findViewById(R.id.btn_C);
        btn_del=(Button) findViewById(R.id.btn_eliminar);
        btn_punto=(Button) findViewById(R.id.btn_punto);

    }
    public void calcular(View view){

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+0);
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+1);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+2);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+3);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+4);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+5);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+6);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+7);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+8);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+9);
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_Operacion.setText("");
                tv_Resultado.setText("0");
            }
        });
        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!decimal){
                    data=tv_Operacion.getText().toString();
                    tv_Operacion.setText(data+".");
                }
                decimal=true;
            }
        });
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+"+");
                decimal=false;
            }
        });
        btn_rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+"-");
                decimal=false;
            }
        });
        btn_porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+"%");
                decimal=false;
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+"*");
                decimal=false;
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=tv_Operacion.getText().toString();
                tv_Operacion.setText(data+"/");
                decimal=false;
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=tv_Operacion.getText().toString();
                if(text.length()>1){
                    text=text.substring(0,text.length()-1);
                    tv_Operacion.setText(text);
                    if(text.charAt(text.length()-1)=='.'){
                        decimal=true;
                    }else{
                        decimal=false;
                    }
                }else{
                    tv_Operacion.setText("");
                    decimal=false;
                }
            }
        });
        btn_parentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipoPar==true){
                    if(bandera==true){
                        data=tv_Operacion.getText().toString();
                        tv_Operacion.setText(data+"*(");
                        bandera=false;
                    }else{
                        data=tv_Operacion.getText().toString();
                        tv_Operacion.setText(data+")");
                        bandera=true;
                    }
                }else{
                    if(bandera==true){
                        data=tv_Operacion.getText().toString();
                        tv_Operacion.setText(data+"(");
                        bandera=false;
                    }else{
                        data=tv_Operacion.getText().toString();
                        tv_Operacion.setText(data+")");
                        bandera=true;
                    }
                }
                decimal=false;
            }
        });
        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    data = tv_Operacion.getText().toString();
                    data = data.replaceAll("×", "*");
                    data = data.replaceAll("%", "/100");
                    data = data.replaceAll("÷", "/");

                    org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
                    rhino.setOptimizationLevel(-1);

                    String resultadoFinal = "";

                    Scriptable scriptable = rhino.initStandardObjects();
                    resultadoFinal = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();
                    tv_Resultado.setText((resultadoFinal));
                    decimal = false;
                }catch (Exception e){
                    tv_Resultado.setText("Formato Invalido");
                }
            }
        });

    }
}