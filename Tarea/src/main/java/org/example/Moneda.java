package org.example;

public abstract class Moneda implements Comparable<Moneda> {
    private static int count = 0;
    private int serial;

    public Moneda() {
        this.serial = count++;
    }

    public abstract int getValor();

    public int getSerial() {
        return serial;
    }

    @Override
    public String toString() {
        return "Moneda de " + getValor() + " (Serie: " + serial + ")";
    }

    @Override
    public int compareTo(Moneda otra) {
        return Integer.compare(this.getValor(), otra.getValor());
    }

    public static class Moneda1000 extends Moneda {
        @Override
        public int getValor() {
            return 1000;
        }
    }

    public static class Moneda500 extends Moneda {
        @Override
        public int getValor() {
            return 500;
        }
    }

    public static class Moneda100 extends Moneda {
        @Override
        public int getValor() {
            return 100;
        }
    }
}
