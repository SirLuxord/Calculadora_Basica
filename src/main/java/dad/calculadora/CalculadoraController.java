package dad.calculadora;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static dad.calculadora.Calculadora.*;

public class CalculadoraController implements Initializable {
    private Calculadora calculadora;
    // Model






    // View

    public CalculadoraController(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        calculadora = new Calculadora();
        displayTextField.textProperty().bind(Calculadora.pantallaProperty());
    }

    @FXML
    private TextField displayTextField;

    @FXML
    private GridPane root;

    @FXML
    void OnSubtractButton(ActionEvent event) {
        calculadora.operar(RESTAR);
    }

    @FXML
    void onAddButton(ActionEvent event) {
        calculadora.operar(SUMAR);
    }

    @FXML
    void onMultiplyButton(ActionEvent event) {
        calculadora.operar(MULTIPLICAR);
    }

    @FXML
    void onDivideButton(ActionEvent event) {
        calculadora.operar(DIVIDIR);
    }

    @FXML
    void onEqualButton(ActionEvent event) {
        calculadora.operar(IGUAL);
    }

    @FXML
    void onDeleteAllButton(ActionEvent event) {
        calculadora.borrarTodo();
    }

    @FXML
    void onDeleteButton(ActionEvent event) {
        calculadora.borrar();
    }

    @FXML
    void onDotButton(ActionEvent event) {
        calculadora.insertarComa();
    }

    @FXML
    void onNineButton(ActionEvent event) {
        calculadora.insertar('9');
    }

    @FXML
    void onEightButton(ActionEvent event) {
        calculadora.insertar('8');
    }

    @FXML
    void onSevenButton(ActionEvent event) {
        calculadora.insertar('7');
    }

    @FXML
    void onSixButton(ActionEvent event) {
        calculadora.insertar('6');
    }

    @FXML
    void onFiveButton(ActionEvent event) {
        calculadora.insertar('5');
    }

    @FXML
    void onFourButton(ActionEvent event) {
        calculadora.insertar('4');
    }

    @FXML
    void onThreeButton(ActionEvent event) {
        calculadora.insertar('3');
    }

    @FXML
    void onTwoButton(ActionEvent event) {
        calculadora.insertar('2');
    }

    @FXML
    void onOneButton(ActionEvent event) {
        calculadora.insertar('1');
    }

    @FXML
    void onZeroButton(ActionEvent event) {
        calculadora.insertar('0');
    }

    public GridPane getRoot() {
        return root;
    }

}
