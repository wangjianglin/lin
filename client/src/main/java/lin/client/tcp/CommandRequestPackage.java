package lin.client.tcp;

import lin.client.tcp.annotation.Command;
import lin.util.ByteUtils;

/**
 * Created by lin on 1/28/16.
 */
public abstract class CommandRequestPackage extends RequestPackage implements CommandPackage{
    private int command = 0;

    protected CommandRequestPackage()
    {
        init();
    }

    private void init(){
        Class<?> cls = this.getClass();
        Command commandAnnon = cls.getAnnotation(Command.class);
        if(commandAnnon != null){
            this.command = commandAnnon.value();
        }
    }


    protected int getBodySize()
    {
        return 0;
    }

    protected void bodyWrite(byte[] bs, int offset)
    {
    }
    protected void bodyWrite(byte[] bs)
    {
        bodyWrite(bs,0);
    }

    public int getSize()
    {
        return this.getBodySize() + 11;
    }

    @Override
    public final byte[] write()
    {
        byte[] bs = new byte[this.getSize()];
        ByteUtils.writeByte(bs, this.major, 0);
        ByteUtils.writeByte(bs, this.minor, 1);
        ByteUtils.writeByte(bs, this.revise, 2);
        ByteUtils.writeInt(bs, this.command, 3);
        ByteUtils.writeInt(bs, this.getSize(), 7);
        this.bodyWrite(bs, 11);
        return bs;
    }

    public int getCommand()
    {
        return this.command;
    }

    private byte major;
    private byte minor;
    private byte revise;

    public byte getMajor() {
        return major;
    }

    void setMajor(byte major) {
        this.major = major;
    }

    public byte getMinor() {
        return minor;
    }

    void setMinor(byte minor) {
        this.minor = minor;
    }

    public byte getRevise() {
        return revise;
    }

    void setRevise(byte revise) {
        this.revise = revise;
    }
    @Override
    public final byte getType()
    {
        return 1;
    }


    public final void parse(byte[] bs){
        parse(bs,0);
    }

    public abstract void parse(byte[] bs,int offset);
}
