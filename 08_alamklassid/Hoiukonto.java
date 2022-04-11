class Hoiukonto extends Pangakonto{
    public String accountType = "Hoiukonto";

    public void getDetails(){
        System.out.println("Konto tüüp: " + accountType);
        System.out.println("Peamine konto tüüp: " + super.accountType);
    }
}