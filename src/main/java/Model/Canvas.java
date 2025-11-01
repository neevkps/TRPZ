package Model;

public class Canvas {
    private Long id;
    private String name;
    private String type;
    private String content;
    public Canvas(Long id, String name, String type, String content) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.content = content;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Model.Canvas"
                + "id=" + id
                + ", name='" + name + '\''
                + ", type='" + type + '\''
                + ", content='" + content + '\'';
    }
    public void save_as(){
        // TODO: реалізувати пізніше
    }
}
