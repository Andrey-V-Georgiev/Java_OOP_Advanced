package _12_LiskovAndOCP_EX._01_Logger.implementations;

import _12_LiskovAndOCP_EX._01_Logger.interfaces.Appender;
import _12_LiskovAndOCP_EX._01_Logger.interfaces.Layout;

public class FileAppender implements Appender {
    private String appenderType = "FileAppender";
    private Layout layout;
    private Importance importance;
    private int messagesAppended = 0;
    private long sizeAllMsg;

    public FileAppender(Layout layout) {
        this.layout = layout;
        this.importance = Importance.INFO;
    }

    public FileAppender(Layout layout, Importance importance) {
        this.layout = layout;
        this.importance = importance;
    }

    public void addMessage(String dateTime, Importance importance, String message) {
        if (this.importance.compareTo(importance) <= 0) {
            this.messagesAppended++;
            layout.addMsg(dateTime, importance, message);
            this.sizeAllMsg += layout.getMsgSize();
        }
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d, File size: %d",
                this.appenderType, this.layout.getClass().getSimpleName(), this.importance, this.messagesAppended, this.sizeAllMsg);
    }
}
