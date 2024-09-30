
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BillingFrame extends JFrame implements ActionListener {

    JPanel panel;
    JButton deleteBtns[] = new JButton[12]; // Delete buttons for each item
    JLabel priceLabels[] = new JLabel[12]; // Labels to show the prices
    JLabel totalLabel; // Label to show the total bill
    int foodQuantities[]; // Array to store the food quantities
    int foodPrices[] = {6, 3, 4, 8, 25, 7, 6, 6, 3, 5, 4, 6}; // Prices of the food items
    String foodNames[] = {"Spaghetti", "Pasta", "Meatball", "Salad", "Steak", "Chicken Fried", "Burger", "Fried Rice", "Pancake", "Tacos", "Rice Bowl", "Pizza"}; 
    Food food;
    // int []foodQuantities=new foodQuantities[12];
	// Reference to the Food object
	
	
	

    public BillingFrame(Food food) {
		
        super("Bill Frame");
        this.food = food; // Set the food object to access its values
        this.setSize(458, 708);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.food=food;
        // Initialize food quantities from the Food object
        

        panel = new JPanel();
        panel.setLayout(null);

        int yPos = 50; 
        int totalPrice = 0;

        for (int i = 0; i < 12; i++) {
            if (foodQuantities[i] > 0) { 

                // Create price label for each food
                priceLabels[i] = new JLabel(foodNames[i] + " - " + foodQuantities[i] + " pcs: $" + (foodQuantities[i] * foodPrices[i]));
                priceLabels[i].setBounds(50, yPos, 300, 40);
                panel.add(priceLabels[i]);

                // Add delete button for each food item
                deleteBtns[i] = new JButton("Delete");
                deleteBtns[i].setBounds(350, yPos, 80, 40);
                deleteBtns[i].addActionListener(this);
                panel.add(deleteBtns[i]);

                yPos += 50; // Move the y position down for the next item

                // Add the total price
                totalPrice += foodQuantities[i] * foodPrices[i];
            }
        }

        // Total price label
        totalLabel = new JLabel("Total Price: $" + totalPrice);
        totalLabel.setBounds(50, yPos, 300, 40);
        panel.add(totalLabel);

        // Add a back button
        JButton backBtn = new JButton("Back");
        backBtn.setBounds(50, yPos + 50, 100, 40);
        backBtn.addActionListener(e -> {
            MenueFrame menuFrame = new MenueFrame(food); // Go back to menu
            menuFrame.setVisible(true);
            this.setVisible(false);
        });
        panel.add(backBtn);
		
		
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

        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < deleteBtns.length; i++) {
            if (ae.getSource() == deleteBtns[i]) {
                // Remove the item from the bill
                foodQuantities[i] = 0; // Set the quantity to 0
                panel.remove(priceLabels[i]); // Remove the label
                panel.remove(deleteBtns[i]); // Remove the delete button

                // Recalculate the total
                int newTotal = 0;
                for (int j = 0; j < 12; j++) {
                    newTotal += foodQuantities[j] * foodPrices[j];
                }
                totalLabel.setText("Total Price: $" + newTotal);

                panel.repaint();
                break;
            }
        }
    }
}
