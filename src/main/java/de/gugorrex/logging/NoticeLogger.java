package de.gugorrex.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;
import org.codehaus.plexus.util.ExceptionUtils;

public class NoticeLogger extends QuickLoggerImplementation {

    private static final String NOTICE_LEVEL = "NOTICE";
    private static final String DEFAULT = "An error has occurred:";
    private static final String FOOTER = "See logs for further details.";
    protected final Logger logger;

    public NoticeLogger(Logger logger) {
        this.logger = logger;
    }

    public NoticeLogger(Class<?> clazz) {
        this.logger = LogManager.getLogger(clazz);
    }

    private static String formatNotice(Level level, String sneakPeak) {
        return String.format("%s\n%s\n\n%s\n\n%s\n\n", level.name(), DEFAULT, sneakPeak, FOOTER);
    }

    private static String formatNotice(Level level, String sneakPeak, Throwable throwable) {
        return formatNotice(level, sneakPeak + "\n" + throwable.getClass().getSimpleName());
    }

    private static String formatNotice(Level level, Throwable throwable) {
        return formatNotice(level, throwable.getClass().getSimpleName());
    }

    @Override
    public void catching(Level level, Throwable throwable) {
        logger.catching(level, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, throwable));
    }

    @Override
    public void catching(Throwable throwable) {
        logger.catching(throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(Level.ERROR, throwable));
    }

    /**
     * @deprecated
     */
    @Override
    public void entry() {
        logger.entry();
    }

    /**
     * @deprecated
     */
    @Override
    public void entry(Object... params) {
        logger.entry(params);
    }

    /**
     * @deprecated
     */
    @Override
    public void exit() {
        logger.exit();
    }

    /**
     * @deprecated
     */
    @Override
    public <R> R exit(R result) {
        return logger.exit(result);
    }

    @Override
    public Level getLevel() {
        return logger.getLevel();
    }

    @Override
    public <MF extends MessageFactory> MF getMessageFactory() {
        return logger.getMessageFactory();
    }

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    @Override
    public boolean isEnabled(Level level) {
        return logger.isEnabled(level);
    }

    @Override
    public boolean isEnabled(Level level, Marker marker) {
        return logger.isEnabled(level, marker);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    @Override
    public boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }

    @Override
    public boolean isFatalEnabled(Marker marker) {
        return logger.isFatalEnabled(marker);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return logger.isInfoEnabled(marker);
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return logger.isTraceEnabled(marker);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    @Override
    public void log(Level level, Marker marker, Message message) {
        logger.log(level, marker, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.getFormattedMessage()));
    }

    @Override
    public void log(Level level, Marker marker, Message message, Throwable throwable) {
        logger.log(level, marker, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.getFormattedMessage(), throwable));
    }

    @Override
    public void log(Level level, Marker marker, MessageSupplier messageSupplier) {
        logger.log(level, marker, messageSupplier);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().getFormattedMessage()));
    }

    @Override
    public void log(Level level, Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        logger.log(level, marker, messageSupplier, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().getFormattedMessage(), throwable));
    }

    @Override
    public void log(Level level, Marker marker, CharSequence message) {
        logger.log(level, marker, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString()));
    }

    @Override
    public void log(Level level, Marker marker, CharSequence message, Throwable throwable) {
        logger.log(level, marker, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString(), throwable));
    }

    @Override
    public void log(Level level, Marker marker, Object message) {
        if (message instanceof Throwable) {
            logger.log(level, marker, ExceptionUtils.getStackTrace((Throwable) message));
        } else {
            logger.log(level, marker, message);
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString()));
    }

    @Override
    public void log(Level level, Marker marker, Object message, Throwable throwable) {
        logger.log(level, marker, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString()), throwable);
    }

    @Override
    public void log(Level level, Marker marker, String message) {
        logger.log(level, marker, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message));
    }

    @Override
    protected void logObjectParams(Level level, Marker marker, String message, Object... params) {
        logger.log(level, marker, message, params);
        StringBuilder paramsString = new StringBuilder(message);
        for (Object p : params) {
            paramsString.append("\n").append(p.toString());
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, paramsString.toString()));
    }

    @Override
    protected void logSupplierParams(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
        logger.log(level, marker, message, paramSuppliers);
        StringBuilder paramsString = new StringBuilder(message);
        for (Supplier<?> s : paramSuppliers) {
            paramsString.append("\n").append(s.get().toString());
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, paramsString.toString()));
    }

    @Override
    public void log(Level level, Marker marker, String message, Throwable throwable) {
        logger.log(level, marker, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message, throwable));
    }

    @Override
    public void log(Level level, Marker marker, Supplier<?> messageSupplier) {
        logger.log(level, marker, messageSupplier);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().toString()));
    }

    @Override
    public void log(Level level, Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        logger.log(level, marker, messageSupplier, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().toString(), throwable));
    }

    @Override
    public void log(Level level, Message message) {
        logger.log(level, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.getFormattedMessage()));
    }

    @Override
    public void log(Level level, Message message, Throwable throwable) {
        logger.log(level, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.getFormattedMessage(), throwable));
    }

    @Override
    public void log(Level level, MessageSupplier messageSupplier) {
        logger.log(level, messageSupplier);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().getFormattedMessage()));
    }

    @Override
    public void log(Level level, MessageSupplier messageSupplier, Throwable throwable) {
        logger.log(level, messageSupplier, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().getFormattedMessage(), throwable));
    }

    @Override
    public void log(Level level, CharSequence message) {
        logger.log(level, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString()));
    }

    @Override
    public void log(Level level, CharSequence message, Throwable throwable) {
        logger.log(level, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString(), throwable));
    }

    @Override
    public void log(Level level, Object message) {
        if (message instanceof Throwable) {
            logger.log(level, ExceptionUtils.getStackTrace((Throwable) message));
        } else {
            logger.log(level, message);
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString()));
    }

    @Override
    public void log(Level level, Object message, Throwable throwable) {
        logger.log(level, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message.toString(), throwable));
    }

    @Override
    public void log(Level level, String message) {
        logger.log(level, message);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message));
    }

    @Override
    protected void logObjectParams(Level level, String message, Object... params) {
        logger.log(level, message, params);
        StringBuilder paramsString = new StringBuilder(message);
        for (Object p : params) {
            paramsString.append("\n").append(p.toString());
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, paramsString.toString()));
    }

    @Override
    protected void logSupplierParams(Level level, String message, Supplier<?>... paramSuppliers) {
        logger.log(level, message, paramSuppliers);
        StringBuilder paramsString = new StringBuilder(message);
        for (Supplier<?> s : paramSuppliers) {
            paramsString.append("\n").append(s.get().toString());
        }
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, paramsString.toString()));
    }

    @Override
    public void log(Level level, String message, Throwable throwable) {
        logger.log(level, message, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, message, throwable));
    }

    @Override
    public void log(Level level, Supplier<?> messageSupplier) {
        logger.log(level, messageSupplier);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().toString()));
    }

    @Override
    public void log(Level level, Supplier<?> messageSupplier, Throwable throwable) {
        logger.log(level, messageSupplier, throwable);
        logger.log(Level.getLevel(NOTICE_LEVEL), formatNotice(level, messageSupplier.get().toString(), throwable));
    }

    @Override
    public void printf(Level level, Marker marker, String format, Object... params) {
        logger.printf(level, marker, format, params);
    }

    @Override
    public void printf(Level level, String format, Object... params) {
        logger.printf(level, format, params);
    }

    @Override
    public <T extends Throwable> T throwing(Level level, T throwable) {
        return logger.throwing(level, throwable);
    }

    @Override
    public <T extends Throwable> T throwing(T throwable) {
        return logger.throwing(throwable);
    }

    @Override
    public EntryMessage traceEntry() {
        return logger.traceEntry();
    }

    @Override
    public EntryMessage traceEntry(String format, Object... params) {
        return logger.traceEntry(format, params);
    }

    @Override
    public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
        return logger.traceEntry(paramSuppliers);
    }

    @Override
    public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
        return logger.traceEntry(format, paramSuppliers);
    }

    @Override
    public EntryMessage traceEntry(Message message) {
        return logger.traceEntry(message);
    }

    @Override
    public void traceExit() {
        logger.traceExit();
    }

    @Override
    public <R> R traceExit(R result) {
        return logger.traceExit(result);
    }

    @Override
    public <R> R traceExit(String format, R result) {
        return logger.traceExit(format, result);
    }

    @Override
    public void traceExit(EntryMessage message) {
        logger.traceExit(message);
    }

    @Override
    public <R> R traceExit(EntryMessage message, R result) {
        return logger.traceExit(message, result);
    }

    @Override
    public <R> R traceExit(Message message, R result) {
        return logger.traceExit(message, result);
    }
}
