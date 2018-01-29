package core.agents;


import core.misc.Environment;
import core.misc.Logger;

import java.awt.*;

public abstract class Agent {
    public static int SQUARE = 1;
    public static int TRIANGLE = 2;
    public static int ROUND = 3;

    private static int currentId = 0;
    public int id;

    private int posX;
    private int posY;
    private Color color;
    private boolean hasChanged;
    private boolean isSelected = false;
    private boolean isAlive = true;

    protected Environment environment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agent agent = (Agent) o;

        return id == agent.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public Agent(Environment environment) {
        this.environment = environment;
        this.id = currentId;
        currentId++;
    }

    public void init(int posX, int posY) {
        this.isAlive = true;
        this.posX = posX;
        this.posY = posY;
    }

    public abstract int getShape();

    public void decide() {
        hasChanged = false;
    }

    private void setChanged(boolean hasChanged) {
        this.hasChanged = hasChanged;
    }

    protected void hasChanged() {
        this.hasChanged = true;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public Color getColor() {
        if (isSelected) {
            return Color.BLUE;
        }
        if (color == null) {
            return Color.GRAY;
        }

        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected void logAgent() {
        if (hasChanged) {
            Logger.log(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Agent;" + posY + ";" + posY;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
