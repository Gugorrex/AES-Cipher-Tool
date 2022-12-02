package de.gugorrex.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

public abstract class QuickLoggerImplementation extends CleanParamsLogger {
    @Override
    public void debug(Marker marker, Message message) {
        log(Level.DEBUG, marker, message);
    }

    @Override
    public void debug(Marker marker, Message message, Throwable throwable) {
        log(Level.DEBUG, marker, message, throwable);
    }

    @Override
    public void debug(Marker marker, MessageSupplier messageSupplier) {
        log(Level.DEBUG, marker, messageSupplier);
    }

    @Override
    public void debug(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.DEBUG, marker, messageSupplier, throwable);
    }

    @Override
    public void debug(Marker marker, CharSequence message) {
        log(Level.DEBUG, marker, message);
    }

    @Override
    public void debug(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.DEBUG, marker, message, throwable);
    }

    @Override
    public void debug(Marker marker, Object message) {
        log(Level.DEBUG, marker, message);
    }

    @Override
    public void debug(Marker marker, Object message, Throwable throwable) {
        log(Level.DEBUG, marker, message, throwable);
    }

    @Override
    public void debug(Marker marker, String message) {
        log(Level.DEBUG, marker, message);
    }

    @Override
    public void debug(Marker marker, String message, Throwable throwable) {
        log(Level.DEBUG, marker, message, throwable);
    }

    @Override
    public void debug(Marker marker, Supplier<?> messageSupplier) {
        log(Level.DEBUG, marker, messageSupplier);
    }

    @Override
    public void debug(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.DEBUG, marker, messageSupplier, throwable);
    }

    @Override
    public void debug(Message message) {
        log(Level.DEBUG, message);
    }

    @Override
    public void debug(Message message, Throwable throwable) {
        log(Level.DEBUG, message, throwable);
    }

    @Override
    public void debug(MessageSupplier messageSupplier) {
        log(Level.DEBUG, messageSupplier);
    }

    @Override
    public void debug(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.DEBUG, messageSupplier, throwable);
    }

    @Override
    public void debug(CharSequence message) {
        log(Level.DEBUG, message);
    }

    @Override
    public void debug(CharSequence message, Throwable throwable) {
        log(Level.DEBUG, message, throwable);
    }

    @Override
    public void debug(Object message) {
        log(Level.DEBUG, message);
    }

    @Override
    public void debug(Object message, Throwable throwable) {
        log(Level.DEBUG, message, throwable);
    }

    @Override
    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    @Override
    public void debug(String message, Throwable throwable) {
        log(Level.DEBUG, message, throwable);
    }

    @Override
    public void debug(Supplier<?> messageSupplier) {
        log(Level.DEBUG, messageSupplier);
    }

    @Override
    public void debug(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.DEBUG, messageSupplier, throwable);
    }

    @Override
    public void info(Marker marker, Message message) {
        log(Level.INFO, marker, message);
    }

    @Override
    public void info(Marker marker, Message message, Throwable throwable) {
        log(Level.INFO, marker, message, throwable);
    }

    @Override
    public void info(Marker marker, MessageSupplier messageSupplier) {
        log(Level.INFO, marker, messageSupplier);
    }

    @Override
    public void info(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.INFO, marker, messageSupplier, throwable);
    }

    @Override
    public void info(Marker marker, CharSequence message) {
        log(Level.INFO, marker, message);
    }

    @Override
    public void info(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.INFO, marker, message, throwable);
    }

    @Override
    public void info(Marker marker, Object message) {
        log(Level.INFO, marker, message);
    }

    @Override
    public void info(Marker marker, Object message, Throwable throwable) {
        log(Level.INFO, marker, message, throwable);
    }

    @Override
    public void info(Marker marker, String message) {
        log(Level.INFO, marker, message);
    }

    @Override
    public void info(Marker marker, String message, Throwable throwable) {
        log(Level.INFO, marker, message, throwable);
    }

    @Override
    public void info(Marker marker, Supplier<?> messageSupplier) {
        log(Level.INFO, marker, messageSupplier);
    }

    @Override
    public void info(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.INFO, marker, messageSupplier, throwable);
    }

    @Override
    public void info(Message message) {
        log(Level.INFO, message);
    }

    @Override
    public void info(Message message, Throwable throwable) {
        log(Level.INFO, message, throwable);
    }

    @Override
    public void info(MessageSupplier messageSupplier) {
        log(Level.INFO, messageSupplier);
    }

    @Override
    public void info(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.INFO, messageSupplier, throwable);
    }

    @Override
    public void info(CharSequence message) {
        log(Level.INFO, message);
    }

    @Override
    public void info(CharSequence message, Throwable throwable) {
        log(Level.INFO, message, throwable);
    }

    @Override
    public void info(Object message) {
        log(Level.INFO, message);
    }

    @Override
    public void info(Object message, Throwable throwable) {
        log(Level.INFO, message, throwable);
    }

    @Override
    public void info(String message) {
        log(Level.INFO, message);
    }

    @Override
    public void info(String message, Throwable throwable) {
        log(Level.INFO, message, throwable);
    }

    @Override
    public void info(Supplier<?> messageSupplier) {
        log(Level.INFO, messageSupplier);
    }

    @Override
    public void info(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.INFO, messageSupplier, throwable);
    }

    @Override
    public void trace(Marker marker, Message message) {
        log(Level.TRACE, marker, message);
    }

    @Override
    public void trace(Marker marker, Message message, Throwable throwable) {
        log(Level.TRACE, marker, message, throwable);
    }

    @Override
    public void trace(Marker marker, MessageSupplier messageSupplier) {
        log(Level.TRACE, marker, messageSupplier);
    }

    @Override
    public void trace(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.TRACE, marker, messageSupplier, throwable);
    }

    @Override
    public void trace(Marker marker, CharSequence message) {
        log(Level.TRACE, marker, message);
    }

    @Override
    public void trace(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.TRACE, marker, message, throwable);
    }

    @Override
    public void trace(Marker marker, Object message) {
        log(Level.TRACE, marker, message);
    }

    @Override
    public void trace(Marker marker, Object message, Throwable throwable) {
        log(Level.TRACE, marker, message, throwable);
    }

    @Override
    public void trace(Marker marker, String message) {
        log(Level.TRACE, marker, message);
    }

    @Override
    public void trace(Marker marker, String message, Throwable throwable) {
        log(Level.TRACE, marker, message, throwable);
    }

    @Override
    public void trace(Marker marker, Supplier<?> messageSupplier) {
        log(Level.TRACE, marker, messageSupplier);
    }

    @Override
    public void trace(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.TRACE, marker, messageSupplier, throwable);
    }

    @Override
    public void trace(Message message) {
        log(Level.TRACE, message);
    }

    @Override
    public void trace(Message message, Throwable throwable) {
        log(Level.TRACE, message, throwable);
    }

    @Override
    public void trace(MessageSupplier messageSupplier) {
        log(Level.TRACE, messageSupplier);
    }

    @Override
    public void trace(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.TRACE, messageSupplier, throwable);
    }

    @Override
    public void trace(CharSequence message) {
        log(Level.TRACE, message);
    }

    @Override
    public void trace(CharSequence message, Throwable throwable) {
        log(Level.TRACE, message, throwable);
    }

    @Override
    public void trace(Object message) {
        log(Level.TRACE, message);
    }

    @Override
    public void trace(Object message, Throwable throwable) {
        log(Level.TRACE, message, throwable);
    }

    @Override
    public void trace(String message) {
        log(Level.TRACE, message);
    }

    @Override
    public void trace(String message, Throwable throwable) {
        log(Level.TRACE, message, throwable);
    }

    @Override
    public void trace(Supplier<?> messageSupplier) {
        log(Level.TRACE, messageSupplier);
    }

    @Override
    public void trace(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.TRACE, messageSupplier, throwable);
    }

    @Override
    public void warn(Marker marker, Message message) {
        log(Level.WARN, marker, message);
    }

    @Override
    public void warn(Marker marker, Message message, Throwable throwable) {
        log(Level.WARN, marker, message, throwable);
    }

    @Override
    public void warn(Marker marker, MessageSupplier messageSupplier) {
        log(Level.WARN, marker, messageSupplier);
    }

    @Override
    public void warn(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.WARN, marker, messageSupplier, throwable);
    }

    @Override
    public void warn(Marker marker, CharSequence message) {
        log(Level.WARN, marker, message);
    }

    @Override
    public void warn(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.WARN, marker, message, throwable);
    }

    @Override
    public void warn(Marker marker, Object message) {
        log(Level.WARN, marker, message);
    }

    @Override
    public void warn(Marker marker, Object message, Throwable throwable) {
        log(Level.WARN, marker, message, throwable);
    }

    @Override
    public void warn(Marker marker, String message) {
        log(Level.WARN, marker, message);
    }

    @Override
    public void warn(Marker marker, String message, Throwable throwable) {
        log(Level.WARN, marker, message, throwable);
    }

    @Override
    public void warn(Marker marker, Supplier<?> messageSupplier) {
        log(Level.WARN, marker, messageSupplier);
    }

    @Override
    public void warn(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.WARN, marker, messageSupplier, throwable);
    }

    @Override
    public void warn(Message message) {
        log(Level.WARN, message);
    }

    @Override
    public void warn(Message message, Throwable throwable) {
        log(Level.WARN, message, throwable);
    }

    @Override
    public void warn(MessageSupplier messageSupplier) {
        log(Level.WARN, messageSupplier);
    }

    @Override
    public void warn(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.WARN, messageSupplier, throwable);
    }

    @Override
    public void warn(CharSequence message) {
        log(Level.WARN, message);
    }

    @Override
    public void warn(CharSequence message, Throwable throwable) {
        log(Level.WARN, message, throwable);
    }

    @Override
    public void warn(Object message) {
        log(Level.WARN, message);
    }

    @Override
    public void warn(Object message, Throwable throwable) {
        log(Level.WARN, message, throwable);
    }

    @Override
    public void warn(String message) {
        log(Level.WARN, message);
    }

    @Override
    public void warn(String message, Throwable throwable) {
        log(Level.WARN, message, throwable);
    }

    @Override
    public void warn(Supplier<?> messageSupplier) {
        log(Level.WARN, messageSupplier);
    }

    @Override
    public void warn(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.WARN, messageSupplier, throwable);
    }

    @Override
    public void error(Marker marker, Message message) {
        log(Level.ERROR, marker, message);
    }

    @Override
    public void error(Marker marker, Message message, Throwable throwable) {
        log(Level.ERROR, marker, message, throwable);
    }

    @Override
    public void error(Marker marker, MessageSupplier messageSupplier) {
        log(Level.ERROR, marker, messageSupplier);
    }

    @Override
    public void error(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.ERROR, marker, messageSupplier, throwable);
    }

    @Override
    public void error(Marker marker, CharSequence message) {
        log(Level.ERROR, marker, message);
    }

    @Override
    public void error(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.ERROR, marker, message, throwable);
    }

    @Override
    public void error(Marker marker, Object message) {
        log(Level.ERROR, marker, message);
    }

    @Override
    public void error(Marker marker, Object message, Throwable throwable) {
        log(Level.ERROR, marker, message, throwable);
    }

    @Override
    public void error(Marker marker, String message) {
        log(Level.ERROR, marker, message);
    }

    @Override
    public void error(Marker marker, String message, Throwable throwable) {
        log(Level.ERROR, marker, message, throwable);
    }

    @Override
    public void error(Marker marker, Supplier<?> messageSupplier) {
        log(Level.ERROR, marker, messageSupplier);
    }

    @Override
    public void error(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.ERROR, marker, messageSupplier, throwable);
    }

    @Override
    public void error(Message message) {
        log(Level.ERROR, message);
    }

    @Override
    public void error(Message message, Throwable throwable) {
        log(Level.ERROR, message, throwable);
    }

    @Override
    public void error(MessageSupplier messageSupplier) {
        log(Level.ERROR, messageSupplier);
    }

    @Override
    public void error(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.ERROR, messageSupplier, throwable);
    }

    @Override
    public void error(CharSequence message) {
        log(Level.ERROR, message);
    }

    @Override
    public void error(CharSequence message, Throwable throwable) {
        log(Level.ERROR, message, throwable);
    }

    @Override
    public void error(Object message) {
        log(Level.ERROR, message);
    }

    @Override
    public void error(Object message, Throwable throwable) {
        log(Level.ERROR, message, throwable);
    }

    @Override
    public void error(String message) {
        log(Level.ERROR, message);
    }

    @Override
    public void error(String message, Throwable throwable) {
        log(Level.ERROR, message, throwable);
    }

    @Override
    public void error(Supplier<?> messageSupplier) {
        log(Level.ERROR, messageSupplier);
    }

    @Override
    public void error(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.ERROR, messageSupplier, throwable);
    }

    @Override
    public void fatal(Marker marker, Message message) {
        log(Level.FATAL, marker, message);
    }

    @Override
    public void fatal(Marker marker, Message message, Throwable throwable) {
        log(Level.FATAL, marker, message, throwable);
    }

    @Override
    public void fatal(Marker marker, MessageSupplier messageSupplier) {
        log(Level.FATAL, marker, messageSupplier);
    }

    @Override
    public void fatal(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.FATAL, marker, messageSupplier, throwable);
    }

    @Override
    public void fatal(Marker marker, CharSequence message) {
        log(Level.FATAL, marker, message);
    }

    @Override
    public void fatal(Marker marker, CharSequence message, Throwable throwable) {
        log(Level.FATAL, marker, message, throwable);
    }

    @Override
    public void fatal(Marker marker, Object message) {
        log(Level.FATAL, marker, message);
    }

    @Override
    public void fatal(Marker marker, Object message, Throwable throwable) {
        log(Level.FATAL, marker, message, throwable);
    }

    @Override
    public void fatal(Marker marker, String message) {
        log(Level.FATAL, marker, message);
    }

    @Override
    public void fatal(Marker marker, String message, Throwable throwable) {
        log(Level.FATAL, marker, message, throwable);
    }

    @Override
    public void fatal(Marker marker, Supplier<?> messageSupplier) {
        log(Level.FATAL, marker, messageSupplier);
    }

    @Override
    public void fatal(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.FATAL, marker, messageSupplier, throwable);
    }

    @Override
    public void fatal(Message message) {
        log(Level.FATAL, message);
    }

    @Override
    public void fatal(Message message, Throwable throwable) {
        log(Level.FATAL, message, throwable);
    }

    @Override
    public void fatal(MessageSupplier messageSupplier) {
        log(Level.FATAL, messageSupplier);
    }

    @Override
    public void fatal(MessageSupplier messageSupplier, Throwable throwable) {
        log(Level.FATAL, messageSupplier, throwable);
    }

    @Override
    public void fatal(CharSequence message) {
        log(Level.FATAL, message);
    }

    @Override
    public void fatal(CharSequence message, Throwable throwable) {
        log(Level.FATAL, message, throwable);
    }

    @Override
    public void fatal(Object message) {
        log(Level.FATAL, message);
    }

    @Override
    public void fatal(Object message, Throwable throwable) {
        log(Level.FATAL, message, throwable);
    }

    @Override
    public void fatal(String message) {
        log(Level.FATAL, message);
    }

    @Override
    public void fatal(String message, Throwable throwable) {
        log(Level.FATAL, message, throwable);
    }

    @Override
    public void fatal(Supplier<?> messageSupplier) {
        log(Level.FATAL, messageSupplier);
    }

    @Override
    public void fatal(Supplier<?> messageSupplier, Throwable throwable) {
        log(Level.FATAL, messageSupplier, throwable);
    }
}
