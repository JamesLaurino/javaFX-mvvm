module org.example.firstappfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;
    requires java.sql;

    opens org.example.firstappfx.view to javafx.fxml;
    opens org.example.firstappfx.viewmodel to javafx.fxml;
    opens org.example.firstappfx.model to javafx.fxml;
    opens org.example.firstappfx.service to javafx.fxml;

    opens org.example.firstappfx to javafx.fxml;
    exports org.example.firstappfx;
    exports org.example.firstappfx.model;
    exports org.example.firstappfx.view;
    exports org.example.firstappfx.viewmodel;
    exports org.example.firstappfx.service;
    exports org.example.firstappfx.model.repository;
    opens org.example.firstappfx.model.repository to javafx.fxml;
}