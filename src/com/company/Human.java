package com.company;

public class Human {
    private int weight;
    private int height;

    public Human(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static class Head{
        private String hair_color;

        public Head(String hair_color) {
            this.hair_color = hair_color;
        }

        public String getHair_color() {
            return hair_color;
        }

        public void setHair_color(String hair_color) {
            this.hair_color = hair_color;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "hair_color='" + hair_color + '\'' +
                    '}';
        }
    }

    public static class Leg{
        private int lengthofleg;

        public Leg(int lengthofleg) {
            this.lengthofleg = lengthofleg;
        }

        public int getLengthofleg() {
            return lengthofleg;
        }

        public void setLengthofleg(int lengthofleg) {
            this.lengthofleg = lengthofleg;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "lengthofleg=" + lengthofleg +
                    '}';
        }
    }

    public static class Hand{
        private int numberoffingers;

        public Hand(int numberoffingers) {
            this.numberoffingers = numberoffingers;
        }

        public int getNumberoffingers() {
            return numberoffingers;
        }

        public void setNumberoffingers(int numberoffingers) {
            this.numberoffingers = numberoffingers;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "numberoffingers=" + numberoffingers +
                    '}';
        }
    }
}
