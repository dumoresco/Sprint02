package arrays.exceção;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {
        try {
            geraErro1();
        }catch(RuntimeException exception){
            System.out.println(exception.getMessage());
        }

        try{
            geraErro2();
        }catch(Throwable e){
            System.out.println(e.getMessage());
        }


        geraErro2();

        System.out.println("Fim");

    }

    // Exceção NÃO checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception {
        throw new RuntimeException("Ocorreu um erro bem legal #02");
    }
}
