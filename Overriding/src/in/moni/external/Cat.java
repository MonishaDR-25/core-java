package in.moni.external;

import in.moni.internal.Animal;

public class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meowing");
        }

        public void scratch() {
            System.out.println("Cat scratching furniture");
        }
}
