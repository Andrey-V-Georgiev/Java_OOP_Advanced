package _12_LiskovAndOCP_EX._01_Logger.implementations;

import _12_LiskovAndOCP_EX._01_Logger.interfaces.Layout;

public class XmlLayout implements Layout {
    private String dateTime;
    private  Importance importance;
    private String message;

    public XmlLayout() {
    }

    @Override
    public String addMsg(String dateTime, Importance importance, String message){
        this.dateTime = dateTime;
        this.importance = importance;
        this.message = message;
        return createMsg();
    }

    private String createMsg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<log>\n");
        sb.append(String.format("   <date>%s</date>\n", this.dateTime));
        sb.append(String.format("   <level>%s</level>\n", this.importance));
        sb.append(String.format("   <message>%s</message>\n", this.message));
        sb.append("</log>");
        return sb.toString();
    }

    @Override
    public long getMsgSize() {
        String errorMsg = createMsg();
        long msgSize = 0;
        for (Character ch : errorMsg.toCharArray()) {
            if(Character.isLetter(ch)){
                msgSize += (int) ch;
            }
        }
        return msgSize;
    }
}
