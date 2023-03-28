import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.print("Вызвался первый бин: ");
        System.out.println(bean.getMessage());


        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");//отсюда писал не забыть удалить
        System.out.print("Вызвался второй бин: ");
        System.out.println(bean1.getMessage());

        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.print("Вызвался третий бин: ");
        System.out.println(bean2.getMeow());

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.print("Вызвался четвертый бин: ");
        System.out.println(bean3.getMeow());

        System.out.println("Результат сравнения первой пары бинов: " + (bean == bean1));
        System.out.println("Результат сравнения второй пары бинов: " + (bean2 == bean3));

    }
}