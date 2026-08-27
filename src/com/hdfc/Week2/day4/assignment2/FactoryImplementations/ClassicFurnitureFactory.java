package com.hdfc.week2.day4.assignment2.FactoryImplementations;

import com.hdfc.week2.day4.assignment2.Factoryinterface.FurnitureFactory;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ClassicChair;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ClassicSofa;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ClassicTable;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Chair;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Sofa;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Table;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
