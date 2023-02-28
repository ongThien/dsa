package chapter_01.reinforcement.r_1_10;

/*
Write a Java class, Flower, that has three instance variables of type String, int,
and float, which respectively represent the name of the flower, its number of
petals, and price. Your class must include a constructor method that initializes
each variable to an appropriate value, and your class should include methods for
setting the value of each type, and getting the value of each type.
 */

public class Solution {
    class Flower {

        private String name;
        private int numberOfPetals;
        private float price;

        public Flower(String name, int numberOfPetals, float price) {
            this.name = name;
            this.numberOfPetals = numberOfPetals;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfPetals() {
            return numberOfPetals;
        }

        public void setNumberOfPetals(int numberOfPetals) {
            this.numberOfPetals = numberOfPetals;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }
}
