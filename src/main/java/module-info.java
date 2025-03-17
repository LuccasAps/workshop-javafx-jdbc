module com.luccasaps.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.luccasaps.workshopjavafxjdbc to javafx.fxml;
    exports com.luccasaps.workshopjavafxjdbc;
}