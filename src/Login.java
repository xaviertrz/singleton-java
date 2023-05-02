public class Login {
    private static Login login;

    private Login() {
    }

    public synchronized static Login getLogin() {
        return login == null ? new Login() : login;
    }
}
