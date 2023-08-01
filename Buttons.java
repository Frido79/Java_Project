import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import javax.swing.event.MouseInputListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
public class Buttons extends Applet implements ActionListener,MouseInputListener{
    int x , y , a , b , c , d , f , h ,k , l , i , m , q1 , q2 , q3 , a1 ,a2 , a3 , k1 ;
    char shape ;
    Color q ;
    Button w2 =new Button("Filled");
    Button w1 =new Button("hollow");
    Button s1 =new Button("Circle");
    Button s2 =new Button("Rectangle");
    Button s3 =new Button("Line");
    Button E =new Button("Erase");
    Button B =new Button("    ");
    Button R =new Button("    ");
    Button G =new Button("    ");
    Button BL =new Button("    ");
    public void init(){
        x = 0;
        y = 0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        f = 0;
        h = 0;
        k = 0;
        i = 0;
        l = 0;
        m = 0;
// ============================================== Buttons ============================================= 
        // add(w1);
        // add(w2);
        add(s1);
        add(s2);
        add(s3);
        add(E);
        add(B);
        add(R);
        add(G);
        add(BL);
        BL.setBackground(Color.black);
        B.setBackground(Color.BLUE);
        R.setBackground(Color.RED);
        G.setBackground(Color.GREEN);
// ============================================================================================================
        s1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                shape = 'c';
            }
            
        });
        s2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                shape = 'r';
            }
            
        });
        s3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                shape = 'l';
            }
            
        });
        
        E.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                q = Color.white;
            }
            
        });
        R.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                q = Color.RED;
            }
            
        });
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q = Color.BLUE;
            }
            
        });
        G.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                q = Color.GREEN;    
            }
            
        });
        BL.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                q = Color.BLACK;    
            }
            
        });
        this.addMouseListener(this);
        BL.addMouseListener(this);
        s1.addMouseListener(this);
        s2.addMouseListener(this);
        s3.addMouseListener(this);
        G.addMouseListener(this);
        R.addMouseListener(this);
        B.addMouseListener(this);
        this.addMouseMotionListener(this);

    }
    
//============================================= paint ===================================================
    public void paint(Graphics g){
       g.setColor(q);
       switch(shape){
        case 'c' :{
            g.drawOval(100,100,200,200);
            break;
        }
    
        case 'r' :{
            g.drawRect(100, 100, 300, 300);
            break;
            }
        case 'l':{
            g.drawLine(100, 100, 200, 200);break;
            }
        }   
    }
//========================================== ActionListener =====================================================
        

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == E){
                a1 = 255 ;
                a2 = 255 ;
                a3 = 255 ;
                repaint();
            }
            
            if (e.getSource() == s1){
                k1 = 1;
            }
            if (e.getSource() == s2){
                k1 = 2;
            }
            if(e.getSource() == s3){
                k1 = 3 ;
            }

    }
    
//========================================== MouseEvents ======================================
   
        @Override
        public void mouseDragged(MouseEvent e) {
            // a = e.getX();
            // b = e.getY();
            
                
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            repaint();
        }

        
    
    

        @Override
        public void mouseClicked(MouseEvent e) {
            repaint();
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            repaint();
            //     if(k1 == 1){
        //         x = e.getX();
        //         y = e.getY(); 
        //     }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
                
        }

}