 class bank {
     int account_no;
     String name;
     float amount;

     void insert_record(int a, String n, float amt) {
         account_no = a;
         name = n;
         amount = amt;

     }

     void deposite(float amt) {
         amount = amount + amt;
         System.out.println(amt+" Amount deposited");
     }

     void withdraw(float amt) {
         if (amount < amt) {
             System.out.println("you have insufficient balance");

         } else {
             amount = amount - amt;
             System.out.println(amt+" amount withdraw");
         }
     }

     void check_balance() {
         System.out.println("balance is "+amount);
     }

     void display() {
         System.out.println("Welcome "+name+"\n"+"your Account detail is-");
         System.out.println(account_no + " " + name + " " + amount);
     }
 }
    class bankingprocess{
        public static void main(String[] args){
            bank b1 =new bank();
            b1.insert_record(123,"ankur omar",25000);
            b1.display();
            b1.deposite(10000);
            b1.check_balance();
            //b1.display();
            b1.withdraw(20000);
            b1.check_balance();
            //b1.display();
            System.out.println("Thankyou for accessing bank services");


        }
    }



