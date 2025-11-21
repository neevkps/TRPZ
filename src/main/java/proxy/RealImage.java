package proxy;


class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        System.out.println("Завантаження зображення " + fileName + " з диска...");
        System.out.println("Відкриття зображення " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Відображення зображення " + fileName + " на екрані.");
    }
}
