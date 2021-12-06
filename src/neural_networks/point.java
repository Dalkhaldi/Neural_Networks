/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import static javax.swing.Spring.width;
import java.util.Random;
import neural_networks.Second_blockController;
/**
 *
 * @author jcc
 */
public class point
{
     
    int x;
    int y;
    int x_y0;
    int x_y1;
    int value;
     double x_xlayout;double x_ylayout;
    double y_xlayout;double y_ylayout;
    double x_y0_xlayout;    double x_y0_ylayout;
    double x_y1_xlayout;double x_y1_ylayout;
     
    point()
    {
         
        
    }
    public void setxid(int id)
    {
         x=id;
    }
    public void setyid(int id)
    {
         y=id;
    }
    public void setx_y0id(int id)
    {
         x_y0=id;
    }
    public void setx_y1id(int id)
    {
         x_y1=id;
    }
     public int getxid()
    {
       return x;
    }
    public int getyid()
    {
         return y;
    }
    public int getx_y0id()
    {
        return x_y0;
    }
    public int getx_y1id()
    {
        return x_y1;
    }
    public void setx_xlayout(double  x)
    {
        x_xlayout=x;
    }
     public void setx_ylayout(double  y)
    {
        x_ylayout=y;
    }
      public double getx_xlayout()
    {
        return x_xlayout;
    }
    public double getx_ylayout()
    {
        return x_ylayout;
    }
    
    public void sety_xlayout(double  x)
    {
        y_xlayout=x;
    }
     public void sety_ylayout(double  y)
    {
        y_ylayout=y;
    }
      public double gety_xlayout()
    {
        return y_xlayout;
    }
    public double gety_ylayout()
    {
        return y_ylayout;
    }
}
