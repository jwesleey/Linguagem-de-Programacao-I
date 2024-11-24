module org.example.interfaceclasses {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.media;

    opens org.example.interfaceclasses to javafx.fxml;
    exports org.example.interfaceclasses;
    exports org.example.interfaceclasses.Classes;
    opens org.example.interfaceclasses.Classes to javafx.fxml;
    exports org.example.interfaceclasses.Controllers;
    opens org.example.interfaceclasses.Controllers to javafx.fxml;
}