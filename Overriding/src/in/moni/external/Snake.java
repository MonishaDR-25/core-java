package in.moni.external;

import in.moni.internal.Animal;

public class Snake extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Snake slithering");
        }

        public void shedSkin() {
            System.out.println("Snake shedding skin");
        }
}
