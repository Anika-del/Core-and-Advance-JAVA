import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDataFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Psdude extends JPanel implements Runnable
{
    Thread thread;
    int i,j,k,p=0,q=0;
    String year,month,day,second,minute, hour;
    SimpleDataFormat sdf = new SimpleDataFormat("s",Locale.getDefault());
    Date cd;
    int xOrign = 375, xsec,ysec,xmin,xhr,yhr;
    private void clockLayout(Graphics g){
        //Layout Of CALENDER
    Calendar calendar = new GregorianCalendar();
    year = String.valueOf(calendar.get(Calendar.YEAR));
    month = String.valueOf(calendar.get(Calendar.MONTH)+1);
    day = String.valueOf(calendar.get(Calendar.DATE));
    second = String.valueOf(calendar.get(Calendar.SECOND));
    minute = String.valueOf(calendar.get(Calendar.MINUTE));
    hour = String.valueOf(calendar.get(Calendar.HOUR));
    g.setColor(Color.black);
    g.fillRoundRect(590,200,340,370,50,50);
    g.setColor(Color.pink);
    g.fillRoundRect(600,210,320,350,50,50);
    g.setColor(Color.black);
    g.fillRoundRect(620,280,80,50);
    g.fillRoundRect(710,280,80,50);
    g.fillRoundRect(800,280,100,50);
    g.fillRoundRect(620,350,80,50);
    g.fillRoundRect(710,350,80,50);
    g.fillRoundRect(800,350,80,50);

    ///////
    g.fillRoundRect(710,280,80,50);
    g.fillRoundRect(800,280,100,50);
    g.fillRoundRect(710,350,80,50);
    g.fillRoundRect(800,350,80,50);







    }
    
}
