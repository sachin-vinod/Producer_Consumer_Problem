public class Company {
    int n;
    boolean isProduced=false;
    public synchronized void produce_item(int n) throws Exception {
        if(isProduced){
            wait();
        }
        this.n=n;
        System.out.println("Produced Item ="+n);
        isProduced=true;
        notify();
    }

    public synchronized void consume_item() throws Exception{
        if(!isProduced){
            wait();
        }
        isProduced=false;
        notify();
        System.out.println("Consumed value = "+n);
    }
}
