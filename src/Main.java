public class Main {
    public static void main(String[] args) {

        // USANDO IF
        int numeroIf = 5;

        if(numeroIf<0){
            System.out.println("El número es negativo");
        } else if (numeroIf>0) {
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es cero");
        }

        // BUCLE WHILE

        int numeroWhile = 0;

        while (numeroWhile<3){
            System.out.println("El número en while es: " + numeroWhile);
            numeroWhile++;
        }

        // BUCLE DO WHILE
        numeroWhile = 2;
        do{
            System.out.println("El número en DoWhile es: "+ numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        // BUCLE FOR

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El número en for es : "+numeroFor);
        }

        // CONDICIÓN SWITCH

        String estacion = "otoño";

        switch (estacion){
            case "primavera":
                System.out.println("Estás en primavera");
                break;

            case "verano":
                System.out.println("Estás en verano");
                break;

            case "invierno":
                System.out.println("Estás en invierno");
                break;

            case "otoño":
                System.out.println("Estás en otoño");
                break;

            default: System.out.println("No es una estacion");
        }
    }
}