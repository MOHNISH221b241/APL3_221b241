class Soda extends Decorator{
    Soda(Offering offering){
        this.offering=offering;
    }
    int getPrice(){
        return offering.getPrice()+10;
    }
    String getName(){
        return offering.getName()+" with Soda";
    }
}