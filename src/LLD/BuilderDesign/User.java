package LLD.BuilderDesign;

final public class User {
    private final String name;
    private final String age;
    private final String email;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
    }

    public static class UserBuilder {
        private String name;
        private String age;
        private String email;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder() {

        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
