public interface Massager {
    void call (String phoneNumber);
    void sendMassage (String phoneNumber, String massage);
    default void createChat(String chatName){
        System.out.println("Создан чат с именем " + chatName);
    }
}
