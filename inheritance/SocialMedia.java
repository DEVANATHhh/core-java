class SocialMedia extends Media {
    String app;
    int followers;
    boolean verified;
    String owner;
    int posts;

    void displayDetails() {
        System.out.println(app+" "+followers+" "+verified+" "+owner+" "+posts);
    }
}