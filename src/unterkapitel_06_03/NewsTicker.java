package unterkapitel_06_03;

public class NewsTicker {
	
	public static void main(String args[]) {
		
		Clipboard clipboard = new Clipboard();
		NewsConsumer producer = new NewsConsumer(clipboard, "gigio");
		NewsProducer consumer = new NewsProducer(clipboard, "pia");
		NewsConsumer consumer2 = new NewsConsumer(clipboard, "Elisa");
		
		producer.start();
		consumer.start();
		consumer2.start();
	}	
}

