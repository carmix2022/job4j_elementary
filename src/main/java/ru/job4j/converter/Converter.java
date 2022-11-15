package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inEur = 140;
        float expectedEur = 2;
        float outEur = Converter.rubleToEuro(inEur);
        boolean passedEur = expectedEur == outEur;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEur);

        float inDoll = 120;
        float expectedDoll = 2;
        float outDoll = Converter.rubleToDollar(inDoll);
        boolean passedDoll = expectedDoll == outDoll;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedDoll);

        /*
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");

         */
    }
}