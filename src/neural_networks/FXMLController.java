/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import neural_networks.First_frameController;
/**
 * FXML Controller class
 *
 * @author jcc
 */
public class FXMLController implements Initializable {
    @FXML
    public static AnchorPane panel2;
    @FXML
    private ImageView x_y1;
    @FXML
    private ImageView y;
    @FXML
    private ImageView x;
    @FXML
    private ImageView x_y0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
         Image bc = new Image(getClass().getResourceAsStream("/imge/bc.png"));
     Image c = new Image(getClass().getResourceAsStream("/imge/c.png"));
         if(First_frameController.how=="and")
        {   
            x.setImage(bc);                
           
            y.setImage(bc);                
            x_y0.setImage(bc);   
            x_y1.setImage(c);   
            
    }    
    }
}
