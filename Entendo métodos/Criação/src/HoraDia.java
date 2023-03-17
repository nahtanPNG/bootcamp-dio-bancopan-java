public class HoraDia {

    public static void mensagemHorário(int hora){
        if(hora > 6 & hora <12){
            System.out.println("Bom dia!");
        } else if(hora >= 12 & hora < 18){
            System.out.println("Boa tarde!");
        } else{
            System.out.println("Boa noite!");
        }
    }

}
