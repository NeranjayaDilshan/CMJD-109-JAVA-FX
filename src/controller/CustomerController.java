package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CustomerController {

    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTitle;

    @FXML
    void btnCustomerDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnCustomerSaveOnAction(ActionEvent event) {
        System.out.println("Save Button is working fine");

        String id = txtId.getText();
        String title = txtTitle.getText();
        String name = txtName.getText();
        String contact = txtContact.getText();
        String address = txtAddress.getText();

         System.out.println("id : "+id);
         System.out.println("title : "+title);
         System.out.println("name : "+name);
         System.out.println("contact : "+contact);
         System.out.println("address : "+address);
    }
}
