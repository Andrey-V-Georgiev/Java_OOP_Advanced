package _12_LiskovAndOCP_EX._01_Logger.implementations;

import _12_LiskovAndOCP_EX._01_Logger.interfaces.Layout;

public class SimpleLayout implements Layout {
    private String dateTime;
    private  Importance importance;
    private String message;

    public SimpleLayout() {
    }

    public String addMsg(String dateTime, Importance importance, String message){
        this.dateTime = dateTime;
        this.importance = importance;
        this.message = message;
        return createMsg();
    }

    private String createMsg() {
        return String.format("%s - %s - %s", this.dateTime, this.importance, this.message);
    }

    public long getMsgSize(){
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
