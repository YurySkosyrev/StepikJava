package org.Stepik.Task432;

public class Thief implements MailService{
    private int stolenSumm;
    private int minStolenValue;

    public Thief(int minStolenValue) {
        this.minStolenValue = minStolenValue;
        this.stolenSumm = 0;
    }

    public int getStolenValue() {
        return stolenSumm;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            String newContent = "stones instead of " + ((MailPackage) mail).getContent().getContent();
            Package newPackage = new Package(newContent, 0);
            MailPackage newMailPackage = new MailPackage(mail.getFrom(), mail.getTo(), newPackage);
            this.stolenSumm += ((MailPackage) mail).getContent().getPrice();
            return newMailPackage;

        }
        return mail;
    }

}
