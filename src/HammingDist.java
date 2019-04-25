import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class for calculating the HammingDist of two strings.
 * @author Brian
 * @version 2019-04-09
 */
public class HammingDist {

    public static ArrayList<String> getMeso(){
        ArrayList<String> mesonet = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"))) {
            String line;

            while((line = br.readLine()) != null){
                mesonet.add(line.substring(0,4));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mesonet;
    }
    public static int calcDist(String a, String b){
        int sum=0;
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();
        int[] aint = new int[achar.length];
        int[] bint = new int[bchar.length];
        for(int i=0;i<achar.length;i++){
            aint[i]=(int)achar[i];
            bint[i]=(int)bchar[i];
        }
        for(int i=0;i<aint.length;i++){

                sum+=Math.abs(aint[i]-bint[i]);

        }
        return sum;
    }
    public static int calcLetters(String a, String b){
        int sum=0;
        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();

        for(int i=0;i<achar.length;i++){
            if(achar[i]!=bchar[i]){
                sum++;
            }

        }
        return sum;
    }
    public static int[] calcMesoDist(String a){
        int[] sums = new int[5];
        for(String s: getMeso()){
            sums[calcLetters(a,s)]++;
        }
        return sums;
    }

}
