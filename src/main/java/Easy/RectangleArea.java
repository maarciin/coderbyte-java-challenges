package Easy;

import java.util.Arrays;

/*
Have the function RectangleArea(strArr) take the array of strings stored in strArr,
which will only contain 4 elements and be in the form (x y) where x and y are both integers,
and return the area of the rectangle formed by the 4 points on a Cartesian grid.
The 4 elements will be in arbitrary order.
For example: if strArr is ["(0 0)", "(3 0)", "(0 2)", "(3 2)"] then your program should
return 6 because the width of the rectangle is 3 and the height is 2
and the area of a rectangle is equal to the width * height.
Examples
Input: new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"}
Output: 4
Input: new String[] {"(0 0)","(1 0)","(1 1)","(0 1)"}
Output: 1
 */
class RectangleArea {
    public static void main(String[] args) {
        System.out.println(rectangleArea(new String[]{"(1 1)", "(1 3)", "(3 1)", "(3 3)"}));
        System.out.println(rectangleArea(new String[]{"(0 0)", "(1 0)", "(1 1)", "(0 1)"}));
        System.out.println(rectangleArea(new String[]{"(0 0)", "(3 0)", "(0 2)", "(3 2)"}));
        System.out.println(rectangleArea(new String[]{"(0 0)", "(5 0)", "(0 3)", "(5 3)"}));
        System.out.println(rectangleArea2(new String[]{"(1 1)", "(1 3)", "(3 1)", "(3 3)"}));
        System.out.println(rectangleArea2(new String[]{"(0 0)", "(1 0)", "(1 1)", "(0 1)"}));
        System.out.println(rectangleArea2(new String[]{"(0 0)", "(3 0)", "(0 2)", "(3 2)"}));
        System.out.println(rectangleArea2(new String[]{"(0 0)", "(5 0)", "(0 3)", "(5 3)"}));

    }

    //my first solution :
    public static int rectangleArea(String[] strArr) {
        String[] p1 = strArr[0].replaceAll("[^0-9\\s]", "").split(" ");
        String[] p2 = strArr[1].replaceAll("[^0-9\\s]", "").split(" ");
        String[] p3 = strArr[2].replaceAll("[^0-9\\s]", "").split(" ");
        int lengthA = toInt(p1[0]) == toInt(p2[0]) ? Math.abs(toInt(p1[1]) - toInt(p2[1])) :
                Math.abs(toInt(p1[0]) - toInt(p2[0]));
        int lengthB = toInt(p1[0]) == toInt(p3[0]) ? Math.abs(toInt(p1[1]) - toInt(p3[1])) :
                Math.abs(toInt(p1[0]) - toInt(p3[0]));
        return lengthA * lengthB;
    }

    //second solution with inner class
    public static int rectangleArea2(String[] strArr) {
        Arrays.sort(strArr);
        int x = new Point(strArr[0]).distance(new Point(strArr[1]));
        int y = new Point(strArr[0]).distance(new Point(strArr[2]));
        return x * y;
    }

    private static int toInt(String text) {
        return Integer.parseInt(text);
    }

    static class Point {
        int x;
        int y;

        Point(String point) {
            String[] xyString = point.replaceAll("[^0-9\\s]", "").split("\\s");
            this.x = toInt(xyString[0]);
            this.y = toInt(xyString[1]);
        }

        int distance(Point p) {
            return this.x != p.x ? Math.abs(this.x - p.x) : Math.abs(this.y - p.y);
        }
    }
}
