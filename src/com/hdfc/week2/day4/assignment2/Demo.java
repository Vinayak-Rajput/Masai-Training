package com.hdfc.week2.day4.assignment2;

import com.hdfc.week2.day4.assignment2.FactoryImplementations.ClassicFurnitureFactory;
import com.hdfc.week2.day4.assignment2.FactoryImplementations.ModernFurnitureFactory;
import com.hdfc.week2.day4.assignment2.Factoryinterface.FurnitureFactory;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Chair;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Sofa;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Table;

public class Demo {
    static void main() {
        FurnitureFactory modernFurniture = new ModernFurnitureFactory();
        FurnitureFactory classicFurniture = new ClassicFurnitureFactory();

        Chair chair1 = modernFurniture.createChair();
        Table table1 = modernFurniture.createTable();
        Sofa sofa1 = modernFurniture.createSofa();

        chair1.sitOn();
        table1.useTable();
        sofa1.relaxOn();

        Chair chair2 = classicFurniture.createChair();
        Table table2 =classicFurniture.createTable();
        Sofa sofa2 = classicFurniture.createSofa();

        chair2.sitOn();
        table2.useTable();
        sofa2.relaxOn();
    }
}
