class Rectangle implements Polygon {
    private int length;
    private int breadth;

    Rectangle (int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length*breadth;
        System.out.println("The area of the Rectangle is " + area);
    }

    public void getSides() {
        System.out.println("I have four sides.");
    }
}
