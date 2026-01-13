package assets.actors;

import assets.GameAsset;
import javax.swing.ImageIcon;

public class Tower extends GameAsset {
    
    int upgradeCost, upgradeCostFlowers, damage, fireRate, range, TowerType, upgradeStage;
    
    public Tower(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = 500;
        this.upgradeCostFlowers = 3;
        this.damage = 20;
        this.fireRate = 2;
        this.range = 3;
        this.TowerType = 1;
        this.upgradeStage = 1;
        
    }

    public Tower(int upgradeCost, int upgradeCostFlowers, int damage, int fireRate, int range, int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
        this.upgradeCost = upgradeCost;
        this.upgradeCostFlowers = upgradeCostFlowers;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
        this.TowerType = TowerType;
        this.upgradeStage = upgradeStage;
    }
    
    
    
    
    
    public void values(){
    int[] [] [] upgrades = [[[1,2,3,4],[1,2,3,4],[1,2,3,4]],
                            [[1,2,3,4],[1,2,3,4],[1,2,3,4]],
                            [[1,2,3,4],[1,2,3,4],[1,2,3,4]]];
    
    }
    
    public void shoot () {

    }
    
    
    
    
    
    public void upgrade (String Tower) {
        int x = Tower.TowerType;
        int y = Tower.upgradeStage;
        Tower.upgradeStage = Tower.upgradeStage+1;
        Tower.damage = Tower.damage + values.upgrades[x][y][1];
        Tower.fireRate = Tower.fireRate + values.upgrades[x][y][2];
        Tower.range = Tower.fireRate + values.range[x][y][3];
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public int getUpgradeCostFlowers() {
        return upgradeCostFlowers;
    }

    public int getDamage() {
        return damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getRange() {
        return range;
    }
    
    
    
}
