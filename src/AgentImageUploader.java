public class AgentImageUploader {
    private final boolean isLoggedIn;

    public AgentImageUploader(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public void uploadImage(String imageName) {
        if (isLoggedIn) {
            System.out.println("Image uploaded by agent: " + imageName);
        } else {
            System.out.println("Upload failed. Please log in to upload images.");
        }
    }
}
