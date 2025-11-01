package Model;

public class Text {
    private Long id;
    private String name;
    private String font;
    private Integer size;
    public Text(Long id, String name, String font, Integer size) {
        this.id = id;
        this.name = name;
        this.font = font;
        this.size = size;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText_name() {
        return name;
    }
    public void setText_name(String name) {
        this.name = name;
    }
    public String getText_font() {
        return font;
    }
    public void setText_font(String font) {
        this.font = font;
    }
    public Integer getText_size() {
        return size;
    }
    public void setText_size(Integer size) {}
    public void addText(){
        //TODO:реалізувати пізніше
    }
}
