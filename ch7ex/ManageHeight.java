public class ManageHeight
{
    public static void main(String[] args){
     ManageHeight height = new ManageHeight();
     height.setData();
     height.printHeight(1);

    }
    int gradeHeights[][];
    
    public void setData(){
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[] {170,180,173,175,177};
        gradeHeights[1] = new int[] {160,165,176,186};
        gradeHeights[2] = new int[] {158,177,187,176};
        gradeHeights[3] = new int[] {173,182,181};
        gradeHeights[4] = new int[] {170,180,165,177,172};
        
    }
    public void printHeight(int classNo){
        System.out.println("Class No.:" + classNo);
        for(int i = 0 ; i < gradeHeights[classNo-1].length; i++)
            System.out.println(gradeHeights[classNo-1][i]);
    }


}