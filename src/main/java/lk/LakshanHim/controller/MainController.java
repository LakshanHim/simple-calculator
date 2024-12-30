package lk.LakshanHim.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.awt.SystemColor.text;

public class MainController {

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnSubtract;

    @FXML
    private TextField display;


    @FXML
    void btnAdd(ActionEvent event) {
    }

    public void initialize(){
        btn0.setOnAction(event -> handleButtonClick(btn0));
        btn1.setOnAction(event -> handleButtonClick(btn1));
        btn2.setOnAction(event -> handleButtonClick(btn2));
        btn3.setOnAction(event -> handleButtonClick(btn3));
        btn4.setOnAction(event -> handleButtonClick(btn4));
        btn5.setOnAction(event -> handleButtonClick(btn5));
        btn6.setOnAction(event -> handleButtonClick(btn6));
        btn7.setOnAction(event -> handleButtonClick(btn7));
        btn8.setOnAction(event -> handleButtonClick(btn8));
        btn9.setOnAction(event -> handleButtonClick(btn9));
        btnAdd.setOnAction(event -> handleButtonClick(btnAdd));
        btnDecimal.setOnAction(event -> handleButtonClick(btnDecimal));
        btnDivide.setOnAction(event -> handleButtonClick(btnDivide));
        btnMultiply.setOnAction(event -> handleButtonClick(btnMultiply));
        btnSubtract.setOnAction(event -> handleButtonClick(btnSubtract));
    }

    private void handleButtonClick(Button button) {
        String buttonValue = button.getText();
        display.setText(display.getText() + buttonValue);
    }


}
