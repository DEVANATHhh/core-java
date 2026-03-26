class ProfileStore {

    Profile[] profiles;
    int currentIndex = 0;

    ProfileStore(Profile[] profiles) {
        this.profiles = profiles;
    }

    void save(Profile profile) {

        int index = profiles.length;

        if (profiles != null) {
            if (currentIndex < index) {

                profiles[currentIndex] = profile;

              

                System.out.println("Name: " + profile.name);
                System.out.println("Age: " + profile.age);
                System.out.println("Email: " + profile.email);
                System.out.println("Phone: " + profile.phone);
                System.out.println("City: " + profile.city);
                System.out.println("Profession: " + profile.profession);

                currentIndex++;
                System.out.println("Current Index: " + currentIndex);

            } else {
                System.out.println("Array is full");
            }
        }
    }
}