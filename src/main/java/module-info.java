module com.luccasaps.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.sql;

    opens com.luccasaps.workshopjavafxjdbc to javafx.fxml;
    opens com.luccasaps.workshopjavafxjdbc.model.entities to javafx.base;
    opens com.luccasaps.workshopjavafxjdbc.model.services to javafx.base;
    opens com.luccasaps.workshopjavafxjdbc.util to javafx.base;
    exports com.luccasaps.workshopjavafxjdbc;
}