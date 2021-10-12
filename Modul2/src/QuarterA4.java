/*
Написать метод findQuarter(”, в него передаются координаты точки X и Y, не лежащие на осях OX и OY. Вывести на экран четверть, в которой лежит эта точка (1, 2, 3 или 4).
      y+
    2 | 1
    -----x+
    3 | 4
 */

public class QuarterA4 {
    public void findQuarter(int x, int y) {
        // write your code here
        int res = 0;
        if(x>0&&y>0){res=1;}
        else if(x>0&&y<0){res=4;}
        else if(x<0&&y<0){res=3;}
        else if(x<0&&y<0){res=2;}
        System.out.println(res);
    }
}
