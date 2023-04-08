module com.example._2023practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._2023practice to javafx.fxml;
    exports com.example._2023practice;
}