import java.util.ArrayList;
import java.util.List;

public class MazePath {

    public static void main(String[] args) {
        System.out.println(MazePath.getMazePath(0,0,2,2));
        
    }
    public static  List<String>getMazePath(int sr, int sc, int er, int ec){
        List<String>returnPath= new ArrayList<>();
        List<String>hp=new ArrayList<>();
        List<String>vp=new ArrayList<>();
        if(sr==er && sc==ec){
            List<String> objectArrayList = new ArrayList<>();
             objectArrayList.add("");
             return objectArrayList;
        }
        if(sr<er){
      hp=getMazePath(sr+1,sc,er,ec);
            for (String p:hp) {
                returnPath.add("h"+p);
            }
        }
        if(sc<ec){
      vp=getMazePath(sr,sc+1,er,ec);
            for (String p:vp) {
                returnPath.add("v"+p);
            }
        }



            return returnPath;
    }
}
