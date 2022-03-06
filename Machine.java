package com.company;

import java.util.Arrays;

public class Machine {
    private Item[][]items;

    public Machine(Item[][] items){
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length ; i++) {
            for (int j = 0; j <items[i].length ; j++) {
                this.items[i][j]= new Item(items[i][j]);
            }
        }

    }

    public Item getItems(int indexX,int indexY) {
        return new Item(this.items[indexX][indexY]);
    }

    public void setItems(int indexX,int indexY,Item spot) {
        this.items[indexX][indexY] = new Item(spot);
    }

    public String toString(){
        String temp="\n";
        for (int i = 0; i < this.items.length; i++) {
            temp+="\t";
            for (int j = 0; j <this.items[i].length ; j++) {
                if(this.items[i][j].equals(null)){
                    temp+= "Empty\n";
                }
                else{
                   String temp2= this.items[i][j].toString();
                    temp+=temp2+" ";
                }
            }
            temp+="\n\n";
        }
        temp += "\t************************************************";
        return temp;
    }




    public boolean dispense(int row,int spot){
if(this.items[row][spot].getQuantity()>0){
    this.items[row][spot].setQuantity(this.items[row][spot].getQuantity()-1);
    return true;
}

else{
    return false;
}
    }
    /**
     * Function name – dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     *      • if so: decreases its quantity by one and returns true.
     *      • otherwise: returns false.
     */



}
