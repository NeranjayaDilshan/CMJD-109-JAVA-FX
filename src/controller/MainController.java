package controller;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private AnchorPane root;

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws Exception {
        System.out.println("Customer Button Clicked");

        // Stage stage = new Stage();
        // stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Customer.fxml"))));
        // stage.setTitle("Customer Form");
        // stage.show();

        root.getChildren().clear();
        
        URL resource = getClass().getResource("../view/Customer.fxml");
        Parent node = FXMLLoader.load(resource);
        root.getChildren().add(node);
    }

    @FXML
    void btnItemOnAction(ActionEvent event) {
        System.out.println("Item Button Clicked");

    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) {
        System.out.println("Orders Button Clicked");

    }
}
