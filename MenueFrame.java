
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenueFrame extends JFrame implements MouseListener , ActionListener {
    JFrame foodFrame;
    JLabel imgLabel;
    JButton spaghetti,pasta,meatball,salad,steak,chickenfried,burger,friedrice,pancake,tacos,ricebowl,pizza;
	public int i = 0; 
	int quantity=0;
    JButton cancelBtn,confirmBtn;
	Color color1,color2,color3,color4,color5,color6,color7,color8;
    ImageIcon img,imgCancelBtn,imgOrderBtn,imgSpaghetti,imgPasta,imgMeatball,imgSalad,imgSteak,imgChickenfried,imgBurger,imgFriedrice,imgPancake,imgTacos,imgRicebowl,imgPizza;
    String option;
	int foodIndex;
	Font myFont, myFont1,myFont2;
    JPanel panel;
	Users us;
	Food food;

    public MenueFrame(Food food) {
       
        super("Menu");    //Sets the title of the window
		this.setSize(458,708);   //Defines the window size as 650x650 pixels.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Ensures the program exits when the window is closed.
		this.setLocationRelativeTo(null); //Centers the window on the screen when it appears.
		this.us=us;
		
		
		//color control
	    color1=new Color(0,0,0); //blue
		color2=new Color(130,64,184);  //purple
		color3=new Color(255,255,255);//White 
		color4=new Color(250,250,250,0);//transparent 
		color5=new Color(92,64,51);//color for food name 
		color6=new Color(18,112,78); // deep green
		
		
		
		//Font Corntoll 
		
		myFont1=new Font("Calibri (Body)",Font.BOLD,15);
	    myFont2=new Font("Calibri (Body)",Font.BOLD,9);
	    //panel added 
		panel= new JPanel();  //Creates a new JPanel object.
		panel.setLayout(null); //Disables the layout manager, allowing manual positioning of components.
		                           //this.add() use for visibility 
								   
								   
								   
								   
        // Create checkboxes for food items


        imgSpaghetti = new ImageIcon("images/spaghetti.png");
        spaghetti = new JButton(imgSpaghetti);
		spaghetti.setBounds(17,50,129,132);
		spaghetti.setBackground(color6);
		spaghetti.addMouseListener(this);
		spaghetti.addActionListener(this);
		spaghetti.setOpaque(true);
		panel.add(spaghetti);
		
		imgPasta = new ImageIcon("images/pasta.png");
        pasta = new JButton(imgPasta);
		pasta.setBounds(156,50,129,132);
		pasta.setBackground(color6);
		pasta.addMouseListener(this);
		pasta.addActionListener(this);
		pasta.setOpaque(true);
		panel.add(pasta);
		
		imgMeatball = new ImageIcon("images/meatball.png");
        meatball = new JButton(imgMeatball);
		meatball.setBounds(295,50,129,132);
		meatball.addMouseListener(this);
		meatball.setBackground(color6);
		meatball.setOpaque(true);
		panel.add(meatball);

        imgSalad = new ImageIcon("images/salad.png");
        salad = new JButton(imgSalad);
		salad.setBounds(17,192,129,132);
		salad.addMouseListener(this);
		salad.addActionListener(this);
		salad.setBackground(color6);
		salad.setOpaque(true);
		panel.add(salad);
       
	    imgSteak = new ImageIcon("images/steak.png");
        steak = new JButton(imgSteak);
		steak.setBounds(156,192,129,132);
		steak.addMouseListener(this);
		steak.setBackground(color6);
		steak.setOpaque(true);
		panel.add(steak);
     
        imgChickenfried = new ImageIcon("images/chickenfried.png");
        chickenfried = new JButton(imgChickenfried);
		chickenfried.setBounds(295,192,129,132);
		chickenfried.addMouseListener(this);
		chickenfried.setBackground(color6);
		chickenfried.setOpaque(true);
		panel.add(chickenfried);
   
        imgBurger = new ImageIcon("images/burger.png");
        burger = new JButton(imgBurger);
		burger.setBounds(17,334,129,132);
		burger.addMouseListener(this);
		burger.setBackground(color6);
		burger.setOpaque(true);
		panel.add(burger);
       
	   
	    imgFriedrice = new ImageIcon("images/friedrice.png");
	    friedrice = new JButton(imgFriedrice);
		friedrice.setBounds(156,334,129,132);
		friedrice.addMouseListener(this);
		friedrice.setBackground(color6);
		friedrice.setOpaque(true);
		panel.add(friedrice);
  
        imgPancake = new ImageIcon("images/pancake.png");
        pancake = new JButton(imgPancake);
		pancake.setBounds(295,334,129,132);
		pancake.addMouseListener(this);
		pancake.setBackground(color6);
		pancake.setOpaque(true);
		panel.add(pancake);
        
        imgTacos = new ImageIcon("images/tacos.png");
        tacos = new JButton(imgTacos);
		tacos.setBounds(17,476,129,132);
		tacos.addMouseListener(this);
		tacos.setBackground(color6);
		tacos.setOpaque(true);
		panel.add(tacos);

        imgRicebowl = new ImageIcon("images/ricebowl.png");
        ricebowl = new JButton(imgRicebowl);
		ricebowl.setBounds(156,476,129,132);
		ricebowl.addMouseListener(this);
		ricebowl.setBackground(color6);
		ricebowl.setOpaque(true);
		panel.add(ricebowl);

        imgPizza = new ImageIcon("images/pizza.png");
        pizza = new JButton(imgPizza);
		pizza.setBounds(295,476,129,132);
		pizza.addMouseListener(this);
		pizza.addActionListener(this);
		pizza.setBackground(color6);
		pizza.setOpaque(true);
		panel.add(pizza);

         

        // Create a text field for special instructions
        // Create a calculate button
        //calculateButton = new JButton("Calculate Bill");
		
        

        
		
        imgCancelBtn = new ImageIcon("images/cancelBtn.png");
	    cancelBtn=new JButton(imgCancelBtn);
		cancelBtn.setBounds(0,0,40,40);
		//confirmBtn.setBackground();
		cancelBtn.addMouseListener(this);
		cancelBtn.addActionListener(this);
		panel.add(cancelBtn);
		
        
		imgOrderBtn =new ImageIcon("images/OrderPlace.png");
		confirmBtn=new JButton(imgOrderBtn);
		confirmBtn.setBounds(140,620,186,50);
		confirmBtn.addMouseListener(this);
		confirmBtn.addActionListener(this);
		panel.add(confirmBtn);
		
		
		
		img =new ImageIcon("images/Menu.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,458,708);
		panel.add(imgLabel);

		                               //Adds the JPanel to the main window (JFrame), so it becomes part of the visible interface
        this.add(panel);
		this.setVisible(true);
		
       }
	   
	   
	   public void mouseClicked(MouseEvent me){
		   
           if (me.getSource() ==cancelBtn){
		          FristeFrame db = new FristeFrame(us);
					db.setVisible(true);
					this.setVisible(false);
		   }
		     else  if (me.getSource() ==confirmBtn){
		       JOptionPane.showMessageDialog(this, "ORDER CONFIRMD ");
		 switch (foodIndex) {
                case 0: food.setSpaghettiValue(quantity); break;
                case 1: food.setPastaValue(quantity); break;
                case 2: food.setMeatballValue(quantity); break;
                case 3: food.setSaladValue(quantity); break;
                case 4: food.setSteakValue(quantity); break;
                case 5: food.setChickenfriedValue(quantity); break;
                case 6: food.setBurgerValue(quantity); break;
                case 7: food.setFriedriceValue(quantity); break;
                case 8: food.setPancakeValue(quantity); break;
                case 9: food.setTacosValue(quantity); break;
                case 10: food.setRicebowlValue(quantity); break;
                case 11: food.setPizzaValue(quantity); break;
                default: break;
            }
			 int[] foodQuantities = new int[]{
                food.getSpaghettiValue(),
                food.getPastaValue(),
                food.getMeatballValue(),
                food.getSaladValue(),
                food.getSteakValue(),
                food.getChickenfriedValue(),
                food.getBurgerValue(),
                food.getFriedriceValue(),
                food.getPancakeValue(),
                food.getTacosValue(),
                food.getRicebowlValue(),
                food.getPizzaValue()
            };
            food.setFoodQuantities(foodQuantities);
			   
			   
			   
 	        BillingFrame bf=new BillingFrame(food);
			bf.setVisible(true);
			this.setVisible(false);
			
		   }
	else if (me.getSource() == spaghetti) {
    QuantityDialog ab = new QuantityDialog(foodIndex, food); 
    ab.setVisible(true);
    this.setVisible(false);
}
	else if (me.getSource() == pasta) {
    QuantityDialog ab = new QuantityDialog(1,food); 
    ab.setVisible(true);
    this.setVisible(false);
    }
	else if (me.getSource() == meatball) {
    QuantityDialog ab = new QuantityDialog(2,food);  
    ab.setVisible(true);
    this.setVisible(false);
    }
	else if (me.getSource() == salad) {
    QuantityDialog ab = new QuantityDialog(3,food);  
    ab.setVisible(true);
    this.setVisible(false);
    }
	else if (me.getSource() == steak) {
    QuantityDialog ab = new QuantityDialog(4,food);  
    ab.setVisible(true);
    this.setVisible(false);
    }
	else if (me.getSource() == chickenfried) {
    QuantityDialog ab = new QuantityDialog(5,food);  
    ab.setVisible(true);
    this.setVisible(false);
    }
	else if (me.getSource() == burger) {
    QuantityDialog ab = new QuantityDialog(6,food);  
    ab.setVisible(true);
    this.setVisible(false);
    } 
	else if (me.getSource() == friedrice) {
    QuantityDialog ab = new QuantityDialog(7,food);  
    ab.setVisible(true);
    this.setVisible(false);
    } 
	else if (me.getSource() == pancake) {
    QuantityDialog ab = new QuantityDialog(8,food);  
    ab.setVisible(true);
    this.setVisible(false);
    } 
	else if (me.getSource() == tacos) {
    QuantityDialog ab = new QuantityDialog(9,food);  
    this.setVisible(false);
    }
	else if (me.getSource() == ricebowl) {
    QuantityDialog ab = new QuantityDialog(10,food);  
    ab.setVisible(true);
    this.setVisible(false);
    } 
	else if (me.getSource() == pizza) {
    QuantityDialog ab = new QuantityDialog(11,food);  
    ab.setVisible(true);
    this.setVisible(false);
}
		   
	   }


	public void  mousePressed(MouseEvent me){}
	public void  mouseReleased(MouseEvent me) {}
	public void  mouseEntered(MouseEvent me){
		if(me.getSource() ==cancelBtn){
			cancelBtn.setBackground(Color.WHITE);
			cancelBtn.setForeground(Color.RED);
			
		}else if (me.getSource()==confirmBtn){
			confirmBtn.setBackground(Color.WHITE);
			confirmBtn.setForeground(Color.RED);
		}
	}
	public void  mouseExited(MouseEvent me){
		if(me.getSource() ==cancelBtn){
			cancelBtn.setBackground(Color.RED);
			cancelBtn.setForeground(Color.WHITE);
			
		}else if (me.getSource()==confirmBtn){
			confirmBtn.setBackground(Color.RED);
			confirmBtn.setForeground(Color.WHITE);
		}
	}
     public void actionPerformed(ActionEvent ae){
		 
		// String command =ae.getActionCommand();
		 
		 
	 }
	 
}
		
		         
			
		
				   


    







