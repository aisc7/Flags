
public class dkn {
    public static int[][] createDinFlag(int height, int width){
        int[][] flag=new int[height][width];
        int rowInt=0;
        int rowEnd=0;
        int cellInt=0;
        int cellEnd=0;

        rowEnd=height;
        cellInt=(int)(width*0.3);
        cellEnd=(int)(width*0.4);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_WHITE;
            }
        }

        rowEnd=(int)(height*0.45);
        cellEnd=(int)(width*0.3);
        for (int row=0; row<rowEnd; row++){
            for (int cell=0; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_RED;
            }
        }

        rowEnd=(int)(height*0.45);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=0; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.45);
        rowEnd=(int)(height*0.55);
        cellInt=(int)(width*0);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_WHITE;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(width*0);
        cellEnd=(int)(width*0.3);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_RED;
            }
        }

        rowInt=(int)(height*0.55);
        rowEnd=(height);
        cellInt=(int)(width*0.4);
        cellEnd=(width);
        for (int row=rowInt; row<rowEnd; row++){
            for (int cell=cellInt; cell<cellEnd; cell++){
                flag[row][cell]=main.COLOR_RED;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int[][] flag={};
        flag=createDinFlag(24,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }
}