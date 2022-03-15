package pages;

public class ImagenPage extends BasePage{

    private String web = "https://www.globalsqa.com/angularJs-protractor/UploadImage/";
    private String uploadButton = "//input[@type='file']";
    private String imageRoute = "C:\\Users\\FitIdeas\\Pictures\\Lenovo\\LenovoWelcome\\icons\\Support.ico";

    public ImagenPage(){
        super(driver);
    }

    public void navigatingInAWeb(){
        nagivateTo(web);
    }

    public void DarClickASubir(){
        ClickElement(uploadButton);
    }

    public void subirImagen() throws InterruptedException {
        sendKeysToWeb(uploadButton, imageRoute);
        Thread.sleep(10000);
    }


}
