import java.util.EventListener;

/**
 * Created by student on 6/10/2016.
 */
public class main {
}
public class ReadyListener implements EventListener
{
    public static void main(String[] args)
    {
        JDA jda = new JDABuilder().setBotToken("MTkwMDE3OTcwNTExMDIwMDMz.Cj0O9Q.V9LQpFCu5hBlbKiyEaA").addListener(new ReadyListener().buildBlocking());

    }
}