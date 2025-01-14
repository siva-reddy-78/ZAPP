package park.zapp.dao;

public class Area {
    private String ref_num;
    private String area_name;
    private int rating;
    private int capacity;

    public Area()
    {
        super();
    }
    public Area(String ref_num, String area_name, int rating, int capacity)
    {
        this.ref_num = ref_num;
        this.area_name = area_name;
        this.rating = rating;
        this.capacity = capacity;
    }
    public String getRef_num() {
        return ref_num;
    }

    public void setRef_num(String ref_num) {
        this.ref_num = ref_num;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
