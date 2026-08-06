package com.hdfc.day5.Inheritance;

public class AChild extends A{
    private String gender;
    private String qualification;

    public AChild(String name, String age,String gender, String qualification){
        super(name,age);
        this.gender =gender;
        this.qualification=qualification;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Gender: "+ this.gender);
        System.out.println("Qualification: "+ this.qualification);
    }

    static void main() {
        AChild aC =new AChild("Vinayak","21","Male","BE");
        aC.showDetails();
    }
}
