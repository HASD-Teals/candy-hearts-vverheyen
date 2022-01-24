public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String saying;
    private int calories;
    private double cost;
    private boolean available;
    private int stock;

    //Default Constructor
    public Heart() {
        this.color = "";
        this.size = 0;
        this.saying = "";
        this.calories = 0;
        this.cost = 0;
        this.available = false;
        this.stock = 0;
    } 
    //Overloaded Constructor 
    public Heart(String color, int size, String saying, int calories, double cost, boolean available, int stock) {
        this.color = color;
        this.size = size;
        this.saying = saying;
        this.calories = calories;
        this.cost = cost;
        this.available = available;
        this.stock = stock;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    public int getSize() {
        return this.size;
    }
    public String getSaying() {
        return this.saying;
    }
    public int getCalories() {
        return this.calories;
    }
    public double getCost() {
        return this.cost;
    }
    public boolean getAvailable() {
        return this.available;
    }
    public int getStock() {
        return this.stock;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setSaying(String saying) {
        this.saying = saying;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void adjCost(double change) {
        this.cost = cost * change;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void inStock(int stock) {
        this.stock = stock;
        if (stock > 0) {
            this.available = true;
        }
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void adjStock(int stock) {
        this.stock = stock;
        if (stock > 0) {
            this.available = true;
        }
    }


    // METHODS
    public String getReport() {
        return color +", "+ size +", "+ saying +", "+ calories +", "+ cost +", "+ available +", "+ stock; 
        // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}

