package org.Stepik.Task432;

public class UntrustworthyMailWorker implements MailService{

    private MailService[] ms;
    private RealMailService rms;

    public UntrustworthyMailWorker(MailService[] ms) {
        this.ms = ms;
        this.rms = new RealMailService();
    }

    public RealMailService getRealMailService() {
        return rms;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService msElement : this.ms){
            msElement.processMail(mail);
        }
        this.rms.processMail(mail);
        return mail;
    }
}
