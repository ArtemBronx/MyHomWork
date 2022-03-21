package com.company;

public class Customer extends Person {

       private  String bankAccontNumber;

    public Customer(String firstName,String lasstName,String address, String bankAccontNumber ){

        super(firstName,lasstName,address);

        this.bankAccontNumber=bankAccontNumber;
    }
    @Override

        public void display(){

        super.display();
            System.out.println(" Bank account number : "+this.bankAccontNumber);
    }
}
