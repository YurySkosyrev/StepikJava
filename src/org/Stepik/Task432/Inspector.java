package org.Stepik.Task432;

public class Inspector implements MailService {
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) throws RuntimeException{
        if (mail instanceof MailPackage){
            String packageContent = ((MailPackage) mail).getContent().getContent();
            if (packageContent == WEAPONS || packageContent == BANNED_SUBSTANCE)
                throw new IllegalPackageException();
            if (packageContent.contains("stones"))
                throw new StolenPackageException();
        }
        return mail;
    }
}
