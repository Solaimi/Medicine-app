package com.example.medicineapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void findMedicineButton(View view) {
        Spinner MedicineApp = (Spinner) findViewById(R.id.MedicineApp);
        String SelectedMedicine = String.valueOf(MedicineApp.getSelectedItem());
        TextView medicineName = (TextView) findViewById(R.id.medicine_name);
        MedicineExpert f = new MedicineExpert();
        List<String> MedicineList = f.getMedicine(SelectedMedicine);

        StringBuilder menuFormatted = new StringBuilder();
        for(String menu : MedicineList){
            menuFormatted.append(menu).append("\n");
        }
        medicineName.setText(menuFormatted);

    }
}