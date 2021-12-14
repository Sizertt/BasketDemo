class Basket {

    void pay(double money) {
        System.out.println("оплачено наличными: " + money);
    }

    void pay(String cardNum) {
        System.out.println("оплачено по кредитной карте #" + cardNum);
    }

    void pay(String accountNum, String bankCode) {
        System.out.println("Переведено на счёт #" + accountNum + "в банке" + bankCode);
    }
}