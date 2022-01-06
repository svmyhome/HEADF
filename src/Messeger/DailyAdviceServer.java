package Messeger;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"kcmdkmdkcm", "jcnjnjn ckmdmcmd", "cdkmdcjdn jcndncjdncd", "Greatest apartment carey class death topic decided, whatever schema.", "Habits leeds dress energy sleeps angola geological, implied composer admissions paying softball bio conventions, shut government high jeans marina belgium stars, output dale spelling explaining till. "};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
