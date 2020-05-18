package com.sjsu;

public class NoSuchChemicalElementException  extends Exception{

    private String elementName;

    NoSuchChemicalElementException(){

    }

    public NoSuchChemicalElementException(String elementName){
            super("No matching chemical element in csv file for " + elementName  ); //invokes superclass constructor with message
            this.elementName = elementName;

    }

    public String getElementName() {
        return elementName;
    }
}
