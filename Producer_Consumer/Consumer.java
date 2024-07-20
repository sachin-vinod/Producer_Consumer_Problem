public class Consumer extends Thread {

    Company company;
    Consumer(Company company){
        this.company=company;
    }

    @Override
    public synchronized void run(){
        while(true){
            int val= 0;
            try {
                this.company.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
