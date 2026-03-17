
package gamelogic;


public class Shop {
    
    int money, flowers, mango;

    public Shop(int money, int flowers, int mango) {
        this.money = money;
        this.flowers = flowers;
        this.mango = mango;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFlowers() {
        return flowers;
    }

    public void setFlowers(int flowers) {
        this.flowers = flowers;
    }
    public int getMango() {
        return mango;
    }

    public void setMango(int mango) {
        this.mango = mango;
    }
    
}
