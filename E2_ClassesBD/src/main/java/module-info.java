module org.jw.e2_classesbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.media;

    opens org.jw.e2_classesbd.Controllers to javafx.fxml;
    opens org.jw.e2_classesbd to javafx.fxml;
    exports org.jw.e2_classesbd;
    exports org.jw.e2_classesbd.Controllers;  // Exporte o pacote onde Home está


}