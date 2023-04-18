package LengthConvert;

public class TestDrive {
    public static void main(String[] args) {
        LengthUnit mileUnit = new LengthUnit("mile", 1609.344);
        LengthUnit yardUnit = new LengthUnit("yard", 0.9144);
        LengthUnit metterUnit = new LengthUnit("m", 1);

        LengthMeasure mile = new LengthMeasure(30, mileUnit);
        System.out.println(mile);

        LengthConvert converter = new MetterConvertAdapter();
        converter.convert(mile, yardUnit);

    }
}
