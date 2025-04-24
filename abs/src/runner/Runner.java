package runner;

import com.moni.external.*;
import com.moni.internal.*;

public class Runner {
    public static void main(String[] args) {
        //IplApp
        Jdbc jdbc=new OracleJdbc();

        Jdbc jdbc1=new MysqlJdbc();

        IplApp iplApp=new IplApp(jdbc1);
        iplApp.saveTeamInfo();

        //dataApp
        Storage storage = new CloudStorage();
        Storage storage1 = new LocalStorage();

        DataApp app1 = new DataApp(storage);
        app1.saveData();

        //PaymentApp
        Payment payment = new CardPayment();
        Payment payment1 = new UpiPayment();

        PaymentApp paymentApp2 = new PaymentApp(payment1);
        paymentApp2.doPayment();

        //NotificationApp
        Notifier notifier = new EmailNotifier();
        Notifier notifier1 = new SmsNotifier();

        NotificationApp notificationApp = new NotificationApp(notifier);
        notificationApp.sendAlert();

        //LoggerApp
        Logger logger = new ConsoleLogger();
        Logger logger1 = new FileLogger();

        LogApp logApp = new LogApp(logger);
        logApp.writeLog();

        //BackupApp
        Backup backup = new AutoBackup();
        Backup backup1 = new ManualBackup();

        BackupApp backupApp = new BackupApp(backup);
        backupApp.doBackup();
    }
}
