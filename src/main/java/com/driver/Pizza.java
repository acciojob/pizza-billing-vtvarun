package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private boolean wantToppings;

    private boolean wantExtraCheese;

    private boolean isTakeWay;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        //initially, customer has not demanded anything
        this.wantToppings = false;
        this.wantExtraCheese = false;
        this.isTakeWay = false;
        if(this.isVeg){
            price = 300; // Base price of veg pizza
        } else{
            price = 400; // Base price of non veg pizza
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!wantExtraCheese){
            price += 80;
        }
        wantExtraCheese = true; // customer has already asked for the extra cheese. do not add anymore
    }

    public void addExtraToppings(){
        if(!wantToppings){
            if(isVeg) price += 70; // for veg toppings cost : 70
            else price += 120; // for non veg toppings cost : 120
        }

        wantToppings = true;
    }

    public void addTakeaway(){
        if(!isTakeWay) price += 20;

        isTakeWay = true;
    }

    public String getBill(){
        if(isVeg){
            bill += "Base Price Of The Pizza: 300\n";
        } else {
            bill += "Base Price Of The Pizza: 400\n";
        }

        if(wantExtraCheese){
            bill += "Extra Cheese Added: 80\n";
        }

        if(wantToppings){
            if(isVeg) bill += "Extra Toppings Added: 70\n";
            else bill += "Extra Toppings Added: 120\n";
        }

        if(isTakeWay){
            bill += "Paperbag Added: 20\n";
        }

        bill += "Total Price: "+price+"\n";

        return this.bill;
    }
}
