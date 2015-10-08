import java.util.Scanner;

/**
 * Created by IIS on 08.10.2015.
 */
public class Main {
    public static void readLine(LineProcessor p) {
        Scanner s = new Scanner(System.in);
        while (true){
            String line = s.nextLine();
            if (line.trim().isEmpty())
                break;
            p.process(line);
        }
    }

    public static void main(String[] args) {
        //readLine(new LineProcessor());
        LengthLineProcessor cp = new LengthLineProcessor();
        //CountLineProcessor cp = new CountLineProcessor();
        readLine (cp);
        System.out.println(cp.getLength());
    }
}
