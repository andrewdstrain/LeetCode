public class Region {
    private int area;
    private boolean visited;

    public Region() {
        area = 0;
        visited = false;
    }

    public Region(int area) {
        this.area = area;
        this.visited = false;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isLand() {
        return area == 1;
    }
}
