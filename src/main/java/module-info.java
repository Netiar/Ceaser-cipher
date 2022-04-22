module com.example.ceasercipher {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ceasercipher to javafx.fxml;
    exports com.example.ceasercipher;
}