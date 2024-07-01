module org.example.firstappfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;

    opens org.example.firstappfx.view to javafx.fxml;
    opens org.example.firstappfx.viewmodel to javafx.fxml;
    opens org.example.firstappfx.service to javafx.fxml;

    opens org.example.firstappfx to javafx.fxml;
    exports org.example.firstappfx;
    exports org.example.firstappfx.model.entity;
    opens org.example.firstappfx.model.entity to javafx.fxml;
    exports org.example.firstappfx.view;
    exports org.example.firstappfx.viewmodel;
    exports org.example.firstappfx.service;
    exports org.example.firstappfx.service.file;
    opens org.example.firstappfx.service.file to javafx.fxml;
    exports org.example.firstappfx.model.dto;
    opens org.example.firstappfx.model.dto to javafx.fxml;
}