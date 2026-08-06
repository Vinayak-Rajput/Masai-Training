package com.hdfc.week2.day4.assignment2.FactoryImplementations;

import com.hdfc.week2.day4.assignment2.Factoryinterface.FurnitureFactory;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ModernChair;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ModernSofa;
import com.hdfc.week2.day4.assignment2.ProductImplementations.ModernTable;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Chair;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Sofa;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
