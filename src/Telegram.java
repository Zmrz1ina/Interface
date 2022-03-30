public class Telegram implements Massager{
    @Override
    public void call(String phoneNumber) {
        System.out.println("TG starting ");
        System.out.println("происходит логирование данных");
        System.out.println("отправляется запрос на сервер с ip7348758");
        System.out.println("если получили положительный ответ, то звучат гудки");

    }

    @Override
    public void sendMassage(String phoneNumber, String massage) {

    }
}
