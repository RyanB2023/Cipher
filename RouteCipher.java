import java.lang.reflect.Array;

public class RouteCipher() {
    
 
    

    
   
    public static void fillBlock(String[][] letterBlock, String str){

        int numRows = letterBlock.length;
        int numCols = letterBlock[0].length;

        for(int row = 0; row<numRows; row++){
             for (int col = 0; col<numCols; col++){
                if(str.length()>0){
                    letterBlock[row][col] = Character.toString(str.charAt(0));
                    str = str.substring(1);
                }else{
                    letterBlock[row][col] = "A";
                }
     }
    }   
    }
     
}