package class22;


    public interface Vehicle {   // When parents is class, child is class  =>use  extend
                                // when parents is interface, child is class=>use implement
                                // interface to interface => extends
        void drive();   //abstract method
    }

    interface Bike extends Vehicle{  // another interface

        void applyBreaks();

    }

    class HondaBike implements Bike{ // we have class

        @Override
        public void drive() {
            System.out.println("driving......");
        }

        @Override
        public void applyBreaks() {
            System.out.println("Stop............");
        }
    }

