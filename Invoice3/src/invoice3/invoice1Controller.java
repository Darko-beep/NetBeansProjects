/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice3;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author EMMANUEL VAN OWUSU
 */
public class invoice1Controller implements Initializable {
    Connection conn;

    @FXML private TableView<Person> tableView;
    @FXML private TableColumn<Person,String> item_name;
    @FXML private TableColumn<Person,String> product_id;
    @FXML private TableColumn<Person,String> quantity;
    @FXML private TableColumn<Person,String> unit_price;
    
    

    private Label label;
    @FXML
    private AnchorPane rootpane;
    @FXML
    private Button btnprint;
    @FXML
    private TextField txti;
    @FXML
    private TextField txtd;
    @FXML
    private TextField txtq;
    @FXML
    private TextField txtu;
    private TextField txti1;
    private TextField txtd1;
    private TextField txtq1;
    private TextField txtu1;
    private TextField txti2;
    private TextField txtd2;
    private TextField txtq2;
    private TextField txtu2;
    @FXML
    private Button btncal;
    @FXML
    private Button btnclear;
    @FXML
    private TextField txtname1;
    @FXML
    private DatePicker date;
    @FXML
    private TextField txtinvoice;
    @FXML
    private TextField txtcompany;
    @FXML
    private DatePicker due;
    @FXML
    private TextArea txtarea;
    @FXML
    private TextField txtpay;
    @FXML
    private TextField txtbal;
    @FXML
    private TextField txttota;
    
   
    
   

    @FXML
    private void next(MouseEvent event) throws IOException {
        Person newentry=new Person(txti.getText(), 
                                   txtd.getText(),
                                   txtq.getText(),
                                   txtu.getText());
        
    
        
        txtarea.setEditable(false);
        txtarea.setWrapText(false);
        
        LocalDate local=date.getValue();
        LocalDate ocal=due.getValue();
        
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------\n");

        txtarea.setText(txtarea.getText()+"                                                 INVOICE\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------\n");
        txtarea.setText(txtarea.getText()+"\n");

        txtarea.setText(txtarea.getText()+"Client Name :"+"\t" +"\t"    +txtname1.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");

        
        txtarea.setText(txtarea.getText()+"Invoice Date :"+"\t" +"\t" + local+"\n");
        txtarea.setText(txtarea.getText()+"\n");

        
        txtarea.setText(txtarea.getText()+"Invoice Number:"+"\t" +"\t"  + txtinvoice.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");

        
        txtarea.setText(txtarea.getText()+"Due Date :"+"\t" +"\t"+ocal+"\n");
        txtarea.setText(txtarea.getText()+"\n");

        
        txtarea.setText(txtarea.getText()+"Company Name:"+"\t" +txtcompany.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");


        
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");
        txtarea.setText(txtarea.getText()+"Item Name"+  "\t"+ "\t"+ "\t"   +"Product ID"+ "\t"    + "\t"    + "\t"    +"Quantity"+  "\t"+   "\t" + "\t"   +"Unit Price"+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");            
        
        txtarea.setText(txtarea.getText()+item_name.getCellData(newentry)+  "\t\t \t"+product_id.getCellData(newentry)+        "\t    \t \t\t" +quantity.getCellData(newentry)+      "\t           \t   \t   \t"+unit_price.getCellData(newentry)+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");

        txtarea.setText(txtarea.getText()+"Payment $:"+"\t" +txtpay.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");

        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");


        txtarea.setText(txtarea.getText()+"Balance $:"+"\t" +txtbal.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");

        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");


        txtarea.setText(txtarea.getText()+"Total Amount $:"+"\t" +txttota.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");

        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"                                     THANK YOU AND PLEASE COME AGAIN\n");
        txtarea.setText(txtarea.getText()+"\n");
        txtarea.setText(txtarea.getText()+"------------------------------------------------------------------------------------------------------------\n");


        




       





        




        
       
    }

    @FXML
    private void calculate(MouseEvent event) {
         Person newentry=new Person(txti.getText(), 
                                   txtd.getText(),
                                   txtq.getText(),
                                   txtu.getText());
        
        tableView.getItems().add(newentry);
                LocalDate local=date.getValue();
                LocalDate ocal=due.getValue();


         try {
            //creating  a connection
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/maureen","ask","ask");
            System.out.println("afa");
        } catch (SQLException ex) {
            Logger.getLogger(invoice1Controller.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection error");
        }
        
        
            try {
                Statement st = conn.createStatement();
                boolean result = st.execute("INSERT INTO INVOICE VALUES('"+txtname1.getText()+"', '"+local+"','"+txtinvoice.getText()+"', '"+ocal+"', '"+txtcompany.getText()+"','"+txtpay.getText()+"', '"+txtbal.getText()+"', '"+txttota.getText()+"','"+txti.getText()+"','"+txtd.getText()+"', '"+txtq.getText()+"', '"+txtu.getText()+"') ");
            } catch (SQLException ex) {
                Logger.getLogger(invoice1Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        txttota.setStyle("-fx-text-fill:green");
        
        
        
        try {
        double price=Double.parseDouble(txtq.getText());
        double quant=Double.parseDouble(txtu.getText());
        


        
        double ans=price*quant;
        String value=String.valueOf(ans);
        
        txttota.setText(value+'\n');
         double total=Double.parseDouble(txttota.getText());
        double pay=Double.parseDouble(txtpay.getText());
        double ans2=pay-total; 
        String value2=String.valueOf(ans2);
        txtbal.setText(value2);
        } catch (Exception e) {
            txttota.setText("error");
            
        }
        
      
            
      
        
      
    }

    @FXML
    private void clear(MouseEvent event) {
        txtarea.clear();
        txti.clear();
        txtd.clear();
        txtq.clear();
        txttota.clear();
        txtbal.clear();
        txtpay.clear();
        txtu.clear();
        txtname1.clear();
        txtinvoice.clear();
        txtcompany.clear();
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        item_name.setCellValueFactory(new PropertyValueFactory<>("item_name"));
        product_id.setCellValueFactory(new PropertyValueFactory<>("product_id"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        unit_price.setCellValueFactory(new PropertyValueFactory<>("unit_price"));


        tableView.setItems(getPeople());
        
        
        // TODO
    }    
    
    public ObservableList<Person> getPeople()
    {
        ObservableList<Person> people = FXCollections.observableArrayList();
        return people;
       
        
    }
    
}
