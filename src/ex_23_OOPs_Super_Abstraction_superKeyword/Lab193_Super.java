package ex_23_OOPs_Super_Abstraction_superKeyword;

public class Lab193_Super {
}

class BaseClass {
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;

    BaseClass() {
        System.out.println("DC- Parent");
    }

    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC- Parent");
    }
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    private int aa;
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class TestCase extends BaseClass{

    void test(){}
    String a;

    TestCase()
    {
        //super();
//        super("Chrome");
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("firefox");
        //System.out.println(super.aa);
        this.test();//
        System.out.println(this.a);


    }
}
