package Model;

public class Colors {
    private Long id;
    private String color_name;
    private String color_rgb;
    public Colors(Long id, String color_name, String color_rgb) {
        this.id = id;
        this.color_name = color_name;
        this.color_rgb = color_rgb;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getColor_name() {
        return color_name;
    }
    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }
    public String getColor_rgb() {
        return color_rgb;
    }
    public void setColor_rgb(String color_rgb) {
        this.color_rgb = color_rgb;
    }
    public void pick_color(){
        //TODO:реалізувати пізніше
    }
}
