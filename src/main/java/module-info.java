module controlador.botones01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador.botones01 to javafx.fxml;
    exports controlador.botones01;
}