module com.hospital.mini_doctor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.hospital.mini_doctor to javafx.fxml;
    exports com.hospital.mini_doctor;
}