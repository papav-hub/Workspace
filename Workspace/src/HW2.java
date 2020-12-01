import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.event.*;

public class HW2 extends JFrame{
   private JButton colorLabel;
   private JButton colorLabelone;
   private JButton colorLabeltwo;
   public JRadioButton radio[];
   public ButtonGroup group;
   public String radioname[] = {"EAST", "WEST", "SOUTH"};
   public JPanel north;
   public JPanel center;
   public int r;
   public int g;
   public int b;

   private JSlider [] sl = new JSlider [3];
   
   public HW2() {
      setTitle("슬라이더와 ChangeEvent 예제");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new BorderLayout(30, 20));
      
      colorLabel = new JButton(" SLIDER EXAMPLE ");
      colorLabelone = new JButton(" SLIDER EXAMPLE ");
      colorLabeltwo = new JButton(" SLIDER EXAMPLE ");
      
      JRadioButton radio[] = new JRadioButton[3];
      ButtonGroup group = new ButtonGroup();
      north = new JPanel();
      for(int i=0; i<radio.length; i++){
          radio[i] = new JRadioButton(radioname[i]);
          group.add(radio[i]);
          north.add(radio[i]);
        }
       north.setBackground(Color.gray);
       radio[2].setSelected(true);
       for(int i=0; i<radio.length; i++){
           radio[i].addItemListener(new MyI());
        }
       c.add(north, BorderLayout.NORTH);
      
       
       center = new JPanel();
       center.setLayout(new FlowLayout());
      for(int i=0; i<sl.length; i++) {
         sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
         sl[i].setPaintLabels(true);
         sl[i].setPaintTicks(true);
         sl[i].setPaintTrack(true);
         sl[i].setMajorTickSpacing(50);
         sl[i].setMinorTickSpacing(10);
         sl[i].addChangeListener(new MyChangeListener());
         center.add(sl[i]);
      }


      sl[0].setForeground(Color.RED);
      sl[1].setForeground(Color.GREEN);
      sl[2].setForeground(Color.BLUE);
      
      c.add(center, BorderLayout.CENTER);
      
      int r = sl[0].getValue(); 
      int g = sl[1].getValue(); 
      int b = sl[2].getValue(); 

      colorLabel.setOpaque(true); 
      colorLabel.setBackground(new Color(r,g,b));
      c.add(colorLabel, BorderLayout.SOUTH);
      
      colorLabelone.setOpaque(true); 
      colorLabelone.setBackground(new Color(r,g,b));
      c.add(colorLabelone, BorderLayout.WEST);
      
      colorLabeltwo.setOpaque(true); 
      colorLabeltwo.setBackground(new Color(r,g,b));
      c.add(colorLabeltwo, BorderLayout.EAST);
      
      setSize(450,300);
      setVisible(true);
   }

   class MyChangeListener implements ChangeListener {
	      public void stateChanged(ChangeEvent e) {
	         r = sl[0].getValue();
	         g = sl[1].getValue();
	         b = sl[2].getValue();
	         colorLabel.setBackground(new Color(r,g,b));
	         colorLabelone.setBackground(new Color(r,g,b));
	         colorLabeltwo.setBackground(new Color(r,g,b));
	      }
	  }
   
   class MyI implements ItemListener{
	   public void itemStateChanged(ItemEvent e) {

		   /*radio[0] = (JRadioButton)e.getSource();
		   radio[1] = (JRadioButton)e.getSource();
		   radio[2] = (JRadioButton)e.getSource();
		   
		   r = sl[0].getValue();
	         g = sl[1].getValue();
	         b = sl[2].getValue();
		   
		   if(e.getStateChange() == ItemEvent.DESELECTED) {
			   return;}
		   
				if(radio[1].isSelected()) {
			     colorLabel.setBackground(new Color(r,g,b));
			   }else if(radio[1].isSelected()) {
			     colorLabelone.setBackground(new Color(r,g,b));
			   }else if(radio[2].isSelected()) {
			     colorLabeltwo.setBackground(new Color(r,g,b));
			   }*/
		   

	   }

   }
   
   public static void main(String [] args) {
	      new HW2();
	   }
	  
	
	}