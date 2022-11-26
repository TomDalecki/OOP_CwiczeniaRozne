package NestedClass.AnonymousInnerClass;

public class AnonymousMain {
    public static void main(String[] args) {
        AnonymousMain anonymousMain = new AnonymousMain();
        System.out.println(anonymousMain.callInnerInterface());
        System.out.println(anonymousMain.callInnerInterface2());

        System.out.println(anonymousMain.callInnerAbstract());
        System.out.println();
    }

    private String callInnerAbstract() {
        Animal animal = new Animal() {
            @Override
            String whatsYourName() {
                return "my name is abstract class";
            }
        };
        return animal.whatsYourName();
    }

    private String callInnerInterface() { //ponizsze pokazuje możliwości implementacji interfejsu gdy jest jedna metoda lub dwie metody
        Singable singable = new Singable() {//gdy jest jedna metoda mozna implementowac poprzez Lambda
            @Override
            public String singASong(String songName) {
                return "I am singing a song " + songName;
            }
        };
        return singable.singASong("LALALALLAALAL");
    }

    private String callInnerInterface2() {
        Singable singable = songName -> "I am singing a song " + songName;
        return singable.singASong("LALALALLALALA");
    }

    private String callInnerInterfaceWithTwoMethods(){
        Voicable voicable = new Voicable() {
            @Override
            public String silentVoice() {
                return null;
            }

            @Override
            public String loudVoice() {
                return null;
            }
        };
        return voicable.loudVoice();
    }


    interface Voicable {
        String silentVoice();

        String loudVoice();
    }

    interface Singable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}
