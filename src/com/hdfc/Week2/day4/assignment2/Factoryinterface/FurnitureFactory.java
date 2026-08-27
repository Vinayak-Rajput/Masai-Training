package com.hdfc.week2.day4.assignment2.Factoryinterface;

import com.hdfc.week2.day4.assignment2.ProductInterfaces.Chair;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Sofa;
import com.hdfc.week2.day4.assignment2.ProductInterfaces.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
