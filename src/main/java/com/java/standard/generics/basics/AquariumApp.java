package com.java.standard.generics.basics;

public class AquariumApp {
    public static void main(String[] args) {
        /*  In the same aquarium, we are placing shark and goldfish. It's weired. Because shark can eat goldfish.
            So, to place the same type of things we need to use generics.*/

        Aquarium aquarium = new Aquarium(new GoldFish(), new SharkFish());
        GoldFish goldFish = (GoldFish) aquarium.getFish1();
        System.out.println(goldFish.swimming() + " in Aquarium: " + aquarium);
        SharkFish sharkFish = (SharkFish) aquarium.getFish2();
        System.out.println(sharkFish.swimming() + " in Aquarium: " + aquarium);

        System.out.println("\nGoldfish Aquarium...");
        Aquarium<GoldFish> goldFishAquarium = new Aquarium<>(new GoldFish(), new GoldFish());
        GoldFish goldFish1 = goldFishAquarium.getFish1();
        System.out.println(goldFish1.swimming() + " in Aquarium: " + goldFishAquarium);
        GoldFish goldFish2 = goldFishAquarium.getFish2();
        System.out.println(goldFish2.swimming() + " in Aquarium: " + goldFishAquarium);

        System.out.println("\nShark fish Aquarium...");
        Aquarium<SharkFish> sharkFishAquarium = new Aquarium<SharkFish>(new SharkFish(), new SharkFish());
        SharkFish sharkFish1 = sharkFishAquarium.getFish1();
        System.out.println(sharkFish1.swimming() + " in Aquarium: " + sharkFishAquarium);
        SharkFish sharkFish2 = sharkFishAquarium.getFish2();
        System.out.println(sharkFish2.swimming() + " in Aquarium: " + sharkFishAquarium);

    }
}
