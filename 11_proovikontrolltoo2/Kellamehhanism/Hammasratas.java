public class Hammasratas implements Lykatav{
    in valishambaid, mitmesvaline;
    public Hammasratas(int valishambaid){
        this.valishambaid = valishambaid;
    }
    public void lykka(){
        mitmesvaline++;
        if(mitmesvaline==valishambaid){
            System.out.println("Ring tais");
            mitmesvaline=0;
        }
    }
}