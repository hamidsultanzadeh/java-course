package com.hamidsultanzadeh.factory_pattern;

public class ShapeFactory {

    public Shape getShape(String type){

        switch (type) {
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
        }
        return null;

    }
}
