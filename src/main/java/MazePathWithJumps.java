import java.util.*;
public class MazePathWithJumps {
    public static void main(String[] args) {
       System.out.println(MazePathWithJumps.getPaths(1,1,3,3));
    }


    public static List<String> getPaths(int sr, int sc, int dr, int dc){
       
       if(sr==dr &&sc==dc){
        List<String>emptyList= new ArrayList<>();
        emptyList.add("");
        return emptyList;
       }
        List<String>finalPath= new ArrayList<>();
       
       
        for( int i=1;i<=dc-sc;i++){
          List<String>hPaths=  getPaths(sr,sc+i,dr,dc);

          for(String path:hPaths){
                finalPath.add("H"+i+path);
          }
        }

        for( int i=1;i<=dr-sr ;i++){
            List<String>vPaths=getPaths(sr+i,sc,dr,dc);
            for(String path:vPaths){
                finalPath.add("V"+i+path);
            }
        }

        for( int i=1;i<=dr-sr && i<=dc-sc;i++){
            List<String>dPaths=getPaths(sr+i,sc+i,dr,dc);
            for(String path:dPaths){
                finalPath.add("D"+i+path);
            }
        }
        return finalPath;
    }

}
