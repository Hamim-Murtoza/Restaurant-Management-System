
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class QuantityDialog extends JFrame implements MouseListener, ActionListener{

    private int quantity = 0;                                                   // Initialize the quantity
    private int foodprice[] = {6, 3, 4, 8, 25, 7, 6, 6, 3, 5, 4, 6};            // Prices for each food
    private String foodname[] = {"Spaghetti", "Pasta", "Meatball", "Salad", "Steak", "Chicken Fried", "Burger", "Fried Rice", "Pancake", "Tacos", "Rice Bowl", "Pizza"}; // Food names
    private int i = 0; // Index to track the current food item
    JPanel panel;
    JButton plusBtn, minusbtn, confirmBtn, cancelBtn,homeBtn;
    Font myFont;
    ImageIcon imgCancelBtn, imgOrderBtn, imgplusBtn, imgminusBtn,homeimg;
    JTextArea quantityTxt, priceTxt;
    JLabel imgLabel;
	Color color1;
	Users us;
	Food food;
	

    public QuantityDialog(int foodIndex, Food food) {
        super( " Quantity");
        this.i = foodIndex; // Set the current food index
        this.setSize(458, 708);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.us=us;
        myFont = new Font("Times New Roman", Font.PLAIN, 25);
		
		color1= new Color (255,255,255); //Transparant 

        panel = new JPanel();
        panel.setLayout(null);
		
		/*int[] foodQuantities = new int[]{
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
    };*/

        // Cancel Button
        imgCancelBtn = new ImageIcon("images/Back.png");
        cancelBtn = new JButton(imgCancelBtn);
        cancelBtn.setBounds(20, 550, 114, 49);
        cancelBtn.addMouseListener(this);
        cancelBtn.addActionListener(this);
        panel.add(cancelBtn);

        // Confirm Button
        imgOrderBtn = new ImageIcon("images/confirmBtn.png");
        confirmBtn = new JButton(imgOrderBtn);
        confirmBtn.setBounds(200, 550, 220, 49);
        confirmBtn.addMouseListener(this);
        confirmBtn.addActionListener(this);
        panel.add(confirmBtn);

        // Plus Button
        imgplusBtn = new ImageIcon("images/plusBtn.png");
        plusBtn = new JButton(imgplusBtn);
        plusBtn.setBounds(280, 50, 101, 50);
        plusBtn.addMouseListener(this);
        plusBtn.addActionListener(this);
        panel.add(plusBtn);

        // Text field for quantity
        quantityTxt = new JTextArea("Set Quantity: " + quantity);
        quantityTxt.setBounds(94, 50, 180, 50);
		quantityTxt.setBackground(color1);
        quantityTxt.setFont(myFont);
        panel.add(quantityTxt);
        
        // Price field
        priceTxt = new JTextArea("You Select: " + foodname[i] + " " + quantity + " pcs, Total: " + quantity * foodprice[i] + "$");
        priceTxt.setBounds(20, 250,410, 50);
		priceTxt.setBackground(color1);
        priceTxt.setFont(myFont);
        panel.add(priceTxt);

        // Minus Button
        imgminusBtn = new ImageIcon("images/minusBtn.png");
        minusbtn = new JButton(imgminusBtn);
        minusbtn.setBounds(20, 50, 74, 50);
        minusbtn.addMouseListener(this);
        minusbtn.addActionListener(this);
        panel.add(minusbtn);
		
		 homeimg = new ImageIcon("images/homeBtn.png");
        homeBtn = new JButton(homeimg);
        homeBtn.setBounds(329,0, 129, 50);
        homeBtn.addMouseListener(this);
        homeBtn.addActionListener(this);
        panel.add(homeBtn);

        // Background Image
        imgLabel = new JLabel(new ImageIcon("images/rsz_2black_white_clean_minimalist_food_video_promo_your_story.jpg"));
        imgLabel.setBounds(0, 0, 458, 708);
        panel.add(imgLabel);

        this.add(panel);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == confirmBtn) {
            if (quantity > 0) {
                
                
                JOptionPane.showMessageDialog(this, foodname[i] + " Quantity Confirmed: " + quantity);
				
				
            }
        }
		 if (me.getSource() ==homeBtn ) {
            
                FristeFrame f=new FristeFrame(us);
				f.setVisible(true);
				this.setVisible(false);
                
                
				
				
            }
        }
		
    

    // ActionListener methods
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == plusBtn) {
            if (quantity < 5) {
                quantity++; // Increment the value
            } else {
                JOptionPane.showMessageDialog(this, "You cannot buy more than 5!!");
            }
        } else if (ae.getSource() == minusbtn) {
            if (quantity > 0) {
                quantity--; // Decrement the value
            }
        } else if (ae.getSource() == cancelBtn) {
            MenueFrame abc = new MenueFrame(food); // Go back to menu
            abc.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == confirmBtn) {
            // Update the price when confirmed
            int currentPrice = quantity * foodprice[i];
            priceTxt.setText("You Select: " + foodname[i] + "  " + quantity + " pcs, Total: " + currentPrice + "$");
      

        }
		
		

        // Update the quantity display
        quantityTxt.setText(quantity + " - " + foodname[i] + " pcs");
    }

    // Other MouseListener methods
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
}
