package com.example.javafxdemo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField bmi;

    @FXML
    private Button bmicalculate;

    @FXML
    private TextField height;

    @FXML
    private Label resulte;

    @FXML
    private TextField weight;

    @FXML
    void calculate(ActionEvent event) {
        double the_weight = Double.parseDouble(weight.getText());
        double the_height = Double.parseDouble(height.getText());
        double the_bmi2 = the_weight/(the_height*the_height);
        int the_bmi = (int) the_bmi2;
        String ausgabe = String.valueOf(the_bmi);
        String BMI_name = "";
        bmi.setText(ausgabe);
        if (the_bmi > 40) {
            BMI_name = "Your BMI class is obese class III";}
        if (the_bmi > 35 && the_bmi <= 40) {
            BMI_name = "Your BMI class is obese class II";}
        if (the_bmi > 30 && the_bmi <= 35) {
            BMI_name = "Your BMI class is obese class I";}
        if (the_bmi > 25 && the_bmi <= 30) {
            BMI_name = "Your BMI class is Overweight";}
        if (the_bmi > 20 && the_bmi <= 25) {
            BMI_name = "Your BMI class is Normal";}
        if (the_bmi > 17 && the_bmi <= 20) {
            BMI_name = "Your BMI class is Mild Thinness";}
        if (the_bmi > 16 && the_bmi <= 17) {
            BMI_name = "Your BMI class is Moderate Thinness";}
        if (the_bmi < 16 ) {
            BMI_name = "Your BMI class is Severe Thinness";}
        resulte.setText(BMI_name);
        weight.setText("");
        height.setText("");

    }

}