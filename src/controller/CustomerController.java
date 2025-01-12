package controller;

import java.util.ArrayList;

import dto.CustomerDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import service.CustomerService;
import service.ServiceFactory;

public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance()
            .getService(ServiceFactory.ServiceType.CUSTOMER);
    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtDob;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtProvince;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtTitle;

    
    @FXML
    private TableColumn<CustomerDto, String> colAddress;

    @FXML
    private TableColumn<CustomerDto, String> colContact;

    @FXML
    private TableColumn<CustomerDto, String> colId;

    @FXML
    private TableColumn<CustomerDto, String> colName;

    @FXML
    private TableColumn<CustomerDto, String> colTitle;

    @FXML
    private TableView<CustomerDto> tblCustomer;

    @FXML
    void btnCustomerDeleteOnAction(ActionEvent event) {

    }

    public void initialize() {
        System.out.println("this is the first method");
        try {
            getAllCustomer();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void getAllCustomer() throws Exception {
       ArrayList<CustomerDto> all = customerService.getAll();
       System.out.println(all);
    }

    @FXML
    void btnCustomerSaveOnAction(ActionEvent event) throws Exception {
        System.out.println("Save Button is working fine");

        String id = txtId.getText();
        String title = txtTitle.getText();
        String name = txtName.getText();
        String contact = txtContact.getText();
        String address = txtAddress.getText();
        Double salary = Double.parseDouble(txtSalary.getText());
        String city = txtCity.getText();
        String province = txtProvince.getText();
        String postalCode = txtPostalCode.getText();
        String dob = txtDob.getText();

        System.out.println("id : " + id);
        System.out.println("title : " + title);
        System.out.println("name : " + name);
        System.out.println("contact : " + contact);
        System.out.println("address : " + address);
        CustomerDto customerDto = new CustomerDto(id, title, name, dob, salary, address, city, province, postalCode);
        String save = customerService.save(customerDto);
        System.out.println(save);
    }

}
