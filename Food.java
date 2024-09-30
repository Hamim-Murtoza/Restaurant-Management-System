
import java.lang.*;
public class Food {
    private int spaghettiValue;
    private int pastaValue;
    private int meatballValue;
    private int saladValue;
    private int steakValue;
    private int chickenfriedValue;
    private int burgerValue;
    private int friedriceValue;
    private int pancakeValue;
    private int tacosValue;
    private int ricebowlValue;
    private int pizzaValue;
	
	
	
		
	



    // Constructor
    public Food(int spaghettiValue, int pastaValue, int meatballValue, int saladValue,
                int steakValue, int chickenfriedValue, int burgerValue, int friedriceValue,
                int pancakeValue, int tacosValue, int ricebowlValue, int pizzaValue) {
        this.spaghettiValue = spaghettiValue;
        this.pastaValue = pastaValue;
        this.meatballValue = meatballValue;
        this.saladValue = saladValue;
        this.steakValue = steakValue;
        this.chickenfriedValue = chickenfriedValue;
        this.burgerValue = burgerValue;
        this.friedriceValue = friedriceValue;
        this.pancakeValue = pancakeValue;
        this.tacosValue = tacosValue;
        this.ricebowlValue = ricebowlValue;
        this.pizzaValue = pizzaValue;
    }

    // Getter methods for each food item
    public int getSpaghettiValue() {
        return spaghettiValue;
    }

    public int getPastaValue() {
        return pastaValue;
    }

    public int getMeatballValue() {
        return meatballValue;
    }

    public int getSaladValue() {
        return saladValue;
    }

    public int getSteakValue() {
        return steakValue;
    }

    public int getChickenfriedValue() {
        return chickenfriedValue;
    }

    public int getBurgerValue() {
        return burgerValue;
    }

    public int getFriedriceValue() {
        return friedriceValue;
    }

    public int getPancakeValue() {
        return pancakeValue;
    }

    public int getTacosValue() {
        return tacosValue;
    }

    public int getRicebowlValue() {
        return ricebowlValue;
    }

    public int getPizzaValue() {
        return pizzaValue;
    }

    // Setter methods for each food item (if needed)
    public void setSpaghettiValue(int spaghettiValue) {
        this.spaghettiValue = spaghettiValue;
    }

    public void setPastaValue(int pastaValue) {
        this.pastaValue = pastaValue;
    }

    public void setMeatballValue(int meatballValue) {
        this.meatballValue = meatballValue;
    }

    public void setSaladValue(int saladValue) {
        this.saladValue = saladValue;
    }

    public void setSteakValue(int steakValue) {
        this.steakValue = steakValue;
    }

    public void setChickenfriedValue(int chickenfriedValue) {
        this.chickenfriedValue = chickenfriedValue;
    }

    public void setBurgerValue(int burgerValue) {
        this.burgerValue = burgerValue;
    }

    public void setFriedriceValue(int friedriceValue) {
        this.friedriceValue = friedriceValue;
    }

    public void setPancakeValue(int pancakeValue) {
        this.pancakeValue = pancakeValue;
    }

    public void setTacosValue(int tacosValue) {
        this.tacosValue = tacosValue;
    }

    public void setRicebowlValue(int ricebowlValue) {
        this.ricebowlValue = ricebowlValue;
    }

    public void setPizzaValue(int pizzaValue) {
        this.pizzaValue = pizzaValue;
    }
	 public void setFoodQuantities(int[] quantities) {
        this.spaghettiValue = quantities[0];
        this.pastaValue = quantities[1];
        this.meatballValue = quantities[2];
        this.saladValue = quantities[3];
        this.steakValue = quantities[4];
        this.chickenfriedValue = quantities[5];
        this.burgerValue = quantities[6];
        this.friedriceValue = quantities[7];
        this.pancakeValue = quantities[8];
        this.tacosValue = quantities[9];
        this.ricebowlValue = quantities[10];
        this.pizzaValue = quantities[11];
    }
	
	
}
