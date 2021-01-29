package ua.lits.java_base.hw4_Calculator.hwReconstructionHw3;

public class IsBorn {
    public static void iWasBorn(int month) {
        switch (month) {
            case 1:
                System.out.println("Я народився в січні.");
                break;
            case 2:
                System.out.println("Я народився в лютому.");
                break;
            case 3:
                System.out.println("Я народився в березні.");
                break;
            case 4:
                System.out.println("Я народився в квітні.");
                break;
            case 5:
                System.out.println("Я народився в травні.");
                break;
            case 6:
                System.out.println("Я народився в червні.");
                break;
            case 7:
                System.out.println("Я народився в липні.");
                break;
            case 8:
                System.out.println("Я народився в серпні.");
                break;
            case 9:
                System.out.println("Я народився в вересні.");
                break;
            case 10:
                System.out.println("Я народився в жовтні.");
                break;
            case 11:
                System.out.println("Я народився в листопаді.");
                break;
            case 12:
                System.out.println("Я народився в грудні.");
                break;
            default:
                System.out.println("Не знаю такого місяця.");
        }
    }
}

