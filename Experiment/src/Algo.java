import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Rohith on 4/17/2017.
 */
public class Algo {
    public static void main(String args[])throws IOException{
        ArrayList al = new ArrayList();
        ArrayList bl = new ArrayList();
        int n = 10 , m =5;
        for(int i=0; i< n ; i++){
            al.add(i);
        }
        //System.out.print(al);

        for(int i=1; i< m ; i++){
            bl.add(i);
        }
        bl.removeAll(al);
        al.clear();
        //System.out.print(al);
        //System.out.print(bl);
        String[] next;
        String[] header = {"metric_type", "timestamp", "perc"};
        CSVReader reader = new CSVReader(new FileReader(System.getProperty("user.dir") + "/c6fp.csv"));
        while((next = reader.readNext()) != null){
            for(String data:next){
                System.out.print(data +',');
            }
            System.out.print("\n");

        }

    }
}



