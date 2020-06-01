public class jingtai {
    private String name;
    private int age;

    public static class Builder {
        private String name;
        private int age;
    }
    private jingtai(Builder b) {
        this.age = b.age;
        this.name = b.name;
    }
}