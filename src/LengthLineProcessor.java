/**
 * Created by IIS on 08.10.2015.
 */
public class LengthLineProcessor extends LineProcessor{
    private int length = 0;

    void process(String s) {
        length += s.length();
    }

    public int getLength (){
        return length;
    }
}
