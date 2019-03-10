import java.text.DecimalFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int i = 12345;
        System.out.format("%d%n",i);
        System.out.format("%06d%n",i);
        System.out.format("%+6d%n",i);
        System.out.format("%+,d%n",i);

        double pi = Math.PI;
        System.out.format("%f%n",pi);
        System.out.format("%.2f%n",pi);
        System.out.format("%08.4f%n",pi);
        System.out.format("%-10.4f%n",pi);

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tm %te, %tY%n", c, c, c);
        System.out.format("%tB %td, %tY%n", c, c, c);
        System.out.format("%tB %te, %ty%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
        System.out.format("%tD%n", c);

        printWithFormat("###,###.##",123456.789);
        printWithFormat("#,##.#",123456.789);
        printWithFormat("#.##",123456.789);
        printWithFormat("0000.0000",123.456);
        printWithFormat("$#,##.#",123456.789);

        System.out.println(Math.abs(-12.3));
        System.out.println(Math.ceil(12.1));
        System.out.println(Math.floor(12.9));
        System.out.println(Math.rint(12.35));
        System.out.println(Math.rint(12.55));
        System.out.println(Math.round(12.34));
        System.out.println(Math.min(1,2));
        System.out.println(Math.max(1,2));
        System.out.println(Math.log(10));
        System.out.println(Math.exp(10));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(16));

        System.out.println(Math.sin(Math.toRadians(45)));
        System.out.println(Math.cos(Math.toRadians(45)));
        System.out.println(Math.tan(Math.toRadians(45)));

        System.out.println((int)(Math.random()*10));

    }

    public static void printWithFormat(String pattern, double value){
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.println(decimalFormat.format(value));
    }
}
