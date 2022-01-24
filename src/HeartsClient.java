public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart Group1 = new Heart("red",3,"Hi",15,5.00,true,50);
        Heart Group2 = new Heart("teal",5,"Love CS-A",25,4.50,true,200);
        Heart Group3 = new Heart("green",2,"Go Girl!",10,3.50,true,75);
    
    Heart[] store = {Group1, Group2, Group3};

    System.out.println(Group1.getReport());

    }
    public int buyOut(Heart[] store) {
        int sum=0;
    for (int i=0; i<store.length-1; i++) {
        sum+=store[0].getStock();
    }
    return sum;
    }
}
