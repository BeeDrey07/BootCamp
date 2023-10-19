package lesson8.exercise2;

public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';

    public void displayItem() {
        System.out.println("Item : " + desc + "\nQuantity : " + quantity + "\nPrice : " + price);
    }

    public void setItemFields(String desc, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    public int setItemFields(String desc, int quantity, double price, char colorCode) {
        if (colorCode != ' ') {
            this.colorCode = colorCode;
            setItemFields(desc, quantity, price);
            return 1;
        } else {
            return -1;
        }
    }
}
