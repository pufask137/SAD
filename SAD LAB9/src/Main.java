public class Main {

    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber numberSubscriber = new NumberSubscriber();
        StringSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        String stringList[] = { "#God of war","kmitl", "Hello World!", "12345", "1-2-3"};
        for (String s : stringList) {
            System.out.println("Input String : " + s);
            publisher.publish(s);
        }

    }
}