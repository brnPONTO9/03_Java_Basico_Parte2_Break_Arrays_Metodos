public class Exercicio37 {
    static boolean validarLogin(String usuario, String senha, boolean ativo) {
        boolean usuarioOk = usuario != null && !usuario.isBlank();
        boolean senhaOk = senha != null && senha.length() >= 6;
        return usuarioOk && senhaOk && ativo;
    }
    public static void main(String[] args) {
        System.out.println(validarLogin("ana", "123456", true));
        System.out.println(validarLogin("ana", "123", true));
        System.out.println(validarLogin("ana", "123456", false));
    }
}
