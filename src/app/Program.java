package app;

import java.util.Date;

import models.Department;
import models.Seller;

public class Program {
    public static void main(String[] args) {
    
    Department obj = new Department(1,"Books");
    Seller sel = new Seller(1,"Caio","Email",new Date(),3000.0,obj);
    System.out.println(obj);
    System.out.println(sel);

    }
}
