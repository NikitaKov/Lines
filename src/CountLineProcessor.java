/**
 * Created by IIS on 08.10.2015.
 */
public class CountLineProcessor extends LineProcessor {
    private int count = 0;
    void process (String s){
        count ++;
    }

    public int getCount (){
        return count;
    }


}
