package org.example.patterns.structural.adapter.domain.enums;

public enum Color {
    RED,
    GREEN,
    BLUE;


    public static Color fromString(String color) {
        return switch (color) {
            case "RED" -> RED;
            case "GREEN" -> GREEN;
            case "BLUE" -> BLUE;
            default -> null;
        };
    }
}
