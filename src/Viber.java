public class Viber implements Massager{
    @Override
    public void call(String phoneNumber) {
        System.out.println("Viber starting ");
        System.out.println("проверяем регион клиента");
        System.out.println("если получили положительный ответ, то звучат гудки");
    }

    @Override
    public void sendMassage(String phoneNumber, String massage) {


    }
}
