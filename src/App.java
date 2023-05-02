public class App {
    public static void main(String[] args) throws Exception {
        Login login = Login.getLogin();
        System.out.println(login.hashCode());
    }
}
