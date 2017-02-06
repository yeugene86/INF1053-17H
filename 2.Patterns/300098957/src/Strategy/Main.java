package Strategy;

/**
 * Created by to-boreal on 2017-02-06.
 */
public class Main {
    public static void main(String[] args) {
       new Context(new Multiply()).use(2, 3);
    }

}
