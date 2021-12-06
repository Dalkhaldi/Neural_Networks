/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import neural_networks.Second_blockController;
/**
 * FXML Controller class
 *
 * @author jcc
 */
public class First_frameController implements Initializable {
    @FXML
    private Button and;
     
    @FXML
    private Button or;
    @FXML
    private Button nor;
    @FXML
    private Button nand;
    @FXML
    private Button xnor;
    @FXML
    private Button go;
    @FXML
    private Button xor;
   static String  how;
    Image bc = new Image(getClass().getResourceAsStream("/imge/bc.png"));
     Image c = new Image(getClass().getResourceAsStream("/imge/c.png"));
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
         
    go.setDisable(true);
    }    

    @FXML
    private void and_press(ActionEvent event)throws IOException 
    {
        how="and";
       nor.setDisable(true);
    or.setDisable(true);
    xor.setDisable(true);
    xnor.setDisable(true);
     
    nand.setDisable(true);
    go.setDisable(false);
    
    }
    
 

    @FXML
    private void or_press(ActionEvent event) throws IOException 
    {
         how="or";
        nor.setDisable(true);
    xor.setDisable(true);
    and.setDisable(true);
    xnor.setDisable(true);
 
    nand.setDisable(true);
    go.setDisable(false);
    }

    @FXML
    private void nor_press(ActionEvent event) throws IOException 
    {
         how="nor";
       xor.setDisable(true);
    or.setDisable(true);
    and.setDisable(true);
    xnor.setDisable(true);
   
    nand.setDisable(true);
    go.setDisable(false);
    }

    @FXML
    private void nand_press(ActionEvent event)throws IOException 
    {
         how="nand";
       nor.setDisable(true);
    or.setDisable(true);
    and.setDisable(true);
    xnor.setDisable(true);
 
    xor.setDisable(true);
    go.setDisable(false);
    }

    @FXML
    private void xnor_press(ActionEvent event) throws IOException 
    {
         how="xnor";
       nor.setDisable(true);
    or.setDisable(true);
    and.setDisable(true);
    xor.setDisable(true);
    
    nand.setDisable(true);
    go.setDisable(false);
    }

    @FXML
    private void go_press(ActionEvent event)throws IOException 
    {
          
        Parent playParent = FXMLLoader.load(getClass().getResource("second_block.fxml"));
        Scene playscene= new Scene(playParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(playscene);
        window.show();
    }

    @FXML
    private void xor_ptrss(ActionEvent event) throws IOException 
    {
         how="xor";
        
    nor.setDisable(true);
    or.setDisable(true);
    and.setDisable(true);
    xnor.setDisable(true);
  
    nand.setDisable(true);
    go.setDisable(false);
     
    
}}
