module co.edu.uniquindio.bancofx.bancoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.bancofx.bancoapp to javafx.fxml;
    exports co.edu.uniquindio.bancofx.bancoapp;
}