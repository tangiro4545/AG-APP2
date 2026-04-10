package util;

public class Validacoes {

    private Validacoes() {
    }
    
    //NOME VALIDO
    
    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));       
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()){
            return "Erro: O nome não pode estar vazio!";
        }else if (nome.matches(".*\\d+.*")){
            return "Erro: O nome não pode conter números!";
        }
        return "";
    }

    //COR VALIDA

    public static boolean corValida(String cor) {
        return !(cor == null || cor.trim().isEmpty() || cor.matches(".*\\d+.*"));       
    }

    public static String mensagemErroCor(String cor) {
        if (cor == null || cor.trim().isEmpty()){
            return "Erro: A cor não pode estar vazio!";
        }else if (cor.matches(".*\\d+.*")){
            return "Erro: A cor não pode conter números!";
        }
        return "";
    }

    //RAÇA VALIDA

    public static boolean racaValida(String raca) {
        return !(raca == null || raca.trim().isEmpty() || raca.matches(".*\\d+.*"));       
    }

    public static String mensagemErroRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()){
            return "Erro: A raça não pode estar vazio!";
        }else if (raca.matches(".*\\d+.*")){
            return "Erro: A raça não pode conter números!";
        }
        return "";

    }

    //IDADE VALIDA

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 20;    
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade não pode ser negativa!";
        } else if (idade > 150) {
            return "Erro: Idade inválida!";
        }
        return "";
    }

}