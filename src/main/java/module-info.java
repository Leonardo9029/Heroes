module com.argandona.heroes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.argandona.heroes to javafx.fxml;
    exports com.argandona.heroes;



    opens com.argandona.heroes.controller to javafx.fxml;
}