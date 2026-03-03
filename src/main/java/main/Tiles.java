/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author guest-xvollm
 */
public class Tiles {
    private int x;
    private int y;
    private int ID;
    private boolean isPlaceble;
    public int id;
    public Tiles(int x, int y, int ID, boolean isPlaceble) {
        this.x = x;
        this.y = y;
        this.ID = ID;
        this.isPlaceble = isPlaceble;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isIsPlaceble() {
        return isPlaceble;
    }

    public void setIsPlaceble(boolean isPlaceble) {
        this.isPlaceble = isPlaceble;
    }
    
    
}
