public class SingletonPatternDemo {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println(config1.getConfig());
        config1.setConfig("Updated Config");
        System.out.println(config2.getConfig()); 
    }
}
