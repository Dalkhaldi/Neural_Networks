/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
 import neural_networks.First_frameController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Line;
import neural_networks.point;
/**
 * FXML Controller class
 *
 * @author jcc
 */
public class Second_blockController implements Initializable {
    @FXML
    private Button train;
    @FXML
   private  ImageView x_y1;
    @FXML
   private ImageView x;
    @FXML
    private ImageView y;
    @FXML
    private  ImageView x_y0;
    @FXML
    private Label result;
    @FXML
    private AnchorPane panel2;
    @FXML
      private Canvas canv;
     @FXML
      private TextField text;
    double w1,w2;
    double threshould;
    int porm ;
    int []tablex1=new int[4];
    int []tablex2=new int[4];
    double []errors=new double[4];
    int []out=new int[4];
    double actual_out , bigx ,error,corect_w1,corect_w2,new_w1,new_w2;
    double learning_rate =0.1;
    int eboch_value=0;
    int iteration_count,error_count=0 ;
    double[] error_back;
    int SSE=1;
    boolean SSE_valu;
    int stope;
    point xp = new point();
            point yp = new point();
            point x_y0p = new point();
            point x_y1p = new point();
    ImageView []points =new ImageView[4];
     Line line1= new Line();
     double endx_x;
       double starty_y;
       double endx_y ;
       double starty_x ;
       
       ////////
       double input [] []= { {0,0} ,{0,1} ,{1,0},{1,1}};
	double alpha = 0.1;
	double yout[]= {0,1,1,0};
	double er[]= {0,0,0,0};
	int counter =0,epoch=0;
	double sum_seq_err = 0.001;
	double x1 , y3 ,y4,yf,dth3,dth4,dth5,dw13,dw23,dw14, dw24,dw35,dw45 ,g3,g4,g5 ;
        double w13 ,w14  ,w23 ,w24  ,w35  ,w45, th3 , th4 ,th5 ;
			  
	///////
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
            points[0]=x;
            points[1]=y;
            points[2]=x_y0;
            points[3]=x_y1;
           
            xp.setx_xlayout(x.getLayoutX());xp.setx_ylayout(x.getLayoutY());
           yp.sety_xlayout(y.getLayoutX());yp.sety_ylayout(y.getLayoutY());
            
        // Scanner in=new Scanner(System.in);
       //System.out.println(w1);
           
     Image bc = new Image(getClass().getResourceAsStream("/imge/bc.png"));
     Image c = new Image(getClass().getResourceAsStream("/imge/c.png"));
         if(First_frameController.how=="and")
        {   
            x.setImage(bc);     xp.setxid(0);           x.setUserData(xp);     xp.setx_xlayout(x.getLayoutX());xp.setx_ylayout(x.getLayoutY());
           
            y.setImage(bc);     yp.setxid(0);           y.setUserData(yp);       yp.sety_xlayout(y.getLayoutX());yp.sety_ylayout(y.getLayoutY());
            x_y0.setImage(bc);  x_y0p.setxid(0);        x_y0.setUserData(x_y0p);
            x_y1.setImage(c);   x_y1p.setxid(1);        x_y1.setUserData(x_y1p);
            tablex1[0]=0;tablex2[0]=0;out[0]=0;
            tablex1[1]=0;tablex2[1]=1;out[1]=0;
            tablex1[2]=1;tablex2[2]=0;out[2]=0;
            tablex1[3]=1;tablex2[3]=1;out[3]=1;
             
             
             
        }
         else if(First_frameController.how=="or")
         {
            
            x.setImage(c);        xp.setxid(1);           x.setUserData(xp);
            y.setImage(c);       yp.setxid(1);           y.setUserData(yp);
            x_y0.setImage(bc);   x_y0p.setxid(0);        x_y0.setUserData(x_y0p);
            x_y1.setImage(c);    x_y1p.setxid(1);        x_y1.setUserData(x_y1p);
             tablex1[0]=0;tablex2[0]=0;out[0]=0;
            tablex1[1]=0;tablex2[1]=1;out[1]=1;
            tablex1[2]=1;tablex2[2]=0;out[2]=1;
            tablex1[3]=1;tablex2[3]=1;out[3]=1;
             
         }
          else if(First_frameController.how=="xor")
         {
            //double xl= x.getLayoutX();
            // System.out.println(xl);
            x.setImage(c);      xp.setxid(1);           x.setUserData(xp);
            y.setImage(c);      yp.setxid(1);           y.setUserData(yp);
            x_y0.setImage(bc);  x_y0p.setxid(0);        x_y0.setUserData(x_y0p);
            x_y1.setImage(bc);  x_y1p.setxid(0);        x_y1.setUserData(x_y1p);
             
             
         }
          //*********************************************************
          else if(First_frameController.how=="xnor")
         {
             
            x.setImage(bc);       xp.setxid(0);           x.setUserData(xp);
            y.setImage(bc);      yp.setxid(0);           y.setUserData(yp);
            x_y0.setImage(c);     x_y0p.setxid(1);        x_y0.setUserData(x_y0p);
            x_y1.setImage(c);     x_y1p.setxid(1);        x_y1.setUserData(x_y1p);
             
             
         }
          else if(First_frameController.how=="nand")
         {
             
            x.setImage(c);      xp.setxid(1);           x.setUserData(xp);
            y.setImage(c);      yp.setxid(1);           y.setUserData(yp);
            x_y0.setImage(c);   x_y0p.setxid(1);        x_y0.setUserData(x_y0p);
            x_y1.setImage(bc);  x_y1p.setxid(0);        x_y1.setUserData(x_y1p);
             
             
         }
          
          else if(First_frameController.how=="nor")
         {
             
            x.setImage(bc);     xp.setxid(0);           x.setUserData(xp);
            y.setImage(bc);     yp.setxid(0);           y.setUserData(yp);
            x_y0.setImage(c);   x_y0p.setxid(1);        x_y0.setUserData(x_y0p);
            x_y1.setImage(bc);  x_y1p.setxid(0);        x_y1.setUserData(x_y1p);
             
             
         }
    }
         
     
       public void step1_initalization() 
       { if(First_frameController.how=="and"||First_frameController.how=="nand"||First_frameController.how=="nor"||First_frameController.how=="or")
       { w1=  (Math.random()*1) - 0.5 ;
           w2=  (Math.random()*1) - 0.5 ;
           threshould=  (Math.random()*1) - 0.5 ;}
       else if(First_frameController.how=="xor")
       { 
         w13 = (Math.random()*2.4)-1.2;
         w14 =(Math.random()*2.4)-1.2;
	 w23 =(Math.random()*2.4)-1.2;
         w24 =(Math.random()*2.4)-1.2;
	 w35 =(Math.random()*2.4)-1.2;
	 w45 =(Math.random()*2.4)-1.2;
	 th3=(Math.random()*2.4)-1.2;
	 th4=(Math.random()*2.4)-1.2;
	 th5=(Math.random()*2.4)-1.2;
       }
           
       }
       public double function(double bx)
       { double out=0;
           if(bx >= 0) out=1;
            else if(bx<0)out=0;
           return out;
       }
     /*  public double error_calc()
       {
           
       }*/
      public double[] step2_activation()
       {
           error_count=0; error=0;
           errors[0]=0;errors[1]=0;errors[2]=0;errors[3]=0;
           if(First_frameController.how=="and"||First_frameController.how=="nand"||First_frameController.how=="nor"||First_frameController.how=="or")
        {
            //interation 1////////////////////////////////////////////////////////
            for(int i=0;i<=3;i++)
            {
                error=0;
            bigx=(((w1*tablex1[i])+(w2*tablex2[i]))+threshould);//big x
            //System.out.println(bigx);
            //System.out.println(threshould);
            //activation function --> step function
            actual_out=function(bigx);
            error=out[i]-actual_out;
            errors[i]=error;
            if(error!=0)
            {
                System.out.println(errors[i]);
                
           //correct for w1
            corect_w1=learning_rate*tablex1[i]*error;
           //new w1 if thereis
            if(corect_w1!=0)
            {
                w1+=corect_w1;
              // System.out.println(bigx);
            }
            //corerect w2
            corect_w2=learning_rate*tablex2[i]*error;
            //new w2 if theres
            if(corect_w2!=0)
            {
                w2+=corect_w2;
                  // System.out.println(bigx);
            }
            }
           
            }
        }
           else if(First_frameController.how=="xor"||First_frameController.how=="xnor")
           {
               while(counter !=4)
		{
		for (int i=0;i<4;i++)
		{// activation
					
					
		//hidden layer 
		x1=input[i][0] *w13 +input [i][1]*w23 -th3;
		y3=1/(1+Math.exp(-x1));
					
		x1=input[i][0] *w14 +input [i][1]*w24 -th4;
		y4=1/(1+Math.exp(-x1));
					
		//output layer
		x1=y3*w35+y4*w45 -th5;
	        yf=1/(1+Math.exp(-x1));
					 
					
					
					
               //change in weight
					
		//else {
                {
	          er[i]=yout[i]-yf;
			
                  sum_seq_err+=Math.pow(er[i],2.0);
						
		//weight training
						
		//outputlayer
						
		g5=yf*(1-yf)*er[i];
		dw35=alpha*y3*g5;
		dw45=alpha*y4*g5;
		//hidden layer
		g4=y4*(1-y4)*(w45*g5);
		dw14=alpha*input[i][0]*g4;
		dw24=alpha*input[i][1]*g4;
						
	       g3=y3*(1-y3)*(w35*g5);
	       dw13=alpha*input[i][0]*g3;
	       dw23=alpha*input[i][1]*g3;
						
		dth3=alpha*-1*g3;
		dth4=alpha*-1*g4;
		dth5=alpha*-1*g5;
				 		
	}
					
	w13=w13+dw13;
	w23=w23+dw23;
	w14=w14+dw14;
	w24=w24+dw24;
        w45=w45+dw45;
	w35=w35+dw35;
	th3=th3+dth3;
	th4=th4+dth4;
	th5=th5+dth5;
					
					
     }
      epoch++;
}
	

}
           
        return errors ; 
       }
        
    
    
    
    @FXML
    private void train_press(ActionEvent event) throws IOException 
    {    if(First_frameController.how=="and"||First_frameController.how=="nand"||First_frameController.how=="nor"||First_frameController.how=="or")
        
    {  
        endx_x=0;
        starty_y=0;
        endx_y =0;
        starty_x=0 ;
        int  error0=0;int  error1=0;int  error2=0;int  error3=0;
        eboch_value=0;
        step1_initalization();
       // System.out.println(w1);System.out.println(w2);
        error_back= step2_activation();
        eboch_value++;
       // stope += error_back;
      /*  if((((int)(error_back)^2))== SSE)//not error_back its sum of errors for all iterations
        {
            
        }*/
        for(int i=0;i<=3;i++)
        {
           if(error_back[i]!=0&&i==0)error0=1;
           
           else if(error_back[i]!=0&&i==1)error1=1;
           else if(error_back[i]!=0&&i==2)error2=1;
           else if(error_back[i]!=0&&i==3)error3=1;
           else if(error_back[i]==0&&i==0)error0=0;
           else if(error_back[i]==0&&i==1)error1=0;
           else if(error_back[i]==0&&i==2)error2=0;
           else if(error_back[i]==0&&i==3)error3=0;
           
           
        }
        System.out.println("whileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
       while(error0!=0||error1!=0||error2!=0||error3!=0)///use SSE here the sum of squere error
       {
        
            eboch_value++;
           System.out.println(w1);  
           System.out.println(w2);
            
           
           error_back= step2_activation();
           for(int i=0;i<=3;i++)
        {
           if(error_back[i]!=0&&i==0)error0=1;
           
           else if(error_back[i]!=0&&i==1)error1=1;
           else if(error_back[i]!=0&&i==2)error2=1;
           else if(error_back[i]!=0&&i==3)error3=1;
           else if(error_back[i]==0&&i==0)error0=0;
           else if(error_back[i]==0&&i==1)error1=0;
           else if(error_back[i]==0&&i==2)error2=0;
           else if(error_back[i]==0&&i==3)error3=0;
           
           
        }
       }
       // Scanner in=new Scanner(System.in);
       System.out.println(eboch_value);
       
       result.setText("eboch value=");
        //endx_x=xp.getx_xlayout(); //endx_x*=w2;
        
       // starty_y=yp.gety_ylayout();//starty_y*=w1;
        
        endx_y=xp.getx_ylayout();//endx_x*=w1;
        System.out.println(endx_y);
        starty_x=yp.gety_xlayout();//starty_y*=w2;
        System.out.println(starty_x);
        //during equation for line
        starty_y=(threshould )/w2;//starty_y*=-1;
        starty_y+=75;
        System.out.println(starty_y);
        endx_x=(threshould   )/w1;//endx_x*=-1;
        endx_x+=328;
        System.out.println(endx_x);
       draw();
      
      /* line1.setStartX(starty_x);
       line1.setStartY(starty_y);
       line1.setEndX(endx_x);
       line1.setEndY(endx_y);
       line1.setStroke(Color.BLACK);*/
       
    }
    else if(First_frameController.how=="xor")
               {
                   step1_initalization();
                   /*System.out.println(w13);
                   System.out.println(w14);
                   System.out.println(w23);
                   System.out.println(w24);
                   System.out.println(w35);
                   System.out.println(w45);*/
                   
               
               }
         
        
        
        
        
        
        
    }
   /* public void start(Stage stage) throws IOException  {
        Pane root = new Pane();
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;"+"-fx-pref-width :589; " +
"     -fx-pref-height: 426;"+"-fx-background-image: url(imge/x_y.png\");");
        BackgroundImage backgroundx_y = new BackgroundImage( new Image( getClass().getResource("/imge/x_y.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background backgrounx_yimage = new Background(backgroundx_y);
       // ImagePattern pattern = new ImagePattern(backgrounx_yimage);
        root.setBackground(backgrounx_yimage);
        final Scene scene = new Scene(root,419, 426);
        
        scene.setFill(null);
        
        Line line = new Line();
        line.setStartX(202);
        line.setStartY(75);
        line.setEndX(328);
        line.setEndY(202);
         panel2.getChildren().add(line);
        root.getChildren().add(line);
        
        stage.setScene(scene);
        stage.show();
    }*/
    public void draw() throws IOException
    {
     GraphicsContext gc = canv.getGraphicsContext2D();
        drawShapes(gc);
        
          Stage stage = new Stage();
        //start(stage);
    }
   public void drawShapes(GraphicsContext gc)
   {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.strokeLine(starty_x, starty_y,endx_x, endx_y);
   }
    
}
 