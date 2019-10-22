package com.example.calculadoraisr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Campos
    private int opcion;
    private EditText txtPeriodo;
    private Spinner spnPeriodo;
    private TextView stcLimiteInferior;
    private TextView stcExcLimiteInferior;
    private TextView stcPorcExcLimiteInferior;
    private TextView stcImpuestoMarginal;
    private TextView stcCuotaFijaImpuesto;
    private TextView stcISRdeterminado;
    private TextView stcSubsidio;
    private TextView stcSubsidioEmpleo;

    clsISR clase = new clsISR();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarControles();
        cargarControles();
    }

    /**
     * Método que inicializa los controles para manipular su información por código.
     */
    private void iniciarControles() {
        // Instancia los controles
        txtPeriodo = findViewById(R.id.EDT_Periodo);
        spnPeriodo = findViewById(R.id.COMBO_Periodo);
        stcLimiteInferior = findViewById(R.id.STC_LimiteInferior);
        stcExcLimiteInferior = findViewById(R.id.STC_Excedente);
        stcPorcExcLimiteInferior = findViewById(R.id.STC_Porcentaje);
        stcImpuestoMarginal = findViewById(R.id.STC_Impuesto);
        stcCuotaFijaImpuesto = findViewById(R.id.STC_Cuota);
        stcISRdeterminado = findViewById(R.id.STC_ISR);
        stcSubsidio = findViewById(R.id.STC_Subsidio);
        stcSubsidioEmpleo = findViewById(R.id.STC_SubsidioEmpleo);
    }

    /**
     * Método que carga los campos
     */
    private void cargarControles() {
        // Instancia los botones
        Button btnCalcular = findViewById(R.id.BTN_Calcular);
        Button btnLimpiar = findViewById(R.id.BTN_Limpiar);

        // Agrega listeners a los botones
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se asigna ingreso
                clase.setIngreso(Double.parseDouble(txtPeriodo.getText().toString()));

                // Verifica la opción
                switch (opcion) {
                    case 1:
                        clase.calcularCuotaFijaPorcentajeSemanal();
                        clase.cantidadSubsidioSemanal();
                        break;
                    case 2:
                        clase.calcularCuotaFijaPorcentajeQuincenal();
                        clase.cantidadSubsidioQuincenal();
                        break;
                    case 3:
                        clase.calcularCuotaFijaPorcentajeMensual();
                        clase.cantidadSubsidioMensual();
                        break;
                }
                clase.resultado();
                asignarResultados();
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // Limpia los controles
                stcLimiteInferior.setText("");
                stcExcLimiteInferior.setText("");
                stcPorcExcLimiteInferior.setText("");
                stcImpuestoMarginal.setText("");
                stcCuotaFijaImpuesto.setText("");
                stcISRdeterminado.setText("");
                stcSubsidio.setText("");
                stcSubsidioEmpleo.setText("");
            }
        });

        // Carga el spinner
        ArrayAdapter<CharSequence> adapterPeriodo = ArrayAdapter.createFromResource(this, R.array.periodoItems, android.R.layout.simple_spinner_item);
        adapterPeriodo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnPeriodo.setAdapter(adapterPeriodo);

        // Se agrega listener al spinner
        spnPeriodo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Revisa la opción seleccionada
                switch (position) {
                    case 0: // Semanal
                        opcion = 1;
                        break;
                    case 1: // Quincenal
                        opcion = 2;
                        break;
                    case 2: // Mensual
                        opcion = 3;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void asignarResultados() {
        // Asigna los valores a los controles
        stcLimiteInferior.setText(clase.getLimiteInferior().toString());
        stcExcLimiteInferior.setText(clase.getExcLimiteInferior().toString());
        stcPorcExcLimiteInferior.setText(clase.getPorcExcLimiteInferior().toString());
        stcImpuestoMarginal.setText(clase.getImpuestoMarginal().toString());
        stcCuotaFijaImpuesto.setText(clase.getCuotaFijaImpuesto().toString());
        stcISRdeterminado.setText(clase.getISRdeterminado().toString());
        stcSubsidio.setText(clase.getSubsidio().toString());
        stcSubsidioEmpleo.setText(clase.getSubsidioEmpleo().toString());
    }
}
