package org.example.graficeditor.Model;

public class VisualEffects {
    private Long id;
    private String name;
    private String description;
    private String constructor;
    public VisualEffects(Long id, String name, String description, String constructor) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public  Long getId() {
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getConstructor() {
        return constructor;
    }
    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }
}
