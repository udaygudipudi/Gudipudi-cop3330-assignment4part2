module com.example.gudipudicop3330assignment4part2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.junit.jupiter.api;


    opens com.example.gudipudicop3330assignment4part2 to javafx.fxml;
    exports com.example.gudipudicop3330assignment4part2;
    exports ucf.assignments;
    opens ucf.assignments to javafx.fxml;
}