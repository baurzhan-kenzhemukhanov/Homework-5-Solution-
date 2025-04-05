public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Create an image proxy to handle lazy loading of the image
        Image image = new ImageProxy("house1.jpg");

        image.displayThumbnail();

        image.displayFullImage();

        System.out.println("---");

        AgentImageUploader agent = new AgentImageUploader(true);
        agent.uploadImage("villa.png");

        AgentImageUploader guest = new AgentImageUploader(false);
        guest.uploadImage("fake.png");
    }
}
