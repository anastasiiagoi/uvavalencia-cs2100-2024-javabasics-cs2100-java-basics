public class Bagels {
    private boolean toasted;
    private boolean sliced;
    private int price;


    class EverythingBagel extends Bagels {
        public boolean plainspread;
        public boolean poppyseed;
        public boolean garlic;
        public boolean salt;

    }

    class PlainBagel extends Bagels {
        private boolean butter;

    }


    class NorwegianBagel extends Bagels {
        public boolean plainspread;
        public boolean lox; 
        public boolean onions;
        public boolean capers;
    }

    class StrawberryBagel extends Bagels {
        public boolean strawberryspread; 
        public boolean strawberrybread;
    }


    public boolean gettoasted() {
        return toasted;
    }

    public boolean getsliced() {
        return sliced;
    }

        public int getPrice() {
        return price;
    }


    
        
    
    
}
