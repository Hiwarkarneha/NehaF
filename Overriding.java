class Baba {

    void getProperty() {

        System.out.println("Banglow");
    }

    void getCareer(){
        System.out.println("Wish to be Doctor");

    }
}

class Srusti extends Baba {

    void getProperty(){
        System.out.println("Aparment");
    }

    void getCareer() {
        System.out.println("Enginner");

    }

     public static void main(String[] args) {
         Baba b = new Baba();
         b.getProperty();
         b.getCareer();
         
        // Baba b1 = new Srusti();
        // b1.getProperty();
        // b1.getCareer();

         Srusti b2 = new Baba();
         b2.getProperty();
         b2.getCareer();


         Srusti s = new Srusti();
         s.getProperty();
         s.getCareer();
     }
     
}

