package com.example.medicineapp;

import java.util.ArrayList;
import java.util.List;

public class MedicineExpert {
    public List<String> getMedicine(String Medicine) {
        List<String> MedicineList = new ArrayList<>();
        if (Medicine.equals("Morning")) {
            MedicineList.add("Vitamin C");
            MedicineList.add("Multivitamin");
            MedicineList.add("Antibiotic");
        }
        else if (Medicine.equals("Night")) {
            MedicineList.add("Sleeping Pills");
            MedicineList.add("Painkillers");
            MedicineList.add("Cold Medicine");
        }
        else if (Medicine.equals("Afternoon")) {
            MedicineList.add("Digestive Enzyme");
            MedicineList.add("Energy Booster");
            MedicineList.add("Probiotic");
        }
        return MedicineList;
    }
}
