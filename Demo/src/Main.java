public class Main {
    public static void main(String[] args) {
        System.out.println("\" Trang chủ \"");
        PageTemplate homePage = new HomePage();
        homePage.showPage();
        System.out.println("--------------------");
        System.out.println("Trang chi tiết");
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
        System.out.println("--------------------");
        System.out.println("Trang liên hệ");
        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
        System.out.println("--------------------");
    }
}
