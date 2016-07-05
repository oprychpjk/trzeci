class Main {
    public static void main(String[] args){
        String imie = args[0];
        String nazwisko = args[1];
        String wiek = args[2];
        String inicjal = "";
        char znak;
        znak = imie.charAt(0);
        inicjal = ""+znak;

        znak=nazwisko.charAt(0);
        inicjal+=String.valueOf(znak);
        inicjal+=wiek;

        System.out.print(inicjal);
    }
}

