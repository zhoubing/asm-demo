public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = classLoader.loadClass("sample.HelloWorld");
        Object instance = clazz.newInstance();
        System.out.println(instance);
    }
}
