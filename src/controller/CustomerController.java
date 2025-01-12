package controller;

import java.util.ArrayList;

import dto.CustomerDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableColumn<CustomerDto, Double> colSalary;

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

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));



        tblCustomer.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection)->{
            System.out.println("oldSelection : "+oldSelection);
            System.out.println("newSelection : "+newSelection);

            if(newSelection !=null){
                txtId.setText(newSelection.getId());
                txtName.setText(newSelection.getName());
                txtTitle.setText(newSelection.getTitle());
            }
        });


    }

    private void getAllCustomer() throws Exception {
        ArrayList<CustomerDto> all = customerService.getAll();
        System.out.println(all);
        ObservableList<CustomerDto> observableArrayList = FXCollections.observableArrayList();
        observableArrayList.addAll(all);
        tblCustomer.setItems(observableArrayList);
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
