
    class BasketDemo {
        public static void main(String [] args) {
            Basket bl = new Basket ();
            Basket b2 = new Basket ();
            Basket b3 = new Basket ();

            System.out.print("b1: ");
                    bl.pay(1200.0); // нал
            System.out.print("b2: ");
                    b2.pay ("123456789"); // карта
            System.out.print("b3: ");
                    b3. pay ("987654321", "5500"); // перевод
        }
    }

