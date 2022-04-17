package org.lessons7;

public class Plane {
    public static String name = "Boeing";


    static class Wings {
        int w = 2000;

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        void outDisplayWeight() {
            System.out.println(w);
        }
    }


    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(name);
        Plane.AllShowWings displayWeightName = new Plane.AllShowWings();
        displayWeightName.displayAllWings();

        System.out.println("______________________________________________");

        System.out.println(name = "SuperJet");
        Plane.AllShowWings displayLeft = new Plane.AllShowWings();
        displayLeft.w = 550;
        System.out.println("Вес левого крыла составляет " + displayLeft.w);
        Plane.AllShowWings displayRight = new Plane.AllShowWings();
        displayRight.w = 450;
        System.out.println("Вес правого крыла составляет " + displayRight.w);

        System.out.println("______________________________________________");
        System.out.println("__________________2 попытка___________________");

        Plane.Wings wingLeft = new Plane.Wings();
        wingLeft.setW(1050);
        wingLeft.outDisplayWeight();

        Plane.Wings wingRight = new Plane.Wings();
        wingRight.setW(950);
        wingRight.outDisplayWeight();

    }


    static class AllShowWings {
        int w = 1000;
        void displayAllWings() {
            System.out.println(w);
        }
    }

    static class ShowWingLeft {
        int w = 550;
        void displayAllWings() {
            System.out.println("Вес левого крыла" + w);
        }
    }


    static class ShowWingRight {
        int w = 450;
        void displayAllWings() {
            System.out.println("Вес правого крыла" + w);
        }
    }
}




