public class Rectangle {
    int width;
    int height;

    int area(){
        return width * height;
    }

    int perimeter(){
        return 2* (width + height);
    }

    public static void main(String[] args) {
        Rectangle[] rects = new Rectangle[5];
        int [][] sizes = { {2, 3}, {5, 4}, {1, 9}, {6, 6}, {3, 7}};

        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle();
            rects[i].width = sizes[i][0];
            rects[i].height = sizes[i][1];
            System.out.println("Ractangle" + (i + 1) + ": area = "+ rects[i].area() + "perimeter ="+ rects[i].perimeter());
        }
        Rectangle largest = rects[0];
        for (Rectangle r : rects) {
            if (r.area()> largest.area()){
                largest=r;
            }
        }
        System.out.println("Largest area : " + largest.area());
    }
}
