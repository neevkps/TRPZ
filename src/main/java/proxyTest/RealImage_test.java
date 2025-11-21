package proxyTest;

public class RealImage_test implements Image_test {

    private final String filename;

    public RealImage_test(String filename) {
        this.filename = filename;
        System.out.println(">>> Завантажено повну картинку: " + filename);
    }

    @Override
    public String getName() {
        return filename;
    }

    @Override
    public String getPreviewUrl() {
        return "/preview/" + filename;
    }

    @Override
    public String getFullUrl() {
        return "/full/" + filename;
    }
}
