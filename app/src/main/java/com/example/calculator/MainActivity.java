package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    Button clear;
    ImageButton delete;
    String operation = "";
    String LHS = "";
    String RHS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        resultTextView = findViewById(R.id.result_text_view);
        clear = findViewById(R.id.clear_operation);
    }

    // Handles digit button clicks
    public void onDigitClicked(View view) {
        Button clickedButton = (Button) view;
        String currentText = resultTextView.getText().toString();

        // Replace "0" with the new digit
        if (currentText.equals("0")) {
            resultTextView.setText(clickedButton.getText());
        } else {
            resultTextView.append(clickedButton.getText());
        }
    }

    // Handles clearing the calculator
    public void clear(View view) {
        resultTextView.setText("0"); // Reset to "0"
        LHS = "";
        RHS = "";
        operation = "";
    }

    // Handles removing the last digit
    public void removeLastDigit(View view) {
        String currentText = resultTextView.getText().toString();

        if (!currentText.isEmpty()) {
            String newText = currentText.substring(0, currentText.length() - 1);
            resultTextView.setText(newText.isEmpty() ? "0" : newText);
        }
    }

    // Handles operator button clicks
    public void onOperationClicked(View view) {
        if (view instanceof Button) {
            Button clickedOperation = (Button) view;

            String currentText = resultTextView.getText().toString();

            // If "=" button is pressed, perform the calculation
            if (clickedOperation.getText().toString().equals("=")) {
                if (!LHS.isEmpty() && !operation.isEmpty() && !currentText.isEmpty()) {
                    RHS = currentText;
                    LHS = calculate(LHS, operation, RHS);
                    resultTextView.setText(LHS); // Show result
                    operation = ""; // Reset operation for the next calculation
                }
            } else {
                // Store LHS and operation
                if (operation.isEmpty()) {
                    LHS = currentText;
                    operation = clickedOperation.getText().toString();
                    resultTextView.setText(""); // Clear for RHS input
                } else {
                    // Perform the calculation immediately if an operator is pressed after an operator
                    RHS = currentText;
                    LHS = calculate(LHS, operation, RHS);
                    resultTextView.setText(LHS); // Show result
                    operation = clickedOperation.getText().toString(); // Update operation
                }
            }
        }
    }

    // Performs calculation based on operation
    private String calculate(String lhs, String operation, String rhs) {
        try {
            double leftOperand = Double.parseDouble(lhs);
            double rightOperand = Double.parseDouble(rhs);
            double result;

            switch (operation) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    if (rightOperand == 0) {
                        return "Error: Division by zero";
                    }
                    result = leftOperand / rightOperand;
                    break;
                default:
                    return "Error: Invalid operation";
            }

            // Return formatted result (2 decimal places)
            return String.format("%.2f", result);
        } catch (NumberFormatException e) {
            return "Error: Invalid input format";
        }
    }
}
